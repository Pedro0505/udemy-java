package estruturaCondicional;

import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        double x, y;

        System.out.println("Digite o valor de x:");
        x = sc.nextDouble();

        System.out.println("Digite o valor de y:");
        y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } 
        else if (x < 0 &&  y < 0) {
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        else {
            System.out.println("Origem");
        }

        sc.close();
    }
}