package Chap07.Page193;

public class Main {
    public static void main(String[] args) {
        Overloads obj = new Overloads(); // Create an instance to call instance methods on

        // Test overloaded addNums:
        // Compiler picks the int version because the arguments are ints.
        System.out.println("int addNums: " + obj.addNums(3, 4));          // Prints 7

        // Here the compiler picks the double version because the arguments are doubles.
        System.out.println("double addNums: " + obj.addNums(3.5, 4.5));   // Prints 8.0

        // Test overloaded setUniqueID (String version)
        obj.setUniqueID("ABC123"); // Calls setUniqueID(String)
        System.out.println("Unique ID (string): " + obj.getUniqueID());   // ABC123

        // Test overloaded setUniqueID (int version)
        // Calls setUniqueID(int) → converts to String → calls setUniqueID(String)
        obj.setUniqueID(98765);
        System.out.println("Unique ID (int): " + obj.getUniqueID());      // "98765"
    }
}
