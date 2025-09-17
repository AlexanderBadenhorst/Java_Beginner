package Chap09.Page257;

public class MakeHippo {
    public static void main(String[] args) {
        Hippo h = new Hippo("Buffy");     // constructor chain: Object → Animal("Buffy") → Hippo
        System.out.println(h.getName());  // prints: Buffy
    }
}
