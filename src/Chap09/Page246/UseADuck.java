package Chap09.Page246;

// Simple class demonstrating constructor-based initialization
class Duck {
    int size; // instance field holding this duck's size

    // Constructor: runs automatically when you create a Duck
    public Duck(int duckSize) {
        System.out.println("Quack");          // side effect to show construction
        size = duckSize;                      // initialize state from parameter
        System.out.println("size is " + size); // confirm initialized value
    }
}

public class UseADuck {
    public static void main(String[] args) {
        // Create and initialize in one step; constructor is called with 42
        Duck d = new Duck(42);

        // Note: there is no no-arg constructor here, so `new Duck()` would not compile.
        // Expected output:
        // Quack
        // size is 42
    }
}
