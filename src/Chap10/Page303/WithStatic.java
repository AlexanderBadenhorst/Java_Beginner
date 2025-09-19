package Chap10.Page303;

// -------------------------------
// Example WITH static imports
// -------------------------------

// Import all static members of Math (sqrt, tan, etc.)
// This lets us call sqrt() and tan() directly without "Math."

import static java.lang.Math.sqrt;
import static java.lang.Math.tan;
import static java.lang.System.out;

class WithStatic {
    public static void main(String[] args) {
        // Print a header so we know which version is running
        out.println("With static import:");

        // Thanks to static import, we can call methods directly:
        // sqrt() instead of Math.sqrt(), tan() instead of Math.tan()
        out.println("sqrt(2.0) = " + sqrt(2.0));
        out.println("tan(60) = " + tan(60));
    }
}