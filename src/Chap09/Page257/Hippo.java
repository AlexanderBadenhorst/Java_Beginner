package Chap09.Page257;

// Subclass of Animal
public class Hippo extends Animal {

    // Must call a superclass constructor explicitly because Animal has NO no-arg ctor
    public Hippo(String name) {
        super(name); // passes 'name' up; must be the first statement in the ctor
    }
}
