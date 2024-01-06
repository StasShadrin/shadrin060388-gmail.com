package tasks;

/**
 * 3. Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
 * Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля")
 */
public class Task3 {
    public static void main(String[] args) {

        int rubles = 203;
        System.out.println(endWord(rubles));

    }

    static String endWord (int rubles){
        int lastDigitRubles = rubles % 10;
        int twoLastDigitRubles = rubles % 100;

        if (lastDigitRubles == 1 && twoLastDigitRubles != 11)
            return rubles + " рубль";

        if(lastDigitRubles > 1 && lastDigitRubles < 5 && (twoLastDigitRubles  < 12 || twoLastDigitRubles > 15))
            return rubles + " рубля";

        return rubles + " рублей";
    }
}
