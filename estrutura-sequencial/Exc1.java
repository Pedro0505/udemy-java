import java.util.Scanner;

public class Exc1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x, y;

    x = sc.nextInt();
    y = sc.nextInt();

    int sum =  x + y;

    System.out.printf("SOMA = %d\n", sum);

    sc.close();
  }   
}
