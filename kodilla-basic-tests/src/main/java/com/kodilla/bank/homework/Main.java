package com.kodilla.bank.homework;

public class Main {

    public static void main(String[] args) {


        Bank bank = new Bank();

        bank.provideTransactionInSeveralCashMachines();

        System.out.println(bank.sumSaldoFromAllCashMachines());

        System.out.println("***********************");
        System.out.println(bank.sumWithdrawlNumber());


    }
}
