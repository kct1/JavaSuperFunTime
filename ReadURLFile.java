// This program reads character total in a file from a URL

package newPackage;
import java.util.Scanner;

public class ReadURLFile {
  public static void main(String[] args) {
    System.out.print("Please enter a URL: ");   
    String URLstr = new Scanner(System.in).next();
       
    try {
      java.net.URL url = new java.net.URL(URLStr); 
      int count = 0;
      Scanner input = new Scanner(url.openStream());
      while (input.hasNext()) {
        String line = input.nextLine();
        count += line.length();
      } 
      
      System.out.println("The total file size is " + count + " characters");
    }
    catch (java.net.MalformedURLException e) 
    {
      System.out.println("Invalid URL");
    }
    catch (java.io.IOException e) 
    {
      System.out.println("IO Errors");
    }
  } // end of main class
} // end of class   
