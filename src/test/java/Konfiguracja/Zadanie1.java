package Konfiguracja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadanie1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");

        WebElement acceptCookiesButton = driver.findElement(By.id("L2AGLb"));
        acceptCookiesButton.click();

        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.clear();
        searchBar.sendKeys("swordartonline.wbijam");
        searchBar.submit();
        WebElement link = driver.findElement(By.className("LC20lb"));
        link.click();
        driver.quit();
    }
}

