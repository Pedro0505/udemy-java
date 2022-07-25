package excFixVetores.height.application;

import java.util.Scanner;

import excFixVetores.height.entites.Person;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int numberOfPersons = sc.nextInt();

        Person[] vect = new Person[numberOfPersons];
        double heightSum = 0.00;
        int lessThanSixteen = 0;

        String name;
        int age;
        double height;

        for (int i = 0; i < vect.length; i += 1) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome:");
            name = sc.next();
            System.out.print("Idade: ");
            age = sc.nextInt();
            System.out.print("Altura: ");
            height = sc.nextDouble();

            Person person = new Person(name, age, height);;

            vect[i] = person;
        }

        for (int i = 0; i < vect.length; i += 1) {
            if (vect[i].getAge() < 16) {
                lessThanSixteen += 1;
            }

            heightSum += vect[i].getAge();
        }

        heightSum = heightSum / vect.length;
        int percentage = lessThanSixteen * 100 / vect.length;

        System.out.printf("Altura média: %.2f\n", heightSum);
        System.out.printf("Pessoas com menos de 16 anos: %d%%\n", percentage);

        for (int i = 0; i < vect.length; i += 1) {
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
