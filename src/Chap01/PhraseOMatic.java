package Chap01;

public class PhraseOMatic {
    public static void main(String[] args) {
        //make 3 sets of words to choose from
        String[] wordListOne = {"driftwood", "neon echo", "lantern", "quiet storm", "velvet ashes", "gossamer", "iron quill", "mirage", "solar bloom", "ember tide"};
        String[] wordListTwo = {"moonlit harbor", "crimson veil", "obsidian", "silent grove", "twilight ember", "frostbite", "silver compass", "echoing hollow", "golden serpent", "shattered glass"};
        String[] wordListThree = {"shadow lark", "broken halo", "crystal fang", "whisper vale", "iron petal", "starlit echo", "frozen dune", "ashen crown", "midnight lantern", "wildthorn"};

        // find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate three random numbers
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        // now build a phrase
        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];

        // print out the phrase
        System.out.println("What we need is a " + phrase);
    }
}

