import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class activity4 {
    public static void main(String[] args) {
        // Setup the Firefox driver (GeckoDriver) using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser and navigate to the webpage
        driver.get("https://v1.training-support.net/selenium/target-practice");

        // Get the title of the webpage and print it
        String title = driver.getTitle();
        System.out.println("Title of the webpage: " + title);

        // Find the 3rd header on the page and print its text
        WebElement thirdHeader = driver.findElement(By.xpath("//h3[text()='Third Header']"));
        System.out.println("Text of the 3rd header: " + thirdHeader.getText());

        // Find the 5th header on the page and print its text
        WebElement fifthHeader = driver.findElement(By.xpath("//h3[text()='Fifth Header']"));
        System.out.println("Text of the 5th header: " + fifthHeader.getText());

        // Find the violet button and print all its classes
        WebElement violetButton = driver.findElement(By.className("ui violet button"));
        String buttonClasses = violetButton.getAttribute("class");
        System.out.println("Classes of the violet button: " + buttonClasses);

        // Close the browser
        driver.quit();
    }
}
