package Java.Interview.Concepts;

public class MultiplyUsingAddition {

    public static int multiply(int a, int b) {
        int result = 0;

        // Use the smaller number as the number of iterations to minimize loops
        int iterations = Math.abs(Math.min(a, b));
        System.out.println(iterations);
        int addValue = Math.abs(Math.max(a, b));
        System.out.println(addValue);

        for (int i = 0; i < iterations; i++) {
            result += addValue;
        }

        // Handle negative numbers
        if ((a < 0 && b >= 0) || (a >= 0 && b < 0)) {
            result = -result;
        }

        return result;
    }

    public static void main(String[] args) {
        int num1 = -9;
        int num2 = -8;

        int product = multiply(num1, num2);
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + product);
    }
}

