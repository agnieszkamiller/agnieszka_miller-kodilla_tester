package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultRandomPage extends AbstractPage {

    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    private GoogleResults googleResults;

    public ResultRandomPage(WebDriver driver) {
        super(driver);
    }

    public void result() {
        PageFactory.initElements(this.driver, ResultRandomPage.class);
        WebElement webElement = googleResults.oneRandomResult();
        webElement.click();

    }
}
