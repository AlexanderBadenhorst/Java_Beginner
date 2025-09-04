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
    public void go() {
        int x; // local variable declared but NOT initialized
        // int z = x + 3;
        // ❌ ERROR: local variables must be initialized before use
        // If you uncomment the line above, the compiler will complain
    }
}

public class TestClasses {
    public static void main(String[] args) {
        // Create an AddThing object
        AddThing at = new AddThing();

        // Set the value of 'a' (otherwise it would stay 0)
        at.a = 5;

        // Call the add() method and print the result (5 + 12 = 17)
        System.out.println("Sum is: " + at.add());
    }
}
