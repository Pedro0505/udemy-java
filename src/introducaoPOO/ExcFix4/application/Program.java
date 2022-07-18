package introducaoPOO.ExcFix4.application;

import java.util.Scanner;

import introducaoPOO.ExcFix4.utils.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        CurrencyConverter.dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.dollarSeller = sc.nextDouble();
        
        System.out.printf("Amount to be paid in reais = %.2f\n", CurrencyConverter.calcAmount());

        sc.close();
    }
}
