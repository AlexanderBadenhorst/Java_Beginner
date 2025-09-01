package Chap01.Exercise.Page23;

public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            //______Candidates______//
            //OPTION 1 matches option 5//
//            y = x - y;

            //output: 00 11 21 32 42

            //OPTION 2 matches option 7//
//            y = y + x;

            //output: 00 11 23 36 410

            //OPTION 3 matches option 8//
//            y = y + 2;
//            if( y > 4 ) {
//            y = y - 1;
//            }

            //output: 02 14 25 36 47

            //OPTION 4 matches option 2//
//            x = x + 1;
//            y = y + x;

            //output: 11 34 59

            //OPTION 5 matches option 4//
//            if ( y < 5 ) {
//            x = x + 1;
//            if ( y < 3 ) {
//            x = x - 1;
//            }
//            }
//            y = y + 2;

            //output: 02 14 36 48

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
