package curs12.tema;

import java.util.Scanner;

public class TestSavingsAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Create a Customer object
        Customer customer = new Customer("Alex", "Calea Plevnei", "alex@gmail.com");

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(12345, 150.0, customer);

        String name = "Alex";
		System.out.println("Hi " + name + "!"); // Greet the user

        try {
            System.out.print("Please enter the amount to withdraw: ");
            double withdrawalAmount = scan.nextDouble();
            savingsAccount.withdraw(withdrawalAmount);
            System.out.println("Please pick your money!");
            System.out.println("New balance after withdrawal: " + savingsAccount.balance);
        } catch (InsufficientFundsException e) {
            System.out.println("The amount you entered is greater than the available balance: " + savingsAccount.balance);
            e.printStackTrace();
        } finally {
            System.out.println("Thank you for using our ATM!");
        }
        scan.close();
    }
}