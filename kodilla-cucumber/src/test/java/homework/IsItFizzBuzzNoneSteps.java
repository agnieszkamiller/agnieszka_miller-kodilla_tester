package homework;

import io.cucumber.java8.En;
import io.cucumber.java8.Fi;
import org.junit.Assert;

public class IsItFizzBuzzNoneSteps implements En {
    private int number;
    private String answer;


    public IsItFizzBuzzNoneSteps() {


        Given("given number is {int}", (Integer int1) -> {
            this.number = int1;
        });

        When("I ask about the password for the given number", () -> {
            FizzBuzzNone fizzBuzzNone = new FizzBuzzNone();
            this.answer = fizzBuzzNone.getNumber(number);
        });


        Then("You should say {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });

    }
}
