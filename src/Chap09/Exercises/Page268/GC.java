package Chap09.Exercises.Page268;

public class GC {
    public static GC doStuff() {
        GC newGC = new GC();
        doStuff2(newGC);
        return newGC;
    }

    public static void main(String[] args) {
        GC gc1;
        GC gc2 = new GC();
        GC gc3 = new GC();
        GC gc4 = gc3;
        gc1 = doStuff();
        //code goes here


    }

    public static void doStuff2(GC copyGC) {
        GC localGC = copyGC;
    }
}

/*candidates:
Correct choices
2, 4, and 8 — each makes exactly one object newly eligible for garbage collection.
1:
copyGC = null;
won’t compile (out of scope). No effect on GC.
2:
gc2 = null;
drops the only reference to O2 → exactly 1 new eligible object (O2)
3:
newGC = gc3;
won’t compile (out of scope). No effect on GC.
4:
gc1 = null;
drops the only reference to O1 → exactly 1 new eligible object (O1).
5:
newGC = null;
won’t compile (out of scope). No effect on GC.
6:
gc4 = null;
O3 still referenced by gc3 → 0 new eligible objects.
7:
gc3 = gc2;
O3 still referenced by gc4; O2 now has two refs → 0 new eligible objects.
8:
gc1 = gc4;
stops pointing to O1 (now points to O3); O1 has no refs → exactly 1 new eligible object (O1)
9:
gc3 = null;
O3 still referenced by gc4 → 0 new eligible objects.
 */