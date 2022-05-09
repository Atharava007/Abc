import java.util.Scanner;
import java.io.*;

class GFG {

    // this method sort the string array lexicographically.
    public static void sortLexicographically(String strArr[]) {
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].compareToIgnoreCase(strArr[j]) > 0) {
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }
    }

    // this function prints the array passed as argument
    public static void printArray(String strArr[]) {
        for (String string : strArr)
            System.out.print(string + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Asking the user for array size
        System.out.println("Enter the array size : ");
        int n = scan.nextInt();
        // Initializing String array.
        String stringArray[] = new String[n];

        System.out.println("Enter the array elements : ");
        // Takes the string as input from the user
        for (int i = 0; i < n; i++) {
            stringArray[i] = scan.next();
        }
        // sorting String array lexicographically.
        sortLexicographically(stringArray);

        printArray(stringArray);
    }
}