import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity01{
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();


        // Open the browser
        driver.get("https://v1.training-support.net");

        System.out.println(driver.getTitle());

        WebElement input = driver.findElement(By.id("about-link"));
        input.click();

        System.out.println(driver.getTitle());

        driver.close();
    }
}
