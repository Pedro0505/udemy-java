package tratamentoDeExcecoes.application;

import java.util.Scanner;

import tratamentoDeExcecoes.model.entities.Account;
import tratamentoDeExcecoes.model.exceptions.OutOfWithDrawLimitExeption;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.next();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withdraw = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);
            account.withdraw(withdraw);

            System.out.print(account);
        } catch (OutOfWithDrawLimitExeption e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
