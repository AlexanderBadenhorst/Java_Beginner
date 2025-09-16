package Chap09.Page244;


public class UseADuck {
    public static void main(String[] args) {
        Duck duck = new Duck();  // Create a new Duck object
        Budgie budgie = new Budgie();
    }
}

// This is the Duck class
class Duck {

    // Constructor that prints "Quack" when a Duck is created
    public Duck() {
        System.out.println("Quack");
    }
}

class Budgie {

    // Constructor that prints "Barks" when a Dog is created
    public Budgie() {
        System.out.println("Tweets");
    }
}
