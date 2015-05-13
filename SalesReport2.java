//*********************************************************
// This program demonstrates how exception handlers can   *
// be used to recover from errors.                        *
//*********************************************************
package newPackage;
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SalesReport2
{
   public static void main(String[] args)
   {
      // File name
      String filename = "CompanyData.txt"; 
      // To hold input from file
      String input;  
      // Months counter          
      int months = 0;      
      // Total sales accumulator     
      double totalSalesAmount = 0.0;  
      // Average sales
      double avgSales;      

      // Create a DecimalFormat object for formatting.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      // Open the file and get a FileReader object.
      FileReader reader = openFile(filename);

      // Create a BufferedReader object.     
      BufferedReader inputFile =
                     new BufferedReader(reader);

      // Process file contents.
      try
      {
         // Read a line from the file.
         input = inputFile.readLine();
         
         // line is read and process it.
         while (input != null)
         {
            // Try to convert the data to a double
            // and count it.
            try
            {
               totalSalesAmount += Double.parseDouble(input);
               months++;
            }
            catch(NumberFormatException e)
            {
               // Non-numeric data was encountered.
               System.out.println("Non-numeric data " +
                           "encountered in the file:" +
                           e.getMessage());

               System.out.println("The invalid record " +
                                  "will be skipped.");
            }
            
            // Read next line from file.
            input = inputFile.readLine();
         }

         // Close file.
         inputFile.close();

         // Calculate the avg.
         avgSales = totalSalesAmount / months;

         // Display results.
         System.out.println("Number of months: " + months);
         System.out.println("Total Sales: $" + 
                            dollar.format(totalSalesAmount));
         System.out.println("Average Sales: $" +
                          dollar.format(avgSales));
      }
      catch(IOException e)
      {
         // An error occured whild reading the file.
         System.out.println("I/O Error: " +
                            e.getMessage());
      }
   }

   //*************************************************************
   // The openFile method opens the file with the name specified *
   // by the argument. A reference to a FileReader object is     *
   // returned. If the file does not exist, another file name is *
   // asked for.                                                 *
   //*************************************************************

   public static FileReader openFile(String filename)
   {
      // reference FileReader object.
      FileReader fr = null;   
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      while (fr == null)
      {
         try
         {
            // try to open the file.
            fr = new FileReader(filename);
         }
         catch(FileNotFoundException e)
         {
            // The file was not found, try another
            System.out.println("ERROR: The file " + 
                       filename + " does not exist.");
            System.out.print("Enter another file name: ");
            filename = keyboard.nextLine();
         }
      }

      // Return a reference to the FileReader object.
      return fr;
   }
}
