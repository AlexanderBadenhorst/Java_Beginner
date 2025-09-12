package Chap07.Page188_189;
//subclasses that extend Animal

// Cat is a subclass of Animal
public class Cat extends Animal {
    // Overrides eat() with cat-specific behavior
    public void eat() {
        System.out.println("Cat is eating.");
    }

    // Overrides roam() to describe how cats roam
    public void roam() {
        System.out.println("Cat is roaming.");
    }

    // Overrides makeNoise() to output a cat sound
    public void makeNoise() {
        System.out.println("Cat meows.");
    }
}
