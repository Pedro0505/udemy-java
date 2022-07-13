import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.println("Digite um número:");

        A = sc.nextInt();

        System.out.println("Digite outro número:");

        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
