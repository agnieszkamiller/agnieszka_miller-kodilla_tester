package com.kodilla.bank.homework;

import java.util.Arrays;

public class Bank {

    private CashMachine[] cashMachines = new CashMachine[2];

    void provideTransactionInSeveralCashMachines() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(10);
        cashMachine1.addTransaction(-5);
        System.out.println(cashMachine1.calculatingSaldo());

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(100);
        cashMachine2.addTransaction(-50);
        cashMachine2.addTransaction(-10);
        System.out.println(cashMachine2.calculatingSaldo());

        cashMachines[0] = cashMachine1;
        cashMachines[1] = cashMachine2;
    }

    public int sumSaldoFromAllCashMachines() {  // metoda zawierająca całkowity bilans ze wszystkich bankomatów,
        int totalSaldo = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalSaldo += cashMachines[i].calculatingSaldo();
        }
        return totalSaldo;
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public int sumWithdrawalNumber() { // metoda zawierająca liczbę transakcji związanych z wypłatą,
        int totalNumberWithdrawal = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalNumberWithdrawal += cashMachines[i].withdrawalCounting();
        }
        return totalNumberWithdrawal;
    }

    public int sumDepositNumber() {// metoda zawierająca liczbę transakcji związaną z wpłatą pieniędzy,
        int totalNumberDeposit = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalNumberDeposit += cashMachines[i].depositCounting();
        }
        return totalNumberDeposit;
    }

    public int averageWithdrawalAmount() { // metoda zawierająca średnią wartość wypłaty,
        int totalWithdrawal = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalWithdrawal += cashMachines[i].sumWithdrawalAmount();
        }
        return totalWithdrawal/sumWithdrawalNumber();
    }

    public int averageDepositAmount() {// metoda zawierająca średnią wartość wpłaty.
        int totalDeposit = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalDeposit += cashMachines[i].sumDepositAmount();
            }
        return totalDeposit/sumDepositNumber();
    }
}
