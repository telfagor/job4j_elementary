package loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = amount + amount * percent;
            amount -= salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(year(100, 70, 0.5));
    }
}
