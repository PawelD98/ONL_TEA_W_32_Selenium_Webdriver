package WyszukiwanieElementow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadanie3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signIn = driver.findElement(By.className("user_login"));
        signIn.click();
        WebElement emailAddress = driver.findElement(By.className("account_input"));
        emailAddress.sendKeys("dsdasda@wp.pl");
        WebElement CreateAnAccount  = driver.findElement(By.id("SubmitCreate"));
        CreateAnAccount.click();


    }
}
