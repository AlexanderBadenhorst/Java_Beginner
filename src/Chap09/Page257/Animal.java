package Chap09.Page257;

// Abstract superclass: cannot be instantiated directly; meant to be extended.
public abstract class Animal {

    private String name; // state is private → accessed via getter

    public String getName() {              // expose name safely
        return name;
    }

    // Superclass constructor requires a name → all subclasses must provide one
    public Animal(String theName) {
        name = theName;                    // initialize superclass state
    }
}
