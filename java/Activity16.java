//open a new browser to https://v1.training-support.net/selenium/dynamic-attributes
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

public class Activity16 {
    public static void main(String[] args) {
        // Setup the Firefox driver (GeckoDriver) using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // Open a new browser and navigate to the webpage
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");

        // Get the title of the page and print it to the console
        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);

        // Find the input fields of the signup form and fill the details
        WebElement usernameInput = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[1]/input"));
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/input"));
        WebElement confirmPasswordInput = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[3]/input"));
        WebElement emailInput = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[4]/input"));
        WebElement signUpButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/button"));

        usernameInput.sendKeys("Rohan GB");
        passwordInput.sendKeys("1234");
        confirmPasswordInput.sendKeys("1234");
        emailInput.sendKeys("ROHAN@example.com");

        // Submit the signup form
        signUpButton.click();

        // Wait for the success message to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));

        // Print the success message to the console
        System.out.println("Success message: " + successMessage.getText());

        // Close the browser
        driver.quit();
    }
}
