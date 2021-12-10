import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net/selenium/simple-form");
        //Find the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));

        firstName.sendKeys("Anjana");
        lastName.sendKeys("Dixit");

        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("anjana@blah.com");
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("1234567890");

        driver.findElement(By.xpath("//textarea")).sendKeys("Good morning!!! :D");

        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
    }
}