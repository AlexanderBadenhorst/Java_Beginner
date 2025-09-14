package Chap08.Page208;

public class DogTestDrive {
    public static void main(String[] args) {
        MyDogList list = new MyDogList(); //Create our dog list
        Dog dog1 = new Dog(); //First Dog
        Dog dog2 = new Dog(); //Second Dog
        list.add(dog1); //Add to the list
        list.add(dog2);
    }
}