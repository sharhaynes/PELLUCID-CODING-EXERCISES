//a scanner class to get and utilize the  user input

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        //declare teh variables
        int items[];
        int NUM_ITEMS;

         // create a scanner object for the user input
        Scanner scanner = new Scanner(System.in);

        //prompt to get user input
        System.out.println("please enter the number of items: ");
        NUM_ITEMS = scanner.nextInt(); //use scanner class to have the number go into the int variable

        items = new int[NUM_ITEMS]; 
        
        //if the length fo the array > 0, enter array values
        if (items.length > 0) {
        System.out.println("please enter the value of all items (separated by space): ");

        //a for loop to iterate the input value into the array
        for (int i = 0; i < items.length; i++) {
            items[i] = scanner.nextInt();
        }
        }



  System.out.print("The values are: [");
  for (int i = 0; i < items.length; ++i) {
      System.out.print((i == 0) ? items[i] : ", " + items[i]); 
  }
  System.out.println("]");

  // Close the scanner
  scanner.close();
}
    }
