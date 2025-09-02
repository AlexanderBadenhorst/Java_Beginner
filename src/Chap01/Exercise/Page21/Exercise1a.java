package Chap01.Exercise.Page21;

class Exercise1a {
    public static void main(String [] args) {
        int x = 1;
        while ( x < 10 ) {
            x = x + 1; //requires this in order for it to not loop infinitely
            if ( x > 3) {
                System.out.println("big x");
            }
        }
    }

    //file would run but without line 7 it loops infinitely
}
