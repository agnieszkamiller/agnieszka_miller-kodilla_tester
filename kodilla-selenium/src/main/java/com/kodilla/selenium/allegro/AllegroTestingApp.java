package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AllegroTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

      //  WebElement webElement = driver.findElement(By.xpath("//*[@class=\"_9f0v0 _jkrtd mpof_ki_s\"]/button[2]"));
        WebElement webElement = driver.findElement(By.cssSelector("button[class='_13q9y _8hkto munh_56_m m7er_k4 m7er_wn m7er_56_m']"));
        webElement.click();

  //      WebElement input = driver.findElement(By.xpath("//*[@placeholder=\"czego szukasz?\"]"));
        WebElement input = driver.findElement(By.cssSelector("input[type='search']"));
        input.sendKeys("Mavic mini");
//
//        WebElement eleSelect = driver.findElement(By.xpath("//*[@value=\"/kategoria/elektronika\"]"));
        WebElement eleSelect = driver.findElement(By.cssSelector("option[value='/kategoria/elektronika']"));
        eleSelect.click();
//
//        WebElement szukajButton = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        WebElement szukajButton = driver.findElement(By.cssSelector("button[type='submit']"));
        szukajButton.click();
//        List<WebElement> a  = driver.findElements(By.cssSelector("section[class='_9c44d_3pyzl']"));
        List<WebElement> a  = driver.findElements(By.cssSelector("article[data-analytics-enabled='true']"));

        for (WebElement element : a) {
            System.out.println(element.getText());
            System.out.println("---------");
        }

    }
}
