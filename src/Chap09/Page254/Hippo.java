package Chap09.Page254;

// Subclass of Animal
public class Hippo extends Animal {
    public Hippo() {
        // Implicit call to super() happens here first → runs Animal()
        System.out.println("Making a Hippo"); // then this constructor body runs
    }
}
