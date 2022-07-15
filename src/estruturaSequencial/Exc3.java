package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, result;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        result = ((A * B) - (C * D));

        System.out.printf("DIFERENCA = %d\n", result);

        sc.close();
    }
}
