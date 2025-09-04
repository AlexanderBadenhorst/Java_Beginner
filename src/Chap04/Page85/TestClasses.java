package Chap04.Page85;

class Horse {
    // Instance variables (fields) of the Horse class
    private double height = 15.2; // initialized with a default value
    private String breed;         // defaults to null since not initialized
    // more code could go here, e.g., methods or constructors
}

class AddThing {
    // Instance variables (fields)
    int a;       // not initialized, so defaults to 0
    int b = 12;  // explicitly initialized to 12

    // Method that adds a + b and returns the result
    public int add() {
        int total = a + b; // local variable total stores the sum
        return total;
    }
}

class Foo {
    public int go() {
        //int x; // local variable declared but NOT initialized, local variables have no default value
        // int z = x + 3;
        // ❌ ERROR: local variables must be initialized before use
        // If you uncomment the line above, the compiler will complain
        //example for how it would work:
        int x;           // declare
        x = 7;           // assign a value before using
        int z = x + 3;   // works, z = 10
        return z;
    }
}

public class TestClasses {
    public static void main(String[] args) {
        // Create an AddThing object called at
        AddThing at = new AddThing();

        // Set the value of 'a' (otherwise it would stay 0)
        at.a = 5;

        Foo b = new Foo();
        System.out.println("Sum of x + 3 is: " + b.go());

        // Call the add() method and print the result (5 + 12 = 17)
        System.out.println("Sum of a + b is: " + at.add());
    }
}
