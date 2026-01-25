package Personal;

import java.util.ArrayList;
import java.util.Scanner;

public class Project_02_Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n              ---------- Bank Menu -----------");
            System.out.println(" 1.Create Account | 2.Deposit | 3.Withdraw | 4.Check Balance | 5.Exit ");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();  // consume newline
                    System.out.print("Enter account holder name: ");
                    String name = sc.nextLine();
                    bank.createAccount(name);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int depAcc = sc.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    float depAmount = sc.nextFloat();
                    bank.deposit(depAcc, depAmount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    int witAcc = sc.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    float witAmount = sc.nextFloat();
                    bank.withdraw(witAcc, witAmount);
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    int balAcc = sc.nextInt();
                    bank.checkBalance(balAcc);
                    break;
                case 5:
                    System.out.println("Thank you for using our bank!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}


class Bank {
    private ArrayList<Account> accounts;
    private static int nextAccountNumber = 1001;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void createAccount(String accountHolderName) {
        int accountNumber = nextAccountNumber;
        nextAccountNumber++;
        Account newAccount = new Account(accountNumber, accountHolderName);
        accounts.add(newAccount);

        System.out.println("Account created successfully!");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
    }

    private Account findAccount(int accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        return null;
    }

    public void deposit(int accountNumber, float amount) {
        Account acc = findAccount(accountNumber);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found! ");
        }
    }

    public void withdraw(int AccountNumber, float amount) {
        Account acc = findAccount(AccountNumber);
        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found! ");
        }
    }

    public void checkBalance(int accountNumber) {
        Account acc = findAccount(accountNumber);
        if (acc != null) {
            System.out.println("Current balance: " + acc.getBalance());
        } else {
            System.out.println("Account not found! ");
        }
    }
}

class Account {
    private int accountNumber;
    private String accountHolderName;
    private float balance;

    public Account(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }

    public void deposit(float amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else {
            balance += amount;
            System.out.println(amount + "Deposited. Current Balance: " + balance);
        }
    }

    public void withdraw(float amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println(amount + "Withdrawn. Current Balance: " + balance);
        }
    }

    public float getBalance() {
        return balance;
    }

    public float getAccountNumber() {
        return accountNumber;
    }
}

