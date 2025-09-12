package Chap07.Page188_189;
//subclasses that extend Animal

// Lion is a subclass of Animal
public class Lion extends Animal {
    // Overrides eat() with lion-specific behavior
    public void eat() {
        System.out.println("Lion is eating.");
    }

    // Overrides roam() with lion-specific roaming
    public void roam() {
        System.out.println("Lion is roaming.");
    }

    // Overrides makeNoise() with a roar
    public void makeNoise() {
        System.out.println("Lion roars.");
    }
}
