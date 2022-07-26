package excFixVetores.pairNumbers.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numbers = sc.nextInt();
        
        int[] vect = new int[numbers];
        int evenNumbers = 0;

        for (int i = 0; i < vect.length; i += 1) {
            System.out.print("Digite um numero: ");
            int number = sc.nextInt();
            vect[i] = number;
        }

        System.out.println("NUMEROS PARES: ");

        for (int i = 0; i < vect.length; i += 1) {
            if (vect[i] % 2 == 0) {
                evenNumbers += 1;
                System.out.printf("%d ", vect[i]);
            }
        }

        System.out.println();
        System.out.printf("QUANTIDADE DE PARES = %d\n", evenNumbers);

        sc.close();
    }
}
