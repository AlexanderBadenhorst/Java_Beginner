package HangmanGame;

import java.util.ArrayList;
import java.util.Random;

/**
 * WordBank is responsible for storing and providing words
 * for the Hangman game.
 *
 * Concepts shown:
 * - Encapsulation (class hides its internal list)
 * - ArrayList usage (dynamic list of words, Ch.5)
 * - Random class to select a word
 */
class WordBank {
    // ArrayList to hold all available words for the game.
    // ArrayList is used instead of a fixed array because we
    // can easily add more words at runtime.
    private final ArrayList<String> words = new ArrayList<>();

    // Random object to pick a word randomly from the list.
    private final Random rand = new Random();

    /**
     * Constructor sets up the initial word list.
     * Demonstrates how we can initialize an object’s state.
     */
    public WordBank() {
        // Starter word list (feel free to expand).
        words.add("java");
        words.add("object");
        words.add("method");
        words.add("variable");
        words.add("encapsulation");
        words.add("arraylist");
        words.add("constructor");
        words.add("loop");
        words.add("condition");
    }

    /**
     * Adds a new word to the word bank.
     * Shows validation logic with null/blank checks.
     *
     * @param word the word to add
     */
    public void add(String word) {
        if (word != null && !word.isBlank()) {
            words.add(word.trim().toLowerCase());
        }
    }

    /**
     * Returns a random word from the bank.
     * Demonstrates using Random with an ArrayList.
     *
     * @return a randomly selected word
     */
    public String getRandomWord() {
        return words.get(rand.nextInt(words.size()));
    }
}
