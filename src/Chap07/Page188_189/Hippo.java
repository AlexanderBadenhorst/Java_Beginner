package Chap07.Page188_189;
//subclasses that extend Animal

// Hippo is a subclass of Animal (inherits from Animal)
public class Hippo extends Animal {
    // Overrides eat() with hippo-specific behavior
    public void eat() {
        System.out.println("Hippo is eating.");
    }

    // Overrides makeNoise() with hippo-specific sound
    public void makeNoise() {
        System.out.println("Hippo grunts.");
    }
}
