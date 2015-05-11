/*******************************************************************************
 * Kyle T                                                                      *
 * Spending Spree                                                              * 
 * Imagine that you have wont a $200 gift certificate in a contest. You must   *
 * For this code i do cite Oracle javadocs, Introduction to Java Programming   *
 * the money in a particular store, but you can but at most only three items.  *
 * The stores computer tracks the amount of money you have left to spend as    *
 * well as the number of items you have bought. Each time you choose an item,  *
 * the computer will tell you whether you can buy it. Write a program to keep  * 
 * track of your spending spree. You will continue buying as long as you have  *
 * enough money and have bought fewer than four items. You should used named   *
 * constant for both the amount of the gift certificate, and the maximum       *
 * number of items you can purchase.                                           *
 * Comprehensive 10th edition by Y. Daniel Liang.                              *     
 ******************************************************************************/

package insertPackageNameHere;

import java.util.Scanner;

public class SpendingSpree 
    {
        public static final int Gift_Certificate = 200;
        public static final int Item_Limit = 4;
        public static void main (String [] args)
    {
        // The print lines below create a header and instructions for the user
        System.out.println("***************************************************");
        System.out.println(" Congratulations Best Buy Rewards Contest Winner!");
        System.out.println("***************************************************");
        System.out.println(" Here are a few items we thought you'd like:");
        System.out.println("     - James Taylor Box Set: $75");
        System.out.println("     - Beats by Dre Headphones: $99");
        System.out.println("     - iPhone 6 protective case: $20");
        System.out.println("     - PNY 16GB Metal Flash Drive: $15");
        System.out.println("***************************************************");
        System.out.println("    Please follow the prompt below for purchase");
        System.out.println("***************************************************");
        
        // Creating a scanner object and declaring variables. 
        Scanner keyboard = new Scanner (System.in);
        boolean moneyInHand = true;
        int amountLeft = Gift_Certificate; 
        int totalSpent = 0; 
        int itemNumber = 1; 
        while (moneyInHand && (itemNumber <= Item_Limit))
        {
            // the following prompt the user to enter the required data. 
           System.out.println("You may purchase up to " + (Item_Limit - itemNumber +1) +
                   " items");
           System.out.println("Your purchases can not exceed $ " +
                   amountLeft);
           System.out.println("Please enter the cost of item #" + itemNumber +
                   ": $");
           int itemCost = keyboard.nextInt();
           if (itemCost <= amountLeft)
           {
               System.out.println("You may purchase this item. ");
               totalSpent = totalSpent + itemCost;
               System.out.println("You've spent $" + totalSpent + " so far.");
               amountLeft = Gift_Certificate - totalSpent;
               if (amountLeft > 0)
                   itemNumber++;
               else
               {
                   System.out.println("You are out of money.");
                   moneyInHand = false;
                   
               }//end of nested else statement
           }//end of if statement
           else 
               System.out.println("You cannot by that item.");
        }//end of while loop
        System.out.println("You spent $" + totalSpent +
                ", and are done shopping. Thank you!");
    }//End of main void 
}//End of class SpendingSpree
