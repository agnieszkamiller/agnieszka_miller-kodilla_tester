package pages;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
//klasa będzie przechowywać instancję sterownika,
// a wszystkie klasy dziedziczące po niej będą zawsze miały do niego dostęp

    protected WebDriver driver;

    public AbstractPage(WebDriver driver){
        this.driver = driver;
    }
}
