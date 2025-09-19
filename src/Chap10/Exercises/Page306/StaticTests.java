package Chap10.Exercises.Page306;

class StaticSuper {
    static {
        System.out.println("super static block");
    }

    StaticSuper() {
        System.out.println("super constructor");
    }
}

public class StaticTests extends StaticSuper {
    static int rand;

    static {
        rand = (int) (Math.random() * 6);
        System.out.println("static block " + rand);
    }

    StaticTests() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }
}

/*
Possible outputs:
1:
%java StaticTests
static block 4
in main
super static block
super constructor
constructor

incorrect as:
The first “possible output” shown in the book is wrong for Java’s rules because it puts the
subclass’s static block before the superclass’s, and even delays the superclass’s static block
until after main. Java always initializes the superclass static first, then the subclass static,
then runs main.

2:
%java StaticTests
super static block
static block 3
in main
super constructor
constructor

correct:
- it’s all about initialization order.

When you run StaticTests, the JVM does this in order:

1: Load & initialize superclasses first → run StaticSuper’s static blocks.
    Output: super static block

2: Then initialize the class you’re running (StaticTests) → run its static vars/blocks once.
    Output: static block <rand> (0–5, random)

3: Only after class initialization finishes does the JVM call main.
    Output: in main

4: Inside main, you do new StaticTests() → instance construction runs:
    -Call super constructor first → super constructor
    -Then subclass constructor → constructor
 */