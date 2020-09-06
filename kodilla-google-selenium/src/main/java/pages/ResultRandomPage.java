package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultRandomPage extends AbstractPage {
    //oddzielna klasa wraz z metodami reprezentującymi czynności
    // jakie można wykonywać na stronie
    // oraz z polami, reprezentującymi WebElement-y elementy HTML strony

    @FindBy(css = "div[class='g']")
    static WebElement webElement;


    public ResultRandomPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public WebElement clickInRandomPage(WebElement googleResults) {
        webElement = googleResults;
        webElement.click();
        return webElement;
    }




}
