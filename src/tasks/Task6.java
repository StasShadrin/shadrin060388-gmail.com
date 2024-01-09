package tasks;

/** В 1626 году индейцы продали Манхэттен за 24$.
    Написать программу, которая высчитывает сумму,
    получившуюся бы в текущем году, если бы индейцы положили эти
    деньги в банк под 5% годовых.
  */
public class Task6 {
    public static void main(String[] args) {
        int yearOfSale = 1626;
        int amountSale = 24;
        int percent = 5;
        System.out.println(moneyInBank(yearOfSale,amountSale,percent));
    }
     static double moneyInBank (int yearOfSale, int amountSale, int percent){
        double count = amountSale;
        int yearNow = 2024;
        for (int i = yearOfSale + 1; i <= yearNow; i++){
            count = count + (count * percent / 100);
        }
        return count;
     }
}
