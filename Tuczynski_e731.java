/* Kyle C. Tuczynski
 * This is a test program that prompts the user the enter two sorted lists and 
 * displays the merged list. The first number in the input indicate the number 
 * the elements in the list. This number is not part of the list
 * To do this this program is use the method public static int[] merge(int[] 
 * list1, int[] list2).
 */
package Lab7H;
import java.util.Scanner;
public class Tuczynski_e731 {
     public static void mergeSort(int[] list) {
    if (list.length > 1) {
      // Merge sort the first half
      int[] firstHalf = new int[list.length / 2];
      System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
      mergeSort(firstHalf);

      // Merge sort the second half
      int secondHalfLength = list.length - list.length / 2;
      int[] secondHalf = new int[secondHalfLength];
      System.arraycopy(list, list.length / 2,
        secondHalf, 0, secondHalfLength);
      mergeSort(secondHalf);

      // Merge firstHalf with secondHalf into list
      merge(firstHalf, secondHalf, list);
    }
  }

  /** Merge two sorted lists */
  public static void merge(int[] list1, int[] list2) {
    int index1 = 0; // Current index in list1
    int index2 = 0; // Current index in list2
    int j = 0; 

    while (index1 < list1.length && index2 < list2.length) {
      if (list1[index1] < list2[j])
        [current3++] = list1[index1++];
      else
        [current3++] = list2[index2++];
    }

    while (index1 < list1.length)
        [current3++] = list1[index1++];

    while (index2 < list2.length)
        [current3++] = list2[index2++];
  }
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] list = {};
    mergeSort(list);
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }
}
    

