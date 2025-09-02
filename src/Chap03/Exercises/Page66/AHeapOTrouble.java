package Chap03.Exercises.Page66;

class HeapQuiz {
    int id = 0;
    public static void main(String[] args) {
        int x = 0;
        HeapQuiz[] hq = new HeapQuiz[5];
        while (x < 3) {
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x = x + 1;
        }
        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];
// do stuff
    }
}
//hq[0] mathces nothing
//hq[1] matches id = 1
//hq[2] matches nothing
//hq[3] matches id = 2
//hq[4] matches id = 0