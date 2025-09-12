package Chap07.Page193;

public class Overloads {
    // Instance field to hold an identifier for this object (defaults to null until set)
    String uniqueID;

    //The addNums methods are package-private (no modifier), while the setUniqueID methods are public.

    // Overloaded method 1:
    // Same name (addNums), different parameter types than the double version below.
    // This one accepts two ints and returns an int.
    int addNums(int a, int b) {
        return a + b;
    }

    // Overloaded method 2:
    // Same method name, but parameters are doubles, so this version is chosen
    // when you pass doubles (or expressions that widen to double).
    double addNums(double a, double b) {
        return a + b;
    }

    // Overloaded method 3:
    // Setter that takes a String and stores it as the uniqueID.
    // (Imagine validation here: format checks, not-null, length limits, etc.)
    public void setUniqueID(String theID) {
        // lots of validation code, and then:
        uniqueID = theID;
    }

    // Overloaded method 4:
    // Another setter with the SAME NAME but a DIFFERENT PARAMETER LIST (int).
    // This demonstrates overloading + delegation: it converts the int to String,
    // then reuses the String-based setter to keep the logic in one place (DRY).
    public void setUniqueID(int ssNumber) {
        // Quick int -> String conversion; could also use String.valueOf(ssNumber)
        String numString = "" + ssNumber;
        setUniqueID(numString); // delegate to the String version
    }

    // Simple getter to read the current uniqueID value
    public String getUniqueID() {
        return uniqueID;
    }
}
