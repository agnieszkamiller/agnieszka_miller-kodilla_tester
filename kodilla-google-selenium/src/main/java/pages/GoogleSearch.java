package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;
    private GoogleResults googleResults;

    public GoogleSearch(WebDriver driver){
        super(driver);
    }

    public void searchResults() {
//        C:\kodilla-course\kodilla-google-selenium\chromedriver.exe
        //System.setProperty("webdriver.chrome.driver", "C:\\kodilla-course\\kodilla-google-selenium\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
        //driver.navigate().to("http://www.google.com");
        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla");
//        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        googleResults = loadResults(driver);
        googleResults.iSeeResults();
        googleResults.oneRandomResult();
        //driver.close();
    }

    public GoogleResults loadResults(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }
}
