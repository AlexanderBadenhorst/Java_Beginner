package Chap09.Page247;

// Demo of overloaded constructors: one no-arg (default) and one with a size
class Duck {
    int size; // instance state

    // No-arg constructor: lets callers make a Duck without supplying data
    public Duck() {
        size = 10;                               // set a sensible default
        System.out.println("Quack Quack Quack Quack!!!"); // just to show it ran
        System.out.println("size is " + size);   // confirm initialized state
    }

    // Overloaded constructor: caller provides the size
    public Duck(int duckSize) {
        size = duckSize;                         // initialize from parameter
        System.out.println("Quack Quack");       // different message for clarity
        System.out.println("size is " + size);
    }
}

public class UseADuck {
    public static void main(String[] args) {
        Duck defaultDuck = new Duck();    // calls no-arg ctor → size defaults to 10
        Duck customDuck = new Duck(42);  // calls int ctor → size set to 42

        // Note:
        // - If you only had the int constructor, `new Duck()` would NOT compile.
        // - Providing a no-arg constructor makes the class easier to use (and helps
        //   with tools that require it, e.g., some serializers/frameworks).
        //
        // Expected output:
        // Quack Quack Quack Quack!!!
        // size is 10
        // Quack Quack
        // size is 42
    }
}
