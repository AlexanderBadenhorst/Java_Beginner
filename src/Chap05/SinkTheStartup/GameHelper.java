// Page 112
package Chap05.SinkTheStartup;

import java.util.Scanner; // import Scanner for reading user input

public class GameHelper {

    // Method to get input from the user
    public int getUserInput(String prompt) {
        // Print the prompt message to the console (e.g., "enter a number: ")
        System.out.print(prompt + ": ");

        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Read the next integer the user types and return it
        return scanner.nextInt();
    }
}
//Key points:
//
//Scanner is used to read user input from the console.
//
//Prompt message → tells the user what to enter.
//
//nextInt() → reads the user’s number (an int).
//
//Return value → the number goes back to the calling code (like in SimpleStartupGame).