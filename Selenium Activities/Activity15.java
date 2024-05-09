//open a new browser to https://v1.training-support.net/selenium/tables
//        get the tittle of the page and print it to the console
//        find the username and password input fields .type in the credentials
//        username:admin
//        password:password
//        wait for login message to appear and print the login message to the console
//        close the browser
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Activity15 {
    public static void main(String[] args) {
        // Setup the Firefox driver (GeckoDriver) using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // Open a new browser and navigate to the webpage
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");

        // Get the title of the page and print it to the console
        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);

        // Find the username and password input fields and type the credentials
        WebElement usernameInput = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[1]/input"));
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[2]/input"));
        usernameInput.sendKeys("admin");
        passwordInput.sendKeys("password");

        // Submit the login form (assuming there's a login button, otherwise omit this step)
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();

        // Wait for the login message to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));

        // Print the login message to the console
        System.out.println("Login message: " + loginMessage.getText());

        // Close the browser
        driver.quit();
    }
}
