package Chap07.Page188_189;
//subclasses that extend Animal

// Dog is a subclass of Animal
public class Dog extends Animal {
    // Overrides eat() with dog-specific behavior
    public void eat() {
        System.out.println("Dog is eating.");
    }

    // Does NOT override makeNoise() or roam() → will use the default methods from Animal
}
