/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_7_Aug_25_2014;
/*
import java.io.FileInputStream;
import java.io.FileNotFoundException;*/
import java.util.Scanner;
import java.io.PrintStream;

/**
 *
 * @author iiita
 */
class Account {

    float balance;
    String accountHolder;
    long accountNumber;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public float getBalance() {
        return balance;
    }

    public void credit(float amount) {
        balance += amount;
    }

    public void debit(float amount) {
        balance -= amount;
    }
}

class SavingsAccount extends Account {

    final float rateOfInterest = 4.5f;

    public float calculateInterest() {
        return (balance * rateOfInterest / 100);
    }
}

class CheckingAccount extends Account {

}

class Bank {

    static Scanner scn;
    static PrintStream pst;
    boolean fileInput;

    public Bank() {
        pst = System.out;
/*
        try {
            scn = new Scanner(new FileInputStream("assign_7_q1.txt"));
            fileInput = true;
            pst.println("Data File Found");
            pst.println("Reading file input...\n");
        } catch (FileNotFoundException e) {
            pst.println("File Not Found");
            pst.println("Taking user input...\n");*/
            scn = new Scanner(System.in);
            /*fileInput = false;
        }*/
    }

    public static void main(String args[]) {
        int i;
        final int numberOfInputs = 3;
        SavingsAccount sac[];
        CheckingAccount cac[];
        Bank ban;

        ban = new Bank();
        sac = new SavingsAccount[numberOfInputs];
        cac = new CheckingAccount[numberOfInputs];

        pst.println("Enter the details of " + numberOfInputs + " Savings Accounts:-");
        for (i = 0; i < numberOfInputs; i++) {
            pst.println("\nEnter the details of Account " + (i + 1) + ":-");
            sac[i] = new SavingsAccount();
            ban.input(sac[i]);
        }

        pst.println("\nEnter the details of " + numberOfInputs + " Checking Accounts");
        for (i = 0; i < numberOfInputs; i++) {
            pst.println("\nEnter the details of Account " + (i + 1) + ":-");
            cac[i] = new CheckingAccount();
            ban.input(cac[i]);
        }
        
        pst.println("\n==========================");

        pst.println("\nThe details of the " + numberOfInputs + " Savings Accounts are:-");
        for (i = 0; i < numberOfInputs; i++) {
            pst.println("\nDetails of Account " + (i + 1) + ":-");
            ban.output(sac[i]);
        }

        pst.println("\nThe details of the " + numberOfInputs + " Checking Accounts are:-");
        for (i = 0; i < numberOfInputs; ++i) {
            pst.println("\nDetails of Account " + (i + 1) + ":-");
            ban.output(cac[i]);
        }
    }

    public void input(Account acc) {
        float credit;
        float debit;
        
        pst.print("Account Number:\t\t");
        acc.setAccountNumber(scn.nextLong());
        scn.nextLine();
        /*
        if (fileInput) {
            pst.println(acc.getAccountNumber());
        }
*/
        pst.print("Account Holder:\t\t");
        acc.setAccountHolder(scn.nextLine());
  /*      
        if (fileInput) {
            pst.println(acc.getAccountHolder());
        }
*/
        pst.print("Account Balance:\t");
        acc.setBalance(scn.nextFloat());
        /*
        if (fileInput) {
            pst.println(acc.getBalance());
        }
*/
        pst.print("Amount Credited:\t");
        credit = scn.nextFloat();
        acc.credit(credit);
        /*
        if (fileInput) {
            pst.println(credit);
        }
*/
        pst.print("Amount Debited:\t\t");
        debit = scn.nextFloat();
        acc.debit(debit);
        /*
        if (fileInput) {
            pst.println(debit);
        }
*/
        if (acc instanceof SavingsAccount) {
            acc.credit(((SavingsAccount) acc).calculateInterest());
        }
    }

    public void output(Account acc) {
        pst.println("Account Number:\t\t" + acc.getAccountNumber());
        pst.println("Account Holder:\t\t" + acc.getAccountHolder());
        pst.println("Account Balance:\t" + acc.getBalance());
    }
}
