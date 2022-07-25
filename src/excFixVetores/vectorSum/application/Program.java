package excFixVetores.vectorSum.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numbers = sc.nextInt();
        
        double sum = 0.00;
        double average = 0.00;

        double[] vect = new double[numbers];

        for (int i = 0; i < vect.length; i += 1) {
            System.out.print("Digite um numero: ");
            double number = sc.nextDouble();
            vect[i] = number;
        }

        for (int i = 0; i < vect.length; i += 1) {
            sum += vect[i];
        }

        System.out.print("VALORES = ");

        for (int i = 0; i < vect.length; i += 1) {
            System.out.printf("%.1f  ", vect[i]);
        }

        average = sum / vect.length;

        System.out.println();
        System.out.printf("SOMA = %.2f\n", sum);
        System.out.printf("MEDIA = %.2f\n", average);

        sc.close();
    }
}
