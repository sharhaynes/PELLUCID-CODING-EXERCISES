import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {

        // lookup table from the website for the binary string equivalent
        String[] HEX_BITS = {
            "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };

        //CREATE A NEW SCANNER OBJECT
        Scanner scanner = new Scanner(System.in);

        //USER ENTERS A HEXADECIMAL STRING
        System.out.print("Enter a Hexadecimal string: ");
        String hexString = scanner.nextLine();

        String result = "";


    for (int i = 0; i < hexString.length(); i++) {
    char hexChar = hexString.charAt(i);

    // convert the hex character to its binary string
    String binaryString = "";

    //switch case used to map every hexa digit to a resective binary code
    switch (hexChar) {
        case '0': binaryString = "0000"; break;
        case '1': binaryString = "0001"; break;
        case '2': binaryString = "0010"; break;
        case '3': binaryString = "0011"; break;
        case '4': binaryString = "0100"; break;
        case '5': binaryString = "0101"; break;
        case '6': binaryString = "0110"; break;
        case '7': binaryString = "0111"; break;
        case '8': binaryString = "1000"; break;
        case '9': binaryString = "1001"; break;
        case 'a': binaryString = "1010"; break;
        case 'b': binaryString = "1011"; break;
        case 'c': binaryString = "1100"; break;
        case 'd': binaryString = "1101"; break;
        case 'e': binaryString = "1110"; break;
        case 'f': binaryString = "1111"; break;
    }

    result += binaryString;

    // add a space between each group of 4 bits
    if (i < hexString.length() - 1) {
        result += " ";
    }
}

        // print the result
        System.out.println("The equivalent binary for hexadecimal \"" + hexString + "\" is: " + result);

        // close the scanner
        scanner.close();
    }
}
