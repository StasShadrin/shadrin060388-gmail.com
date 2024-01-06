package tasks;

/**
 * 2. Дано целое число. Определить, является ли последняя цифра этого числа – цифрой 3.
 */
public class Task2 {

    public static void main(String[] args) {
       int digit = 3467;
        System.out.println(lastDigit(digit));

    }

    static String lastDigit(int digit){

        if (digit % 10 == 3)
            return "Последня цифра числа является 3";

        return "Последня цифра числа НЕ является 3";

    }
}
