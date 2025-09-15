package Chap08.Exercises.Page234;

// Define an interface named Nose
// Interfaces in Java declare methods that implementing classes must define.
// Here, Nose requires any implementing class to provide an iMethod() that returns an int.
interface Nose {
    public int iMethod();
}

// Define an abstract class Picasso that implements Nose.
// Because it’s abstract, Picasso cannot be directly instantiated.
// It provides a concrete implementation of iMethod() that always returns 7.
abstract class Picasso implements Nose {
    public int iMethod() {
        return 7;
    }
}

// Clowns is a regular class that extends Picasso.
// It inherits Picasso’s implementation of iMethod(), so calling iMethod() on a Clowns object returns 7.
class Clowns extends Picasso {
}

// Acts is another class that extends Picasso.
// However, Acts overrides iMethod() to return 5 instead of 7.
class Acts extends Picasso {
    public int iMethod() {
        return 5;
    }
}

// Of76 is a class that extends Clowns.
// It doesn’t override iMethod(), so it inherits Picasso’s version (returning 7).
public class Of76 extends Clowns {

    public static void main(String[] args) {
        // Create an array of Nose references with space for 3 elements.
        // Even though Nose is an interface, you can store any object in this array
        // as long as it implements Nose (which all these classes do, directly or indirectly).
        Nose[] i = new Nose[3];

        // Fill the array with different objects:
        // Acts (which overrides iMethod() to return 5),
        // Clowns (inherits Picasso’s iMethod() = 7),
        // Of76 (also inherits Picasso’s iMethod() = 7).
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Of76();

        // Loop through each element in the array
        for (int x = 0; x < 3; x++) {
            // Call iMethod() on the current object and print its result.
            // Also print the simple class name of the object (e.g., Acts, Clowns, Of76).
            // getClass() returns the runtime class of the object,
            // getSimpleName() extracts just the class name without package info.
            System.out.println(i[x].iMethod() + " class " + i[x].getClass().getSimpleName());
        }
    }
}
