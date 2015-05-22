/* Kyle C. Tuczynski
 * Dr. Andrey Puretskiy
 * CSIT 1510
 * Exercise 7.23, Page 281. 
 * This program finds, answers and displays all the open lockers numbers with 
 * one space. The number of students is 100 and the number of lockers is 100.
 * We start by having all the lockers closed. Beginning with student #1 
 *  and locker #1 proceeded by student 2 and locker 2 and so on up to 100. 
 * when this process is completed the output will show the lockers that are open
 */
package Lab7H;

public class Tuczynski_e723 {
    public static void main(String[] args) {
        /** boolean sets the lockers to closed and false to start **/
        boolean numberOfLockers [] = new boolean [101];
        /** loop for total number of lockers **/
        for(int i = 1; i <= 100; i++){ 
            /** loop for total number of students **/
            for (int j = i; j <= 100; j++) { 
            
            if  ((j%i) == 0)
                
            numberOfLockers [j] = ! numberOfLockers [j];
            
            } //end of if statement
        }//end of outter forloop
        /** loop counts and prints the "true" open lockers **/
        for(int i = 0; i < 101; i++)
        
        if (numberOfLockers[i] == true)
          
        System.out.print((i)+" ");	
  
    } //end of void main
} //end of class Tuczynski_e723 
