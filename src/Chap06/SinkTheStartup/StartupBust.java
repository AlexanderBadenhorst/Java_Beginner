package Chap06.SinkTheStartup;

import java.util.ArrayList;

public class StartupBust {
    // Helper class handles user input and random placement of Startups
    private GameHelper helper = new GameHelper();

    // A list holding all the Startup objects in the game
    private ArrayList<Startup> startups = new ArrayList<Startup>();

    // Tracks how many guesses the player has made
    private int numOfGuesses = 0;

    // Sets up the game before play starts
    private void setUpGame() {
        // Create three Startup objects and give them names
        Startup one = new Startup();
        one.setName("poniez");
        Startup two = new Startup();
        two.setName("hacqi");
        Startup three = new Startup();
        three.setName("cabista");

        // Add the Startups to the list
        startups.add(one);
        startups.add(two);
        startups.add(three);

        // Instructions for the player
        System.out.println("Your goal is to sink three Startups.");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Try to sink them all in the fewest number of guesses");

        // Assign each Startup a random location on the grid
        for (Startup startup : startups) {
            ArrayList<String> newLocation = helper.placeStartup(3); // 3 cells per Startup
            startup.setLocationCells(newLocation);
        }
    }

    // Main gameplay loop
    private void startPlaying() {
        // Keep asking for guesses until all Startups are gone
        while (!startups.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess"); // ask player
            checkUserGuess(userGuess); // check if it's a hit/miss/kill
        }
        // Once no Startups remain, finish the game
        finishGame();
    }

    // Checks the user's guess against all Startups
    private void checkUserGuess(String userGuess) {
        numOfGuesses++;  // increase guess count
        String result = "miss"; // default assumption

        // Loop through all Startups still in the game
        for (Startup startupToTest : startups) {
            // Ask the Startup if it was hit
            result = startupToTest.checkYourself(userGuess);

            if (result.equals("hit")) {
                // If it was a hit, no need to keep checking
                break;
            }
            if (result.equals("kill")) {
                // If the Startup was sunk, remove it from the list
                startups.remove(startupToTest);
                break;
            }
        }
        // Show the player the result of their guess
        System.out.println(result);
    }

    // Wraps up the game after all Startups are sunk
    private void finishGame() {
        System.out.println("All Startups are dead! Your stock is now worthless");

        if (numOfGuesses <= 18) {
            // Player did well
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            // Player took too long
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }

    // Program entry point
    public static void main(String[] args) {
        StartupBust game = new StartupBust();
        game.setUpGame();     // initialize Startups and grid
        game.startPlaying();  // start the gameplay loop
    }
}
