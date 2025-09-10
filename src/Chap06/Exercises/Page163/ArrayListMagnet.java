package Chap06.Exercises.Page163;

import java.util.ArrayList;

public class ArrayListMagnet {
    public static void main(String[] args) {
        // Create a resizable list of Strings
        ArrayList<String> a = new ArrayList<String>();

        // Build the initial list in a specific order by inserting at indices
        a.add(0, "zero");   // [zero]
        a.add(1, "one");    // [zero, one]
        a.add(2, "two");    // [zero, one, two]
        a.add(3, "three");  // [zero, one, two, three]

        printList(a);       // -> zero one two three

        // If "three" exists, append "four" to the end.
        // (Demonstrates contains + simple append)
        if (a.contains("three")) {
            a.add("four");  // [zero, one, two, three, four]
        }

        // Remove by INDEX (not by value). Index 2 removes "two".
        a.remove(2);        // [zero, one, three, four]

        printList(a);       // -> zero one three four

        // If "four" is NOT at index 4, insert "4.2" at index 4.
        // Since "four" is currently at index 3, this condition is true.
        if (a.indexOf("four") != 4) {
            a.add(4, "4.2"); // [zero, one, three, four, 4.2]
        }

        printList(a);       // -> zero one three four 4.2

        // Only append "2.2" if "two" is present.
        // It's NOT (we removed it earlier), so nothing happens.
        if (a.contains("two")) {
            a.add("2.2");
        }

        printList(a);       // -> zero one three four 4.2
    }

    // Utility method to print list contents on one line
    public static void printList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
