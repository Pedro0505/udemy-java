import java.util.Locale;
import java.util.Scanner;

    public class Exc4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int number, hours;
        double recive, salary;

        number = sc.nextInt();
        hours = sc.nextInt();
        recive = sc.nextDouble();

        salary = hours * recive;

        System.out.printf("NUMBER = %d\n", number);
        System.out.printf("SALARY = U$ %.2f\n", salary);

        sc.close();
    }
}
