import java.util.Locale;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double radius, result, pi;

        radius = sc.nextDouble();

        pi = 3.14159;

        result = pi * Math.pow(radius, 2);

        System.out.printf("A = %.4f\n", result);

        sc.close();
    }
}
