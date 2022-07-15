package introducaoPOO.ExcFix1.application;

import java.util.Scanner;

import introducaoPOO.ExcFix1.entites.Rectangle;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        
        System.out.println("Enter rectangle width and height:");

        System.out.print("Width: ");
        rectangle.width = sc.nextDouble();

        System.out.print("Height: ");
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f\n", rectangle.area());
        System.out.printf("PERIMETER = %.2f\n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", rectangle.diagonal());

        sc.close();
    }
}
