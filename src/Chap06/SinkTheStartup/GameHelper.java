// Page 112
package Chap06.SinkTheStartup;

import java.util.*;

public class GameHelper {
    // Constants for the grid
    private static final String ALPHABET = "abcdefg";   // Column labels (a–g)
    private static final int GRID_LENGTH = 7;           // 7 columns
    private static final int GRID_SIZE = 49;            // 7 x 7 grid = 49 cells
    private static final int MAX_ATTEMPTS = 200;        // Max tries to place a Startup

    // Increments for horizontal/vertical placement
    static final int HORIZONTAL_INCREMENT = 1;          // move right by 1 cell
    static final int VERTICAL_INCREMENT = GRID_LENGTH;  // move down by 7 cells

    // The grid array, tracks which cells are used (0 = free, 1 = occupied)
    private final int[] grid = new int[GRID_SIZE];

    // Random number generator for choosing positions
    private final Random random = new Random();

    // Counts how many Startups have been placed (used to alternate direction)
    private int startupCount = 0;

    // --- USER INPUT SECTION ---
    // Asks the user for input and returns it in lowercase
    public String getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    } // end getUserInput

    // --- PLACING A STARTUP ON THE GRID ---
    public ArrayList<String> placeStartup(int startupSize) {
        // Array to hold the grid indexes for this Startup
        int[] startupCoords = new int[startupSize];

        int attempts = 0;       // How many times we've tried to place
        boolean success = false; // Flag to track if placement worked
        startupCount++;          // Which Startup number this is
        int increment = getIncrement(); // Alternate horizontal/vertical

        // Main loop: try until success or attempts run out
        while (!success & attempts++ < MAX_ATTEMPTS) {
            // Pick a random starting point
            int location = random.nextInt(GRID_SIZE);

            // Generate potential coordinates
            for (int i = 0; i < startupCoords.length; i++) {
                startupCoords[i] = location; // Save candidate cell
                location += increment;       // Step right or down
            }

            // Check if it fits inside the grid and doesn’t overlap
            if (startupFits(startupCoords, increment)) {
                success = coordsAvailable(startupCoords);
            }
        } // end while

        // Save the final chosen positions into the grid
        savePositionToGrid(startupCoords);

        // Convert numeric coordinates (e.g., 0, 7, 14) → alpha format (a0, a1, a2)
        ArrayList<String> alphaCells = convertCoordsToAlphaFormat(startupCoords);
        System.out.println("Placed startup at: " + alphaCells);

        return alphaCells;
    } // end placeStartup

    // --- HELPER METHODS FOR PLACEMENT ---

    // Check if the Startup fits in the grid
    private boolean startupFits(int[] startupCoords, int increment) {
        int finalLocation = startupCoords[startupCoords.length - 1];

        if (increment == HORIZONTAL_INCREMENT) {
            // Ensure the last cell is still on the same row as the first
            return calcRowFromIndex(startupCoords[0]) == calcRowFromIndex(finalLocation);
        } else {
            // Ensure the last cell is not beyond the bottom of the grid
            return finalLocation < GRID_SIZE;
        }
    } // end startupFits

    // Ensure none of the chosen coordinates are already occupied
    private boolean coordsAvailable(int[] startupCoords) {
        for (int coord : startupCoords) {
            if (grid[coord] != 0) { // This spot is already taken
                return false;
            }
        }
        return true; // All spots are free
    } // end coordsAvailable

    // Mark chosen positions as occupied
    private void savePositionToGrid(int[] startupCoords) {
        for (int index : startupCoords) {
            grid[index] = 1;
        }
    } // end savePositionToGrid

    // Convert numeric coordinates to grid labels (e.g., 0 → a0, 8 → b1)
    private ArrayList<String> convertCoordsToAlphaFormat(int[] startupCoords) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        for (int index : startupCoords) {
            String alphaCoords = getAlphaCoordsFromIndex(index);
            alphaCells.add(alphaCoords);
        }
        return alphaCells;
    } // end convertCoordsToAlphaFormat

    // Convert a single numeric index into alpha-numeric grid format
    private String getAlphaCoordsFromIndex(int index) {
        int row = calcRowFromIndex(index);            // Row number
        int column = index % GRID_LENGTH;             // Column number
        String letter = ALPHABET.substring(column, column + 1); // Convert to a–g
        return letter + row;                          // Combine letter + row
    } // end getAlphaCoordsFromIndex

    // Calculate the row (0–6) from a numeric index
    private int calcRowFromIndex(int index) {
        return index / GRID_LENGTH;
    } // end calcRowFromIndex

    // Alternate between horizontal and vertical placement
    private int getIncrement() {
        if (startupCount % 2 == 0) {
            return HORIZONTAL_INCREMENT; // Even = place horizontally
        } else {
            return VERTICAL_INCREMENT;   // Odd = place vertically
        }
    } // end getIncrement
} // end class
