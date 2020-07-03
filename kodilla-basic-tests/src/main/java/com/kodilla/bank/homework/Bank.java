package com.kodilla.bank.homework;

import java.util.Arrays;

public class Bank {
    // metoda zawierająca całkowity bilans ze wszystkich bankomatów,

    private CashMachine[] cashMachines = new CashMachine[2];

    void provideTransactionInSeveralCashMachines() {
        CashMachine cashMachine1 = new CashMachine();

        cashMachine1.addTransaction(-123);
        cashMachine1.addTransaction(-150);
        System.out.println(cashMachine1.calculatingSaldo());

        CashMachine cashMachine2 = new CashMachine();

        cashMachine2.addTransaction(123);
        System.out.println(cashMachine2.calculatingSaldo());

        cashMachines[0] = cashMachine1;
        cashMachines[1] = cashMachine2;
    }

    public int sumSaldoFromAllCashMachines() {
        int totalSaldo = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalSaldo += cashMachines[i].calculatingSaldo();
        }
        return totalSaldo;
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    // metoda zawierająca liczbę transakcji związanych z wypłatą,
    public int sumWithdrawlNumber() {

        int totalNumberWithdrawl = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalNumberWithdrawl += cashMachines[i].withdrawalCounting();
        }
        return totalNumberWithdrawl;
    }

    // metoda zawierająca liczbę transakcji związaną z wpłatą pieniędzy,
    // metoda zawierająca średnią wartość wypłaty,

    public int averageWithdrawlAmount() {
        int totalWithdrawl = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalWithdrawl += cashMachines[i].sumWithdrawalAmount();
        }
        return totalWithdrawl/sumWithdrawlNumber();
    }

    // metoda zawierająca średnią wartość wpłaty.
}
