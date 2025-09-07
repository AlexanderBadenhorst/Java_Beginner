package HangmanGame;

import java.util.Scanner;

/**
 * GameHelper is a small utility class that handles
 * user interaction with the console.
 *
 * Concepts shown:
 * - Encapsulation (scanner hidden inside this class)
 * - Input validation (loops until a valid letter is entered)
 * - Methods to separate concerns (App doesn’t handle raw input directly)
 */
class GameHelper {
    // Scanner reads user input from the console.
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Prompts the player to enter a single letter.
     * - Uses a while loop to validate input
     * - Converts input to lowercase for consistency
     *
     * @param prompt message displayed to the player
     * @return the first valid letter entered
     */
    public char promptLetter(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();

            if (line != null && !line.isBlank()) {
                // take the first non-space character
                char c = line.trim().toLowerCase().charAt(0);

                // validate it's actually a letter
                if (Character.isLetter(c)) return c;
            }
            System.out.println("Please enter a letter (a-z).");
        }
    }

    /**
     * Prints a line of text to the console.
     * Helps keep all console output in one place.
     */
    public void println(String s) {
        System.out.println(s);
    }

    /**
     * Closes the scanner when the game ends.
     * (Good habit: free resources when done)
     */
    public void close() {
        scanner.close();
    }
}
