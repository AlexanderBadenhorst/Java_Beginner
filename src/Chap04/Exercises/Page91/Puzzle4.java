package Chap04.Exercises.Page91;

public class Puzzle4 {
    public static void main(String[] args) {
        Value[] values = new Value[6]; //first answer
        int number = 1;
        int i = 0;
        while (i < 6) {
            values[i] = new Value(); //2nd answer
            values[i].intValue = number; //3rd answer
            number = number * 10;
            i = i + 1; //4th answer
        }
        int result = 0;
        i = 6;
        while (i > 0) {
            i = i - 1; //5th answer
            result = result +
                    values[i].doStuff(i); //6th answer
        }
        System.out.println("result " + result);
    }
}
class Value { //value = 7th answer
    int intValue;
    public int doStuff(int factor) { //public int = 8th answer, factor = 9th answer
        if (intValue > 100) {
            return intValue * factor; //intValue * factor = 10th answer
        } else {
            return intValue * (5 - factor); //intValue * (5 - factor) = 11th answer
        }

    }
}

//output:
//result 543345

//explanations:
//1. Value[] values = new Value[6];
//Explanation: Creates an array of 6 Value objects to store data used later in the loop.

//2. values[i] = new Value();
//Explanation: Instantiates a new Value object at each index so we can set and use its intValue.

//3. values[i].intValue = number;
//Explanation: Assigns the current number to the object’s field so it can be used in calculations.

//4. i = i + 1;
//Explanation: Moves to the next array index so the loop fills all 6 elements.

//5. i = i - 1;
//Explanation: Counts backwards through the array to process elements from last to first.

//6. result = result + values[i].doStuff(i);
//Explanation: Calls doStuff() for each Value, adds its return value to the running total.

//7. class Value
//Explanation: Defines the Value type used in the array and calculations.

//8. public int doStuff(int factor)
//Explanation: Method returns an int (the calculation), takes one parameter called factor.

//9. factor
//Explanation: Represents the current index passed into doStuff(), used in the math.

//10. return intValue * factor;
//Explanation: If intValue is large, multiply by the index (factor).

//11. return intValue * (5 - factor);
//Explanation: If intValue is small, multiply by a decreasing value to adjust the result.

