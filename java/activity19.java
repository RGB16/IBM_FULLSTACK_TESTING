import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class activity19 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");

        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);

        WebElement confirmButton = driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
        confirmButton.click();

        Alert alert = driver.switchTo().alert();

        // Get the text in the alert box and print it
        String alertText = alert.getText();
        System.out.println("Text in the alert: " + alertText);

        // Close the alert once with OK
        alert.accept();

        // Find the button to open a confirm alert again and click it
        confirmButton.click();

        // Switch the focus back to the alert box
        alert = driver.switchTo().alert();

        // Close the alert once with Cancel
        alert.dismiss();

        // Close the browser
        driver.quit();
    }
}
