import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class activity20 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");

        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);

        WebElement promptButton = driver.findElement(By.xpath("//*[@id=\"prompt\"]"));
        promptButton.click();

        // Switch the focus from main window to the alert box
        Alert promptAlert = driver.switchTo().alert();

        // Get the text in the prompt alert and print it
        String promptText = promptAlert.getText();
        System.out.println("Text in the prompt: " + promptText);

        // Type "Awesome" into the prompt
        promptAlert.sendKeys("Awesome");

        // Close the prompt alert by clicking OK
        promptAlert.accept();

        // Close the browser
        driver.quit();
    }
}

