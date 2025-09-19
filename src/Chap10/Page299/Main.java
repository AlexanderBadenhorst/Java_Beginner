package Chap10.Page299;

public class Main {
    public static void main(String[] args) {
        // String.format() lets us build a formatted string using a "mini-language"
        // Inside the format string, "%.2f" is a *format specifier*:
        //   %    → marks the start of a format instruction
        //   .2   → precision: keep 2 digits after the decimal point
        //   f    → format as a floating-point number
        //
        // So, "%.2f" tells Java: "format this number as a floating-point with 2 decimal places"
        // The number 476578.09876 gets rounded to 476578.10.
        // String result = String.format("I have %.2f, bugs to fix.", 476578.09876);
        String result = String.format("I have %,.2f bugs to fix.", 476578.09876);

        // Prints: I have 476578.10, bugs to fix.
        System.out.println(result);
    }
}
/*
The % signals a special formatting instruction.

The .2f part is not literal text; it’s parsed as “two decimal places, floating-point.”

That’s why Java doesn’t print %, .2, or f literally — it interprets them as formatting instructions.
 */