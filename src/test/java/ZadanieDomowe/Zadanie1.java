package ZadanieDomowe;

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

        driver.get("https://mystore-testlab.coderslab.pl/index.php");

        WebElement signInLink = driver.findElement(By.id("_desktop_user_info"));
        signInLink.click();
        WebElement NoAccount = driver.findElement(By.className("no-account"));
        NoAccount.click();
        WebElement MyStore = driver.findElement(By.id("_desktop_logo"));
        MyStore.click();

        driver.quit();
    }
}