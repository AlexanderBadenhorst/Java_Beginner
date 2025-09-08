package HangmanGame;

/**
 * HangmanApp is the entry point of the program.
 * It sets up the game, controls the main loop,
 * and handles the interaction between the player
 * and the game logic.
 *
 * Concepts shown:
 * - public class with main method (Ch.1)
 * - Object creation with new (Ch.2)
 * - Loops and conditionals (Ch.4)
 * - Using helper classes (encapsulation + separation of concerns)
 */
public class HangmanApp { // public class must match file name
    public static void main(String[] args) {
        // Create a helper to handle console input/output
        GameHelper helper = new GameHelper();

        // Create a word bank with a default list of words
        WordBank bank = new WordBank();

        // Get a random target word from the bank
        String target = bank.getRandomWord();

        // Create a new HangmanGame with the target word and 7 lives
        HangmanGame game = new HangmanGame(target, 7);

        // Intro messages
        helper.println("=== Console Hangman ===");
        helper.println("Guess the word, one letter at a time.");
        helper.println("You have " + game.getRemainingLives() + " lives.\n");

        // Main game loop: keep running until win or loss
        while (!game.isWon() && !game.isLost()) {
            // Show current progress, used letters, and lives
            helper.println("Word:   " + game.getMaskedWord());
            helper.println("Used:   " + game.getUsedLetters());
            helper.println("Lives:  " + game.getRemainingLives());

            // Ask the player for a guess
            char guess = helper.promptLetter("Your guess (a-z): ");

            // Submit guess to the game and get the result
            HangmanGame.Result result = game.guess(guess);

            // Switch statement makes responses clear and readable
            switch (result) {
                case ALREADY_USED -> helper.println("You already tried '" + guess + "'. Try another.");
                case HIT          -> helper.println("Nice! '" + guess + "' is in the word.\n");
                case MISS         -> helper.println("Nope. '" + guess + "' is not in the word.\n");
                default           -> { /* no-op */ }
            }
        }

        // Game over message
        helper.println("\n=== Game Over ===");
        if (game.isWon()) {
            helper.println("You win! The word was: " + target);
        } else {
            helper.println("You lost. The word was: " + target);
        }

        // Close resources (good practice)
        helper.close();
    }
}
