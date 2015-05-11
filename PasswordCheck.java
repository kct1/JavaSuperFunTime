/* Kyle T
 * This program utilizes methods to check a user-entered password and print out 
 * either "valid" or "invalid". These rules apply: 1. The password must be at 
 * at least 5 characters long, but not longer than 8 characters. 2. Password 
 * must consist of only letters(upper,lower,or combo), digits, and the special 
 * characters from the following set: !, @, #, $, %, ^, &, and *. 3. Password
 * must contain at least one digit, at least one letter, and at least one 
 * special character from the set defined in point about. 
 */

package lab6h;
import java.util.Scanner;

public class PasswordCheck {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Create a password the consists of 5-8 characters."+"\n"+
    "Must contain at least one letter, digit and symbol: ! @ # $ % ^ & *"+"\n");
    //prompt user to user to enter a password. 
    System.out.println("Please enter a password: ");
    String password = input.next();//initializing and assign string for passwords
    //string named password and user input
   
boolean validDig;
    validDig = digit(password);  //return whether password digit is true or false
boolean validChr;
    validChr = character(password);  //return whether password character is true or false
boolean validSpc;
    validSpc = special(password);  //return whether password spec. sym. is true or false
boolean validLen;
    validLen = length(password);  //return whether password length is true or false   
    
    if ((validDig == true) && (validChr == true) && (validSpc == true) && (validLen == true)) {
        System.out.println("You have a valid password");
    }
    else {
       System.out.println("You entered a invalid password.\n"); 
   } 
 }
    //tests validity of the digits inputed.
    public static boolean digit(String password) {
      boolean validDig = false;
        for(int i = 0; i < password.length(); i++){ 
            char result = password.charAt(i);
            if (!Character.isDigit(result)){
                validDig = false; }
            else {
                validDig = true;
                  }
        }
          return validDig;
    }
    //tests the validity of the letters inputed.
    public static boolean character(String password) {
        boolean validChr = false; 
             for(int i = 0; i < password.length(); i++){ 
                char result = password.charAt(i);
                if(!Character.isLetter(result)){
                    validChr = false; }
                else {
                    validChr = true;
                }
            }
          return validChr;
    }
    //test the validity of the special symbols. 
    public static boolean special(String password) {
         boolean validSpc = false; 
             for(int i = 0; i < password.length(); i++){ 
                char r = password.charAt(i);
   //the special characters from the following set: !, @, #, $, %, ^, &, and *.
                if (r == '!' || r == '@' || r == '#' || r == '$' || r == '%' ||
                    r == '^' || r == '*'){
                    validSpc = true;
                }
                else {
                    validSpc = false;
                }
            }
             return validSpc;         
    } 
    //tests validity of password length 
    public static boolean length(String password)  {
        boolean validLen;
            if (password.length() > 8) {
                validLen = false;
            }
            else if (password.length() < 5) {
                validLen = false; 
            } 
            else {
                validLen = true; 
            }
            return validLen;
    }
            
} //brace closes class Tuczynski_problem1
   