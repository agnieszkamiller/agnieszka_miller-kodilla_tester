package com.kodilla.bank.homework;

import java.util.Arrays;

public class Bank {

    private CashMachine[] cashMachines;

    private int size;

    public Bank() {
        this.cashMachines = new CashMachine[0];
        this.size = 0;
    }


    public void add(CashMachine cashMachine) {
        this.size++;
        CashMachine tempCash[] = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, tempCash, 0, cashMachines.length);
        tempCash[this.size - 1] = cashMachine;
        this.cashMachines = tempCash;
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
        return totalWithdrawal / sumWithdrawalNumber();
    }

    public int averageDepositAmount() {// metoda zawierająca średnią wartość wpłaty.
        int totalDeposit = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalDeposit += cashMachines[i].sumDepositAmount();
        }
        return totalDeposit / sumDepositNumber();
    }
}
