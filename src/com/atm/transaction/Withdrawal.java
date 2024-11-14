package com.atm.transaction;
import com.atm.model.Account;
import java.util.Scanner;

public class Withdrawal extends Transaction {

    public Withdrawal(Account account) {
        super(account);
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Uang yang ingin diambil: ");
        double amount = scanner.nextInt();

        if (account.hasSufficientBalance(amount)) {    
            account.withdraw(amount);    
            System.out.println("Transaksi Berhasil.");    
        } else {
                System.out.println("Minimal saldo tidak mencukupi untuk melakukan transaksi ini.");
        }
    }

}
