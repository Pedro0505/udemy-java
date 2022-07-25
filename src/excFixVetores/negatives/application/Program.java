package excFixVetores.negatives.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numbers = sc.nextInt();
        
        int[] vect = new int[numbers];

        for (int i = 0; i < vect.length; i += 1) {
            System.out.print("Digite um numero: ");
            int number = sc.nextInt();
            vect[i] = number;
        }

        for (int i = 0; i < vect.length; i += 1) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
