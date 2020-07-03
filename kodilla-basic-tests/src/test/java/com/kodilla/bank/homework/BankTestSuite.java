package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BankTestSuite {
private CashMachine cashMachine1 = new CashMachine();
private CashMachine cashMachine2 = new CashMachine();
private Bank bank = new Bank();

    @Test
    public void ifSumSaldoFromAllCashMachinesCorrectWhenNoTransaction() {
        //given
         //when
        bank.getCashMachines()[0] = cashMachine1;
        bank.getCashMachines()[1] = cashMachine2;
        //than
        assertEquals(0, bank.sumSaldoFromAllCashMachines());
    }

    @Test
    public void ifSumSaldoFromAllCashMachinesCorrectWhenSeveralTransactions() {
        //given
        cashMachine1.addTransaction(1);
        cashMachine1.addTransaction(1);
        cashMachine2.addTransaction(1);
        cashMachine2.addTransaction(1);

        //when
        bank.getCashMachines()[0] = cashMachine1;
        bank.getCashMachines()[1] = cashMachine2;
        //than
        assertEquals(4, bank.sumSaldoFromAllCashMachines());

    }


}
