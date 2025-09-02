package Chap02.Exercises.Page42.A;

public class StreamingSongTestDrive {
    public static void main(String[] args) {
        StreamingSong song = new StreamingSong(); // need this to declare a new instance of streamingsong
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.play();
        song.printDetails();
    }
}
