package tasks;

/**
 * 1. Дан порядковый номер месяца. Вывести на консоль пору года, к которой относится месяц.
 */
public class Task1 {
    public static void main(String[] args) {
        int month = 1;
        System.out.println(Season(month));
    }

    static String Season (int month) {
        return switch (month) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> null;
        };
    }
}
