// This program is a web crawler 

package newPackage;
import java.util.Scanner;
import java.util.ArrayList;

public class WebCrawler 
  {
  public static void main(String[] args) 
  {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a desired URL: ");
    String url = input.nextLine(); 
    crawl(url); // Traverse the Web from the a starting url
  }

  public static void crawl(String startURL) 
  {
    ArrayList<String> listOfPendURLs = new ArrayList<>();
    ArrayList<String> listOfTravURLs = new ArrayList<>();
    
    listOfPendURLs.add(startURL);

    while (!listOfPendURLs.isEmpty() && 
        listOfTravURLs.size() <= 100) {
      String urlString = listOfPendURLs.remove(0);

      if (!listOfTravURLs.contains(urlString)) {
        listOfTravURLs.add(urlString);
        System.out.println("Craw " + urlString);

        for (String s: getSubURLs(urlString)) {
          if (!listOfTravURLs.contains(s))
            listOfPendURLs.add(s);
        }
      }
    }
  }
  
  public static ArrayList<String> getSubURLs(String urlString) {
    ArrayList<String> list = new ArrayList<>();
    
    try {
      java.net.URL url = new java.net.URL(urlString); 
      Scanner input = new Scanner(url.openStream());
      int current = 0;

      while (input.hasNext()) {
        String line = input.nextLine();
        current = line.indexOf("http:", current);

        while (current > 0) {
          int endIndex = line.indexOf("\"", current);

          if (endIndex > 0) { // Ensure that a correct URL is found
            list.add(line.substring(current, endIndex)); 
            current = line.indexOf("http:", endIndex);
          }
          else 
            current = -1;
        }
      } 
    }
    catch (Exception ex) {
      System.out.println("Error: " + ex.getMessage());
    }
    
    return list;
  }
}