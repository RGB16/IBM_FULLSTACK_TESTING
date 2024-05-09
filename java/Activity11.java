import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity11 {
    private static Object Assertions;

    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");

        System.out.println(driver.getTitle());


        WebElement box = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input"));
        box.click();if (box.isDisplayed()) {
            System.out.println("Checkbox is visible.");
        } else {
            System.out.println("Checkbox is not visible.");
        }

        WebElement removebox = driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]"));
        removebox.click();


        if (box.isDisplayed()) {
            System.out.println("Checkbox is visible again.");
        } else {
            System.out.println("Checkbox is not visible again.");
        }

        driver.close();

    }
}