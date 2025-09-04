package Chap04.Page82;

class GoodDog {
    // Instance variable for the dog's size
    // Marked private to enforce encapsulation (outside code can't change it directly)
    private int size;

    // Getter method for size (allows safe access to the private variable)
    public int getSize() {
        return size;
    }

    // Setter method for size (allows controlled modification of the private variable)
    public void setSize(int s) {
        size = s;
    }

    // Method for barking. What sound the dog makes depends on its size.
    void bark() {
        if (size > 60) {
            System.out.println("Wooof! Wooof!"); // Big dogs make a deep bark
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");   // Medium dogs make a normal bark
        } else {
            System.out.println("Yip! Yip!");     // Small dogs make a high-pitched bark
        }
    }
}

class GoodDogTestDrive {
    public static void main(String[] args) {
        // Create the first GoodDog object and set its size
        GoodDog one = new GoodDog();
        one.setSize(70); // Large dog

        // Create the second GoodDog object and set its size
        GoodDog two = new GoodDog();
        two.setSize(8);  // Small dog

        // Print out the sizes of both dogs using the getter
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());

        // Make both dogs bark (output depends on their size)
        one.bark();
        two.bark();
    }
}
