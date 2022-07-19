package POO2.ExcFix1.application;

import java.util.Scanner;

import POO2.ExcFix1.entites.Account;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int accountNumber;
        String name;
        char confirm;
        double balance;
        Account account;

        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        confirm = sc.next().charAt(0);

        if (confirm == 'y')  {
            sc.nextLine();
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
            
            account = new Account(accountNumber, name, balance);
        } else {
            account = new Account(accountNumber, name);
        }
        
        
        System.out.println("");
        System.out.println("Account data: ");
        System.out.print(account);

        System.out.print("Enter a deposit value: ");
        balance = sc.nextDouble();

        System.out.println("Updated account data: ");
        account.deposit(balance);

        System.out.print(account);

        System.out.print("Enter a withdraw value: ");
        balance = sc.nextDouble();

        System.out.println("Updated account data: ");
        account.withdraw(balance);

        System.out.print(account);

        sc.close();
    }
}
