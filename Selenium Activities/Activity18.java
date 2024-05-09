import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity18 {
    public static void main(String[] args) {
        // Setup the Firefox driver (GeckoDriver) using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // Open a new browser and navigate to the webpage
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/selects");

        // Get the title of the page and print it to the console
        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);

        // Locate the multiple select dropdown
        WebElement multipleSelectDropdown = driver.findElement(By.id("multi-select"));

        // Create a Select object for the multiple select dropdown
        Select select = new Select(multipleSelectDropdown);

        // Select the option "Javascript" using visible text
        select.selectByVisibleText("Javascript");

        // Select 4th, 5th, and 6th options using index
        select.selectByIndex(3);
        select.selectByIndex(4);
        select.selectByIndex(5);

        // Select the option "Node.js" using value
        select.selectByValue("node");

        // Deselect the 5th option using index
        select.deselectByIndex(4);

        // Close the browser
        driver.quit();
    }
}
