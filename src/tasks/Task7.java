package tasks;

/** Написать программу, определяющую, является ли введённое
    целое число простым,т.е. делится без остатка только на 1 и само
    на себя.
 */

public class Task7 {
    public static void main(String[] args) {
        int value = 4;
        System.out.println(simple_number(value));
    }
    static boolean simple_number (int value){
        int count = 0;
        for (int i = 1; i < value; i++) {
            if (value % i == 0)
                count++;
        }
        return count > 1? false:true;
    }
}
