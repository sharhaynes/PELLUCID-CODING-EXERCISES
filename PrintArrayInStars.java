import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        // Declare variables
        final int NUM_ITEMS;
        int items []; //declare array name

        // create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        //prompt user for the num of items like in printarray
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = scanner.nextInt(); //use scanner class method

        items = new int[NUM_ITEMS]; 

         // prompt for the values of all items
        System.out.print("Enter the value of all items: ");
        for (int i = 0; i < NUM_ITEMS; i++) {
            items[i] = scanner.nextInt();
        }

         // use the numbers in the array and print it out in the form of stars
         for (int idx = 0; idx < items.length; idx++) {  // Iiterate over the array
            System.out.print(idx + ": ");

             for (int starNo = 1; starNo <= items[idx]; starNo++) { //column
                System.out.print("*");
            }

            System.out.println("(" + items[idx] + ")");
        }

         // Close the scanner
        scanner.close();
    }
    }

