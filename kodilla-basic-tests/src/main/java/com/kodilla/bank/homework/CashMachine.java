package com.kodilla.bank.homework;

public class CashMachine {
    private int transactions[];
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void addTransaction(int transaction) {
        this.size++;
        int tempTrans[] = new int[this.size];
        System.arraycopy(transactions, 0, tempTrans, 0, transactions.length);
        tempTrans[this.size - 1] = transaction;
        this.transactions = tempTrans;
    }

    public int calculatingSaldo() {
        int saldoTrans = 0;
//        for (int i = 0; i < transactions.length; i++) {
//            saldoTrans = saldoTrans + transactions[i];
//        }

        // int - określenie typu zbioru, po jaki iterujemy| transaction - wskazanie jednego elementu
        // | transactions - nazwa tablicy po jakiej iterujemy

        for (int transaction : transactions) {
            saldoTrans = saldoTrans + transaction;
        }
        return saldoTrans;
    }
    // metoda podająca liczbe wykonanych trasakcji, operacji wogóle

    public int countingNumberOfTrans() {
        int transNumb = transactions.length;
        return transNumb;

    }

    public int withdrawalCounting() {
        int counter = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                counter++;
            }
        }
        return counter;
    }

    public int depositCounting() {
        int counter = 0;
        for (int i = 1; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                counter++;
            }
        }
        return counter;
    }

    public int sumWithdrawalAmount(){
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                sum+= transactions[i];
            }
        }
        return sum;
    }


    public int[] getTransactions() {
        return transactions;
    }
}
