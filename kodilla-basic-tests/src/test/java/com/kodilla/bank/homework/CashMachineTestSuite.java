package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    private CashMachine cashMachine;

    @BeforeEach
    public void creatingCashMachineObject() {
        cashMachine = new CashMachine();
    }

    @Test
    public void AddTransactionMethodIfNoAddTransactionProvided(){
        //when
        //then
        assertEquals(0, cashMachine.getTransactions().length);
    }

    @Test
    public void ifAddTransactionMethodWorksCorrect() {
        //given
        //when
        cashMachine.addTransaction(10);
        cashMachine.addTransaction(10);
        int[] transactions = cashMachine.getTransactions();
//        then
        assertEquals(2, transactions.length);
    }

    @Test
    public void ifSaldoCorrectWhenNoTransactions(){
        //given
        //when
        //then
        assertEquals(0,cashMachine.calculatingSaldo());
    }

    @Test
    public void ifSaldoTransCorrect() {
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        int result = cashMachine.calculatingSaldo();
        assertEquals(50, result);
    }
    @Test
    public void ifTransactionNumberIsCorrect(){
        //given
        //when
        cashMachine.addTransaction(250);
        //then
        assertEquals(1, cashMachine.getTransactions().length);
    }


}
