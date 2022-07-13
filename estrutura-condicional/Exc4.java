import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C;
        int result = 0;

        System.out.println("Digite a hora de inicio:");

        A = sc.nextInt();

        System.out.println("Digite a hora que terminou:");

        B = sc.nextInt();

        if (A == 0 || B == 0 || B < A) {
            C = B + 24;

            result = Math.abs(C - A);
        } else {
            result = Math.abs(A - B);
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n", result);

        sc.close();
    }
}
