package com.atm.model;
import java.util.Scanner;

public class Account {
    private String accountNumber;
    private String pin;
    private double balance;
    public static final int MinBalance = 50000;


    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // Getter dan Setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        this.balance -= amount;
    }

    public void changePin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan PIN lama: ");
        String oldPin = scanner.nextLine();
    
        if (oldPin.equals(this.pin)) {
            System.out.print("Masukkan PIN baru: ");
            String newPin = scanner.nextLine();
            System.out.print("Konfirmasi PIN baru: ");
            String confirmPin = scanner.nextLine();
    
            if (newPin.equals(confirmPin)) {
                this.pin = newPin;
                System.out.println("PIN berhasil diubah.");
            } else {
                System.out.println("PIN baru tidak sesuai.");
            }
        } else {
            System.out.println("PIN lama salah.");
        }
    }
    
    public void withdraw(double amount) {
        if (hasSufficientBalance(amount)) {
            this.balance -= amount;
        } else {
            System.out.println("Minimal Saldo tidak mencukupi untuk melakukan transaksi ini.");
        }
    }

    public boolean hasSufficientBalance(double amount) {
        return (this.balance - amount >= MinBalance);
    }

    
}
