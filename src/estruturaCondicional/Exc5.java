package estruturaCondicional;

import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        double totalPrice = 0.00;

        int code, quantity;

        System.out.println("Digite o código do produto:");
        code = sc.nextInt();
        
        System.out.println("Digite a quantidade do produto:");
        quantity = sc.nextInt();

        if (code == 1) {
            totalPrice = (double) quantity * 4.00;
        }
        else if (code == 2) {
            totalPrice = (double) quantity * 4.50;
        } 
        else if (code == 3) {
            totalPrice = (double) quantity * 5.00;
        }
        else if (code == 4) {
            totalPrice = (double) quantity * 2.00;
        }
        else {
            totalPrice = (double) quantity * 1.50;
        }

        System.out.printf("Total: R$ %.2f\n", totalPrice);

        sc.close();
    }
}
