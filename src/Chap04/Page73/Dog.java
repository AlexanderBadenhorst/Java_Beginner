package Chap04.Page73;

public class Dog {
    // Instance variables (fields) - each Dog object will have its own size and name
    int size;      // defaults to 0 if not set
    String name;   // defaults to null if not set

    // Method that makes the dog bark
    // The type of bark depends on the dog's size
    void bark() {
        if (size > 60) {
            System.out.println("Wooof! Wooof!"); // big dog
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");   // medium dog
        } else {
            System.out.println("Yip! Yip!");     // small dog
        }
    }
}
