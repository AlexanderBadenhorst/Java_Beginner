package Chap07.Page188_189;
//This contains the start() method that creates instances of Vet, Dog, and Hippo,
// then calls vet.giveShot().

// Class that creates Animal objects and sends them to the Vet
public class PetOwner {
    // Instance method to start the demo
    public void start() {
        Vet vet = new Vet();      // Create a Vet
        Dog dog = new Dog();      // Create a Dog
        Hippo hippo = new Hippo();// Create a Hippo
        Lion lion = new Lion();   // Create a Lion
        Cat cat = new Cat();      // Create a Cat

        // Give shots to different animals → polymorphism in action
        vet.giveShot(dog);   // Uses Dog's overridden methods where available
        vet.giveShot(hippo); // Uses Hippo's overridden methods
        vet.giveShot(cat);   // Uses Cat's overridden methods
        vet.giveShot(lion);  // Uses Lion's overridden methods
    }

    // Entry point of the program
    public static void main(String[] args) {
        PetOwner owner = new PetOwner(); // Create a PetOwner object
        owner.start();                   // Run the demo
    }
}


/*
⚡ Key takeaway:
This whole setup demonstrates polymorphism:

The Vet only knows it’s dealing with an Animal.

But depending on whether the object is a Dog, Hippo, Cat, or Lion,
the correct overridden method runs at runtime.
 */