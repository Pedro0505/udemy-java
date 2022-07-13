import java.util.Locale;
import java.util.Scanner;

public class Exc6 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    double A, B, C, pi, triangle, cicle, trapezium, square, rectangle;

    A = sc.nextDouble();
    B = sc.nextDouble();
    C = sc.nextDouble();

    pi = 3.14159;

    triangle = (A * C) / 2;
    cicle = pi * Math.pow(C, 2);
    trapezium = ((A + B) * C) / 2;
    square = Math.pow(B, 2);
    rectangle = A * B;

    System.out.println("");
    System.out.printf("TRIANGULO: %.3f\n", triangle);
    System.out.printf("CIRCULO: %.3f\n", cicle);
    System.out.printf("TRAPEZIO: %.3f\n", trapezium);
    System.out.printf("QUADRADO: %.3f\n", square);
    System.out.printf("RETANGULO: %.3f\n", rectangle);

    sc.close();
  }
}
