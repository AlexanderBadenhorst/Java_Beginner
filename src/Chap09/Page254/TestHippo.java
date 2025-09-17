package Chap09.Page254;

public class TestHippo {
    public static void main(String[] args) {
        System.out.println("Starting...");
        Hippo h = new Hippo(); // Triggers constructor chain: Object() → Animal() → Hippo()
        // Expected output:
        // Starting...
        // Making an Animal
        // Making a Hippo
    }
}

