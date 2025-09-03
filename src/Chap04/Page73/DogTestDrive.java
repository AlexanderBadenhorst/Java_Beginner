package Chap04.Page73;

public class DogTestDrive {
    public static void main(String[] args) {
        //first object
        Dog one = new Dog(); //one is our reference variable
        one.size = 70;
        //second object
        Dog two = new Dog();
        two.size = 8;
        //third object
        Dog three = new Dog();
        three.size = 35;
        //calling methods
        one.bark();
        two.bark();
        three.bark();
    }
}
