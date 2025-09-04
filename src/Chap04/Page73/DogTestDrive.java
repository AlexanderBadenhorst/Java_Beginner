package Chap04.Page73;

public class DogTestDrive {
    public static void main(String[] args) {
        // Create the first Dog object
        Dog one = new Dog();       // "one" is a reference variable pointing to a new Dog object
        one.size = 70;             // set size (big dog)

        // Create the second Dog object
        Dog two = new Dog();
        two.size = 8;              // set size (small dog)

        // Create the third Dog object
        Dog three = new Dog();
        three.size = 35;           // set size (medium dog)

        // Call the bark() method on each dog
        // The output depends on each dog's size
        one.bark();   // prints "Wooof! Wooof!"
        two.bark();   // prints "Yip! Yip!"
        three.bark(); // prints "Ruff! Ruff!"
    }
}
