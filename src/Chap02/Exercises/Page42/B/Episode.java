package Chap02.Exercises.Page42.B;

public class Episode {
    int seriesNumber;
    int episodeNumber;

    void play() { // line 7 of EpisodeTestDrive wouldn't run without this method
        System.out.println("Playing episode " + episodeNumber);
    }

    void skipIntro() {
        System.out.println("Skipping intro...");
    }

    void skipToNext() {
        System.out.println("Loading next episode...");
    }
}
