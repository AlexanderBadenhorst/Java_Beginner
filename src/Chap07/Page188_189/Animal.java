package Chap07.Page188_189;
//superclass

// Superclass (parent class) that all specific animals will inherit from
public class Animal {
    // Default eat() method - subclasses can override this
    public void eat() {
        System.out.println("This animal is eating");
    }

    // Default roam() method - can be reused or overridden
    public void roam() {
        System.out.println("This animal is roaming around");
    }

    // Default makeNoise() method - each animal can make its own noise by overriding
    public void makeNoise() {
        System.out.println("This animal is making noise");
    }
}
