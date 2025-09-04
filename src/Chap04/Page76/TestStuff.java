package Chap04.Page76;

public class TestStuff {

    // Method that takes two int parameters (x and y)
    // Adds them together and prints the result
    void takeTwo(int x, int y) {
        int z = x + y; // local variable z holds the sum
        System.out.println("Total is " + z);
    }

    // Method that creates a new TestStuff object
    // Then calls takeTwo() on that object with the values 12 and 34
    void go() {
        TestStuff t = new TestStuff(); // new object created
        t.takeTwo(12, 34); // call takeTwo with arguments 12 and 34
    }

    // Main method (program entry point)
    public static void main(String[] args) {
        TestStuff tester = new TestStuff(); // create a TestStuff object
        tester.go(); // call the go() method, which then calls takeTwo()
    }
}
