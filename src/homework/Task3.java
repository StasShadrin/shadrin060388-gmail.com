package homework;

/** Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */
public class Task3 {
    public static void main(String[] args) {
        long digit = 999989757;
        System.out.println(sumDigit(digit));
    }
    static int sumDigit (long digit){
        int sum = 0;
        while (digit > 0){
            sum += digit % 10;
            digit /=10;
        }
        return sum;
    }
}
