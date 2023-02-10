package ZadanieDomowe;

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

        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");

        WebElement FirstName = driver.findElement(By.name("firstName"));
        FirstName.sendKeys("Karol");
        WebElement LastName = driver.findElement(By.name("lastName"));
        LastName.sendKeys("Kowalski");
        //WebElement Gender = driver.findElement(By.className("radio"));
        WebElement DateOfBirth = driver.findElement(By.id("dob"));
        DateOfBirth.sendKeys("05/22/2010");
        WebElement Address = driver.findElement(By.id("address"));
        Address.sendKeys("Prosta 51");
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("karol.kowalski@mailinator.com");
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("Pass123");
        WebElement Company = driver.findElement(By.id("company"));
        Company.sendKeys("Coders Lab");
        //WebElement Role = driver.findElement(By.id("role"));
       //WebElement Expectation = driver.findElement(By.id("expectation"));
        //WebElement WaysOfDevelopment = driver.findElement(By.name("checkbox"));
        WebElement Comment = driver.findElement(By.id("comment"));
        Comment.sendKeys("To jest mój pierwszy automat testowy");
        WebElement Submit = driver.findElement(By.id("submit"));
        Submit.click();


    }
}



