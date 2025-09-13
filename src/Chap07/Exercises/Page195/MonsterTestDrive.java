package Chap07.Exercises.Page195;

public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster[] monsters = new Monster[3];
        monsters[0] = new Vampire();
        monsters[1] = new Dragon();
        monsters[2] = new Monster();
        for (int i = 0; i < monsters.length; i++) {
            monsters[i].frighten(i);
        }
    }
}

class Monster {
    //A
    boolean frighten(int d) {
        System.out.println("arrrgh");
        return true;
    }
}

class Vampire extends Monster {
    //B:
    boolean frighten(int x) {
        System.out.println("a bite?");
        return false;
    }
}

class Dragon extends Monster {
    boolean frighten(int degree) {
        System.out.println("breathe fire");
        return true;
    }
}

/*
AB combos:
1:
Winning combo for desired outcome
A:
 boolean frighten(int d) {
        System.out.println("arrrgh");
        return true;
    }
B:
boolean frighten(int x) {
        System.out.println("a bite?");
        return false;
    }

2:
won't compile; java: frighten(int) in Chap07.Exercises.Page195.Vampire cannot override frighten(int) in Chap07.Exercises.Page195.Monster
  return type int is not compatible with boolean
 meaning:
-Monster defines frighten(int x) returning boolean.
-Vampire defines frighten(int f) returning int.
-Same method signature (parameters), but different return type.
--Java doesn’t allow this → compiler error:
A:
boolean frighten(int x) {
        System.out.println("arrrgh");
        return true;
    }
B:
int frighten(int f) {
        System.out.println("a bite?");
        return 1;
    }

3:
doesn't achieve desired outcome; option b calls the override method scare instead of frighten, so when frighten(i) is called it doesnt find an override
A:
boolean frighten(int x) {
        System.out.println("arrrgh");
        return false;
    }
B:
boolean scare(int x) {
        System.out.println("a bite?");
        return true;
    }

4:
doesn't achieve desired outcome; in Monster they define frighten(int z) and in vampire they define frighten(byte b). different parameter types results in overloading not overriding. therefore when frighten(i) is called with an int, it runs the Monster version instead of the Vampire version
A:
boolean frighten(int z) {
        System.out.println("arrrgh");
        return true;
    }
B:
boolean frighten(byte b) {
        System.out.println("a bite?");
        return true;
    }
 */