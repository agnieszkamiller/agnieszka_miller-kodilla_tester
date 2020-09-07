import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.GoogleResults;
import pages.GoogleSearch;
import pages.ResultRandomPage;
import sun.jvm.hotspot.debugger.Page;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class TestGoogle {

    private WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\kodilla-course\\kodilla-google-selenium\\src\\main\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }

    @Test
    public void testOneRandomResult() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        GoogleResults googleResults = new GoogleResults(driver);
        WebElement webElement = googleResults.oneRandomResult();
        ResultRandomPage resultRandomPage = new ResultRandomPage(driver);

        WebElement webElement1 = resultRandomPage.clickInRandomPage(webElement);

        assertSame(webElement, webElement1);
    }

}
