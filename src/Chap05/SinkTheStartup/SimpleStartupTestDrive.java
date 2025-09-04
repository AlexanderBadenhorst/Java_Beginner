// Page 106
package Chap05.SinkTheStartup;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        // Create a new SimpleStartup object
        SimpleStartup dot = new SimpleStartup();

        // Set the location of the "ship" (the cells it occupies on the grid)
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        // Simulate a user guess (pretend the player guessed position 2)
        int userGuess = 2;

        // Check the guess against the ship’s location
        // The method will return "hit", "miss", or maybe "kill"
        String result = dot.checkYourself(userGuess);

        // By default, assume the test failed
        String testResult = "failed";

        // If the result was "hit", then the test passed
        if (result.equals("hit")) {
            testResult = "passed";
        }

        // Print out whether the test passed or failed
        System.out.println(testResult);
    }
}
//Key points:
//
//Object creation → dot is the game piece (the "ship").
//
//Location → the ship is placed at cells 2, 3, 4.
//
//Guess → user tries 2.
//
//Check → the program compares guess with ship’s location.
//
//Test logic → if it returns "hit", then we know our method works.


class SimpleStartup {
    // Instance variables
    private int[] locationCells; // stores the positions of the "ship" on the grid
    private int numOfHits = 0;   // counts how many times the ship has been hit

    // Setter method to place the ship on the grid
    public void setLocationCells(int[] locs) {
        locationCells = locs; // assign the array of locations
    }

    // Method to check if the user's guess hits the ship
    public String checkYourself(int guess) {
        String result = "miss"; // default outcome is "miss"

        // Loop through each cell in the ship's location
        for (int cell : locationCells) {
            if (guess == cell) {   // if the guess matches a location
                result = "hit";    // mark as a hit
                numOfHits++;       // increase the hit counter
                break;             // stop checking further (only one hit per guess)
            }
        }

        // If the number of hits equals the number of location cells,
        // the ship is sunk ("kill")
        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        // Print the result for feedback
        System.out.println(result);

        // Return the result so other code can use it
        return result;
    }
}
//Key points:
//
//locationCells → where the ship is placed.
//
//numOfHits → tracks progress of how many times it’s been hit.
//
//checkYourself() → checks a guess against the ship’s location, returns "miss", "hit", or "kill".
//
//Loop → uses an enhanced for loop (for (int cell : locationCells)) to check every location.
//
//Game logic → once numOfHits == locationCells.length, the ship is sunk.

