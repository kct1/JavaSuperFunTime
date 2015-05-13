//*********************************************************
// This program demonstrates how multiple exceptions can  *
// be caught with one try statement.                      *
//*********************************************************
package newPackage;
import java.text.DecimalFormat;
import java.io.*;

public class SalesReport
{
   public static void main(String[] args)
   {
      String filename = "Sales.txt"; // File name
      String input;             // To hold input from file
      int months = 0;           // Months counter
      double totalSalesAmount = 0.0;  // Total sales accumulator
      double avgSales;      // Average sales

      try
      {
         // Open the file.
         FileReader reader = 
                      new FileReader(filename);
         BufferedReader inputFile = 
                      new BufferedReader(reader);

         // Read the contents of the file and 
         // accumulate the sales data.
         input = inputFile.readLine();
         while (input != null)
         {
            months++;
            totalSalesAmount += Double.parseDouble(input);
            input = inputFile.readLine();
         }

         // Close the file.
         inputFile.close();

         // Calculate the average.
         avgSales = totalSalesAmount / months;

         // Create a DecimalFormat object to format output.
         DecimalFormat dollar =
                        new DecimalFormat("#,##0.00");

         // Display the results.
         System.out.println("Number of months: " + months);
         System.out.println("Total Sales: $" + dollar.format(totalSalesAmount));
         System.out.println("Average Sales: $" + dollar.format(avgSales));
      }
      catch(FileNotFoundException e)
      {
         // The file was not found.
         System.out.println(filename + " does not exist.");
      }
      catch(IOException e)
      {
         // An I/O error occured.
         System.out.println("I/O Error: " + e.getMessage());
      }
      catch(NumberFormatException e)
      {
         // Could not convert data to a double.
         System.out.println("Non-numeric data " +
                            "found in the file:" +
                            e.getMessage());
      }
   }
}
