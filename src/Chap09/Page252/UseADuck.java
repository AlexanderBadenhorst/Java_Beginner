package Chap09.Page252;

class Duck {
    int size;        // instance state: how big this duck is
    boolean canFly;  // instance state: whether this duck can fly

    // No-argument constructor: sets sensible defaults
    public Duck() {
        // NOTE (constructors & inheritance):
        // Every constructor must start by calling either this(...) or super(...).
        // If you don’t write one, Java inserts an implicit super() here.
        // (That calls the no-arg constructor of the superclass, if it exists.)
        this.size = 5;
        this.canFly = true;
        System.out.println("Default Duck created.");
    }

    // Overloaded constructor: caller supplies size; canFly defaults to true
    public Duck(int size) {
        // Implicit super() would be called first if there were a superclass
        this.size = size;
        this.canFly = true;
        System.out.println("Duck created with size: " + size);
    }

    // Most specific constructor: caller supplies both fields
    public Duck(int size, boolean canFly) {
        // Implicit super() would be called first if there were a superclass
        this.size = size;
        this.canFly = canFly;
        System.out.println("Duck created with size: " + size + " and canFly: " + canFly);
    }

    // TIP: To avoid duplicate init code, you could chain:
    // public Duck(int size) { this(size, true); }
    // public Duck() { this(5); }
}

public class UseADuck {
    public static void main(String[] args) {
        Duck d1 = new Duck();             // calls no-arg ctor → size=5, canFly=true
        Duck d2 = new Duck(10);           // calls size-only ctor → size=10, canFly=true
        Duck d3 = new Duck(15, false);    // calls full ctor → size=15, canFly=false

        // Inheritance note:
        // If Duck extended, say, Bird, then Bird's constructor would run first
        // (via implicit super() or an explicit super(args)) before Duck's body.
    }
}
