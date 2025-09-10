package Chap06.SinkTheStartup;

import java.util.ArrayList;

public class Startup {
    // Stores the locations (grid cells) occupied by this Startup
    private ArrayList<String> locationCells;

    // The name of the Startup (used when sunk)
    private String name;

    // Setter method to give this Startup its location on the grid
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    // Setter method to give this Startup a name
    public void setName(String n) {
        name = n;
    }

    // Method to check if the user's guess ("userInput") hits this Startup
    public String checkYourself(String userInput) {
        // Default result is "miss"
        String result = "miss";

        // See if the guess is in the list of locationCells
        int index = locationCells.indexOf(userInput);

        // If index >= 0, the guess matched one of the Startup's cells
        if (index >= 0) {
            // Remove that cell (it's been "hit")
            locationCells.remove(index);

            // If no cells remain, the Startup is sunk
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " :( ");
            } else {
                // Otherwise, it's just a "hit"
                result = "hit";
            } // end inner if
        } // end outer if

        // Return the result ("miss", "hit", or "kill")
        return result;
    } // end method
} // close class