import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Activity04 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        // Find username and password fields and enter login credentials
        WebElement usernameField = driver.findElement(By.id("user_name"));
        WebElement passwordField = driver.findElement(By.id("username_password"));
        usernameField.sendKeys("admin");
        passwordField.sendKeys("pa$$w0rd");

        // Click login button
        WebElement loginButton = driver.findElement(By.id("bigbutton"));
        loginButton.click();

        // Verify that the homepage has opened
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("SuiteCRM"))
            System.out.println("Successfully logged in. Homepage opened.");
        else
            System.out.println("Login unsuccessful.");

        // Close the browser
        driver.quit();


    }
}