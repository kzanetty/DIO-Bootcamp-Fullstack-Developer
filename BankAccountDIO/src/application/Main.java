package application;

import entities.*;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Client client1 = new Client("Henrique", "Henrique@gmail.com");
        Client client2 = new Client("Fulano", "Fulano@gmail.com");
        Client client3 = new Client("Ciclano", "Ciclano@gmail.com");

        Account acc1 = new CheckingAccount(client1);
        acc1.deposit(2300.49);
        Account acc2 = new SavingsAccount(client2);
        acc2.deposit(1320.21);
        acc2.transfer(490, acc1);
        Account acc3 = new CheckingAccount(client3);
        acc3.deposit(730.50);

        Bank bank = new Bank("Bank Brazil");
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        System.out.println(bank);

        sc.close();
    }
}
