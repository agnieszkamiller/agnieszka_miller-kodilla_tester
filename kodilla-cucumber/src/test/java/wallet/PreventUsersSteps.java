package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class PreventUsersSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private int balance;

    public PreventUsersSteps(){
//
//        Given("there is $100 in my wallet", () -> {
//            wallet.deposit(100);
//            Assert.assertEquals(100, wallet.getBalance());
//        });
//
//        When("I withdraw $200", () -> {
//            Cashier cashier = new Cashier(cashSlot);
//            cashier.withdraw(wallet, 0);
//        });
//
//        Then("nothing should be dispensed", () -> {
//            Assert.assertEquals(100, wallet.getBalance());
//        });
//
//        Then("I should be told that I don't have enough money in my wallet", () -> {
//            Assert.assertEquals("I should be told that I don't have enough money in my wallet", 100, wallet.getBalance());
//        });
//
//                //        When("I check the balance of my wallet", () -> {
//                //            wallet.getBalance();
//                //        });
//                //
//                //        Then("I should see that the balance is $100", () -> {
//                //            System.out.println("Your balance is: " + wallet.getBalance());
//                //        });
//
//        Given("there is $ {int} in my wallet", (Integer int1) -> {
//            wallet.deposit(int1);
//        });
//
//        When("I check the balance of my wallet", () -> {
//            balance = wallet.getBalance();
//        });
//
//        Then("I should see that the balance is $ {int}", (Integer int1) -> {
//            System.out.println("Your balance is: " + balance);
//        });


    }
}
