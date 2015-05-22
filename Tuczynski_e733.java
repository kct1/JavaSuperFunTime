/* Kyle C. Tuczynski
 * Culture: Chinese Zodiac. This program is a uses an array of 
 * strings to store the animal names. 
 */
package Lab7H;
import java.util.Scanner;

public class Tuczynski_e733 {
    public static void main(String[] args) {
    // Declaring variables 
    Scanner input = new Scanner(System.in);
    int year;
    int zodiac;
    // Getting input from the user. 
    System.out.print("Enter a year: ");
    //Using the user input (year) to calculate corresponding Zodiac character.
    year = input.nextInt();
    zodiac = year % 12;
    //Declaring and creating a string array. 
    String[] zodiacChars = {"Monkey","Rooster","Dog","Pig","Rat","Ox","Tiger",
                            "Rabbit","Dragon","Snake","Horse","Ram"};
    /* Displaying the corresponding zodiac character from array based on 
    user input.*/
    System.out.println(year + " is the year of the " + zodiacChars[zodiac]);
    } //end of void main
} //end of class Tuczynski_e733
