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
        cashMachine1.addTransaction(1);
        cashMachine2.addTransaction(1);

        bank.add(cashMachine1);
        bank.add(cashMachine2);
        //than
        assertEquals(2, bank.sumSaldoFromAllCashMachines());
    }

    @Test
    public void ifSumSaldoFromAllCashMachinesCorrectWhenSeveralTransactions() {
        //given
        cashMachine1.addTransaction(1);
        cashMachine1.addTransaction(1);
        cashMachine2.addTransaction(1);
        cashMachine2.addTransaction(1);

        //when
        bank.add(cashMachine1);
        bank.add(cashMachine2);
        //than
        assertEquals(4, bank.sumSaldoFromAllCashMachines());

    }

    @Test
    public void ifSumWithdawalNumberIsCorrect() {
        cashMachine1.addTransaction(-1);
        cashMachine1.addTransaction(-1);
        cashMachine2.addTransaction(-1);
        //when
        bank.add(cashMachine1);
        bank.add(cashMachine2);
        //than
        assertEquals(3, bank.sumWithdrawalNumber());
    }

    @Test
    public void ifSumDepositNumberIsCorrect() {
        cashMachine1.addTransaction(1);
        cashMachine2.addTransaction(1);
        //when
        bank.add(cashMachine1);
        bank.add(cashMachine2);
        //than
        assertEquals(2, bank.sumDepositNumber());
    }

    @Test
    public void ifAverageWithdrawalAmountIsCorrect() {
        cashMachine1.addTransaction(-1);
        cashMachine1.addTransaction(-1);
        cashMachine2.addTransaction(-1);
        //when
        bank.add(cashMachine1);
        bank.add(cashMachine2);
        //than
        assertEquals(-1, bank.averageWithdrawalAmount());
    }

    @Test
    public void ifAverageDepositAmountIsCorrect() {
        cashMachine1.addTransaction(1);
        cashMachine1.addTransaction(1);
        cashMachine2.addTransaction(1);
        //when
        bank.add(cashMachine1);
        bank.add(cashMachine2);
        //than
        assertEquals(1, bank.averageDepositAmount());
    }
}
