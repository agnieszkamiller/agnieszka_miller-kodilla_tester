package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearch extends AbstractPage {


    @FindBy(css = "input[title='Szukaj']") //Zamiast z driver.findElement.. korzystamy z adnotacji @FindBy
    static WebElement inputField; //wynik przypisujemy do argumentu

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton; //wynik przypisujemy do listy argumentów

    private GoogleResults googleResults;

    public GoogleSearch(WebDriver driver) {// konstruktor, dla strony wyszukiwania analogicznie do strony wyników
        super(driver);
    }

    public void searchResults() {
        //poniższy kod przeniesiony do TestGoogle @Before
        //1. tu ustawiamy property dla sterownika przeglądarki Chrome:
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Page-Object-Model\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver(); //2. Tworzymy instancję sterownika
//        driver.navigate().to("http://www.google.com"); //3.dodajemy wywołanie metody

//korzystamy z klasy PageFactory,aby nie musieć za każdym razem
// odwoływać się do elementów strony za pomocą driver.findElement
//czyli najpierw deklarujemy wszystkie elementy strony, z których będziemy korzystać w naszych testach,
// a później je inicjalizujemy
        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla"); //w pole wyszukiwania wpisujemy "Kodilla"
//naszej zmiennej przypisujemy wynik działania metody loadResults.
//do metody przekazujemy driver, po aby kod wiedział, że nadal pracujemy na naszej przeglądarce.
        googleResults = loadResults(driver);
//wywołujemy metodę iSeeResults z klasy `GoogleResults , która wyświetla tekst w konsoli
        googleResults.iSeeResults();


    }


    public GoogleResults loadResults(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);//tworzymy instancję obiektu wait,
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();//czekamy aż przycisk "Szukaj" będzie aktywny
        return new GoogleResults(webDriver);//zwracanie strony z wynikami wyszukiwania
    }
}
