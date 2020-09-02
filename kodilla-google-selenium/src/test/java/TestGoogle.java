import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GoogleSearch;

public class TestGoogle {

    WebDriver driver;

    @Before
    public void testSetup(){
        System.setProperty("webdriver.chrome.driver", "C:\\kodilla-course\\kodilla-google-selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void testGooglePage(){
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }



    @Test
    public void testOneRandomResult(){

    }




   // System.out.println(driver);
   // WebDriverWait wait =  new WebDriverWait(driver, 10);
}
