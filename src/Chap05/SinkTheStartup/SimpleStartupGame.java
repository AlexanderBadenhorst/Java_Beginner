// Page 110
package Chap05.SinkTheStartup;

public class SimpleStartupGame {
    public static void main(String[] args) {
        // Track how many guesses the player makes
        int numOfGuesses = 0;

        // Create a GameHelper object (used to get input from the user)
        GameHelper helper = new GameHelper();

        // Create the SimpleStartup object (the "ship" the player will try to sink)
        SimpleStartup theStartup = new SimpleStartup();

        // Pick a random starting position for the ship (between 0 and 4)
        int randomNum = (int) (Math.random() * 5);

        // Place the ship in 3 consecutive cells on the grid
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theStartup.setLocationCells(locations);

        // Keep track of whether the ship is still "alive"
        boolean isAlive = true;

        // Game loop: keep asking for guesses until the ship is sunk
        while (isAlive) {
            // Ask the user for a guess
            int guess = helper.getUserInput("enter a number");

            // Check the guess against the ship’s location
            String result = theStartup.checkYourself(guess);

            // Increase the number of guesses
            numOfGuesses++;

            // If the result was "kill", the ship is sunk → end the game
            if (result.equals("kill")) {
                isAlive = false; // exit the loop
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
//Key points:
//
//GameHelper handles user input (keyboard entry).
//
//SimpleStartup is the game object (the “ship”).
//
//Random placement ensures each game is different.
//
//Loop → game keeps running until the ship is sunk ("kill").
//
//Guess counter tracks how many tries the player needed.
