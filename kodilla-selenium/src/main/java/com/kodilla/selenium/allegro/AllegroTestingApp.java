package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement webElement = driver.findElement(By.xpath("//*[@class=\"_9f0v0 _jkrtd mpof_ki_s\"]/button[2]"));
        webElement.click();

        WebElement input = driver.findElement(By.xpath("//*[@placeholder=\"czego szukasz?\"]"));
        input.sendKeys("Mavic mini");

        WebElement eleSelect = driver.findElement(By.xpath("//*[@value=\"/kategoria/elektronika\"]"));
        eleSelect.click();

        WebElement szukajButton = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        szukajButton.click();

    }
}
