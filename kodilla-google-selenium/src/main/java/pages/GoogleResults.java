package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage{

    @FindBy(css = "div[class='g']") //selektor css do znalezienia kart przechowujących wyniki wyszukiwania.
    private List<WebElement> results;//tworzymy listę, w której będą przechowywane te karty

    public GoogleResults(WebDriver driver){//tworzymy konstruktor, do którego przekazaliśmy drivera z poprzedniej klasy
        super(driver);//Dziedziczenie wymusza aby driver był przekazany do konstruktora tej klasy jako paramet
        //inicjalizujemy naszą stronę (w konstruktorze) - gdy strona zostanie otwarta
        // będziemy mieć już dostęp do listy obiektów z linii 12
        PageFactory.initElements(this.driver, this);
    }
    public void iSeeResults(){//Metoda iSeeResults wyświetli w konsoli 2 obiekty typu String,
        // z czego drugi sprawdza nam liczbę wyników wyszukiwania.
        System.out.println("I see results");
        System.out.println(results.size());
    }
    public WebElement oneRandomResult(){
        Random random = new Random();
        int randomPageId = random.nextInt(results.size());
        WebElement webElement = results.get(randomPageId);

        System.out.println(webElement.getTagName());
        System.out.println(webElement);

        return results.get(randomPageId);

    }
}
