package genericsSetMap.exSet.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>(); 

        System.out.print("How many students for course A?");
        int courseA = sc.nextInt();

        for (int i = 0; i < courseA; i += 1) {
            int studentId = sc.nextInt();

            set.add(studentId);
        }

        System.out.print("How many students for course B?");
        int courseB = sc.nextInt();

        for (int i = 0; i < courseB; i += 1) {
            int studentId = sc.nextInt();

            set.add(studentId);
        }

        System.out.print("How many students for course C?");
        int courseC = sc.nextInt();

        for (int i = 0; i < courseC; i += 1) {
            int studentId = sc.nextInt();

            set.add(studentId);
        }

        System.out.println();
        System.out.printf("Total students: %d\n", set.size());
        
        sc.close();
    }
}
