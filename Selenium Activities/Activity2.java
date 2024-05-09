import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity2{
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();


        // Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");

        System.out.println(driver.getTitle());
        WebElement user =driver.findElement(By.id("username"));
        user.sendKeys("admin");
        WebElement pass =driver.findElement(By.id("password"));
        pass.sendKeys("password");
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button"));
        loginButton.click();

        driver.close();
    }
}