package excFixVetores.highest_position.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numbers = sc.nextInt();
        int numberPosition = 0;
        double biggesterNumber = 0.00;
        
        double[] vect = new double[numbers];

        for (int i = 0; i < vect.length; i += 1) {
            System.out.print("Digite um numero: ");
            double number = sc.nextDouble();
            vect[i] = number;
        }

        for (int i = 0; i < vect.length; i += 1) {
            if (vect[i] > biggesterNumber) {
                biggesterNumber = vect[i];
                numberPosition = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.2f\n", biggesterNumber);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", numberPosition);

        sc.close();
    }
}
