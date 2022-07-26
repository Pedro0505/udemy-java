package excFixVetores.sumVectors.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int numbers = sc.nextInt();
        int[] vectA = new int[numbers];
        int[] vectB = new int[numbers];

        System.out.println("Digite os valores do vetor A:");

        for (int i = 0; i < vectA.length; i += 1) {
            int numbersA = sc.nextInt();
            vectA[i] = numbersA;
        }

        System.out.println("Digite os valores do vetor B:");

        for (int i = 0; i < vectB.length; i += 1) {
            int numbersB = sc.nextInt();
            vectB[i] = numbersB;
        }

        System.out.println("VETOR RESULTANTE:");

        for (int i = 0; i < vectA.length; i += 1) {
            int sum = vectA[i] + vectB[i] ;
            System.out.println(sum);
        }

        sc.close();
    }
}
