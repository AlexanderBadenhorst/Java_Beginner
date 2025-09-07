package HangmanGame;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * HangmanGame manages the state and rules of a single game.
 *
 * Concepts shown:
 * - Encapsulation (fields are private, exposed through methods)
 * - Arrays (char[] revealed stores the word progress, Ch.5)
 * - ArrayList (used letters tracked dynamically, Ch.5)
 * - Control flow (if/else, for loop, while in App, Ch.4)
 * - Enum for clear result values
 */
class HangmanGame {
    /**
     * Enum makes guess results clear and type-safe
     * instead of using plain strings or numbers.
     */
    enum Result { HIT, MISS, ALREADY_USED }

    // The word to guess (stored in lowercase for consistency).
    private final String targetWord;

    // Array of characters representing the player's progress.
    // Underscores ('_') show letters not yet guessed.
    private final char[] revealed;

    // List of letters already guessed by the player.
    private final ArrayList<Character> used;

    // Number of lives remaining before the player loses.
    private int remainingLives;

    /**
     * Constructor sets up the game with a target word and lives.
     * Demonstrates initialization of arrays and collections.
     */
    public HangmanGame(String targetWord, int lives) {
        this.targetWord = targetWord.toLowerCase();

        // Fill the revealed array with underscores for each letter.
        this.revealed = new char[targetWord.length()];
        Arrays.fill(this.revealed, '_');

        this.used = new ArrayList<>();
        this.remainingLives = lives;
    }

    /**
     * Handles a player's guess:
     * - Checks if it's a valid letter
     * - Detects repeated guesses
     * - Reveals correct letters or removes a life for a miss
     *
     * @param rawLetter the guessed character
     * @return a Result enum (HIT, MISS, or ALREADY_USED)
     */
    public Result guess(char rawLetter) {
        char letter = Character.toLowerCase(rawLetter);

        // Guard clause: ignore non-letters
        if (!Character.isLetter(letter)) return Result.MISS;

        // If letter already used, inform the player
        if (used.contains(letter)) {
            return Result.ALREADY_USED;
        }
        used.add(letter);

        // Check if letter exists in the word
        boolean hit = false;
        for (int i = 0; i < targetWord.length(); i++) {
            if (targetWord.charAt(i) == letter) {
                revealed[i] = letter; // reveal the letter
                hit = true;
            }
        }

        // If letter not found, lose one life
        if (!hit) {
            remainingLives--;
            return Result.MISS;
        }
        return Result.HIT;
    }

    // --- Encapsulated accessors (Chapter 2: getters) ---

    /** Returns the current state of the word (underscores + guessed letters). */
    public String getMaskedWord() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < revealed.length; i++) {
            sb.append(revealed[i]);
            if (i < revealed.length - 1) sb.append(' ');
        }
        return sb.toString();
    }

    /** Returns a comma-separated list of letters already guessed. */
    public String getUsedLetters() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < used.size(); i++) {
            sb.append(used.get(i));
            if (i < used.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }

    /** How many lives are left. */
    public int getRemainingLives() {
        return remainingLives;
    }

    /** Checks if the player has guessed all letters. */
    public boolean isWon() {
        for (char c : revealed) {
            if (c == '_') return false;
        }
        return true;
    }

    /** Checks if the player has run out of lives. */
    public boolean isLost() {
        return remainingLives <= 0 && !isWon();
    }
}
