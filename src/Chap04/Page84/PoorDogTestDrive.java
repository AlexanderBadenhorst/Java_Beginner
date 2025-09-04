package Chap04.Page84;

// A simple class representing a dog with two instance variables
class PoorDog {
    // Instance variables (also called fields or attributes)
    // "private" means these can only be accessed from inside this class
    private int size;
    private String name;

    // Getter method for size
    // Since we never assign a value, "size" will default to 0 (the default for int)
    public int getSize() {
        return size;
    }

    // Getter method for name
    // Since we never assign a value, "name" will default to null (the default for objects like String)
    public String getName() {
        return name;
    }
}

// Test class to check the behavior of PoorDog
public class PoorDogTestDrive {
    public static void main(String[] args) {
        // Create a new PoorDog object called "one"
        PoorDog one = new PoorDog();

        // Print out the size (expected: 0, because int defaults to 0)
        System.out.println("Dog size is " + one.getSize());

        // Print out the name (expected: null, because String defaults to null)
        System.out.println("Dog name is " + one.getName());
    }
}

