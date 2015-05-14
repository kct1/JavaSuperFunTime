// kct 2015
// this program demos modifying arraylists

package newpackage;
import java.util.ArrayList;

public class Doors
{
  // stores and then modifies array 
   public static void main (String[] args)
   {
      ArrayList<String> band = new ArrayList<>();

      band.add ("Ray");
      band.add ("Robby");
      band.add ("Simon");
      band.add ("John");

      System.out.println (band);

      int location = band.indexOf ("Simon");
      band.remove (location);

      System.out.println (band);
      System.out.println ("At index 1: " + band.get(1));

      band.add (3, "Jim");

      System.out.println (band);
      System.out.println ("Size of the Doors: " + band.size());
   }
}
