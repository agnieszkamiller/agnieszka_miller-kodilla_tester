package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class PreventUsersSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public PreventUsersSteps(){

        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals(100, wallet.getBalance());
        });

        When("I withdraw $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 0);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });

        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assert.assertEquals("I should be told that I don't have enough money in my wallet", 170, wallet.getBalance());
        });
    }
}
