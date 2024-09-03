package com.internsip.codsoft2;
import java.util.Scanner;


public class ATM {
	private BankAccount account; // Bank account associated with this ATM

    // Constructor to initialize the ATM with a bank account
    public ATM(BankAccount account) {
        this.account = account;
    }

    // Method to display the ATM menu and process user choices
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Display menu options
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option (1-4): ");

            int option = scanner.nextInt(); // Read the user's choice

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting. Thank you for using the ATM.");
                    scanner.close();
                    return; // Exit the loop and end the program
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }

    // Method to check the account balance
    private void checkBalance() {
        System.out.println("Current balance: $" + account.getBalance());
    }

    // Method to deposit money into the account
    private void deposit(double amount) {
        account.deposit(amount);
    }

    // Method to withdraw money from the account
    private void withdraw(double amount) {
        account.withdraw(amount);
    }

    public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount myAccount = new BankAccount(1000.00);

        // Create an ATM associated with the bank account
        ATM atm = new ATM(myAccount);

        // Show the ATM menu and start interacting with the user
        atm.showMenu();
    }
}
