package Chap05.Exercises.Page121;

public class MixedMessages {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 4; inner > 1; inner--) {
                //candidate code//
                x = x + 0;
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}

//Candidates:
//x = x + 3;
//output: 54 6

//x = x + 6
//output: 60 10

//x = x + 2
//output: 45 6

//x++
//output: 36 6

//x--
//output: 18 6

//x = x + 0
//output: 6 14