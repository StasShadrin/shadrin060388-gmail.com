package tasks;

/**
 * Написать программу высчитывающую факториал введённого целого числа.
 */
public class Task5 {

    public static void main(String[] args) {
        long digit = 15;
        System.out.println(getFactorial(digit));
    }

    static long getFactorial(long digit) {
        long sum = 1;
        for (int i = 1; i <= digit; i++) {
            sum *= i;
        }
        return sum;
    }
}

