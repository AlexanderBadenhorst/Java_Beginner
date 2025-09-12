package Chap07.Page188_189;
//This class contains the method giveShot(Animal a) that takes any Animal

// This class demonstrates polymorphism by interacting with any Animal
public class Vet {
    // Method that takes any Animal object as a parameter
    public void giveShot(Animal a) {
        // Calls methods on the Animal → actual version depends on the object's real type
        a.makeNoise();  // Polymorphic call: Dog barks, Cat meows, Hippo grunts, etc.
        a.roam();       // Each subclass can override this
        a.eat();        // Each subclass can override this
        System.out.println(); // Print blank line to separate output
    }
}
