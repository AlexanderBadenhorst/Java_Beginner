package Chap10.Page303;

// -------------------------------
// Example WITHOUT static imports
// -------------------------------
class NoStatic {
    public static void main(String[] args) {
        // Print a header so we know which version is running
        System.out.println("Without static import:");

        // Calling Math methods the usual way:
        // - Must prefix with "Math." because sqrt() and tan() are static methods in java.lang.Math
        System.out.println("sqrt(2.0) = " + Math.sqrt(2.0));
        System.out.println("tan(60) = " + Math.tan(60));
    }
}