import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity08 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the browser
        driver.get("http://alchemy.hguy.co/crm");
        WebElement username= driver.findElement(By.id("user_name"));
        username.sendKeys("admin");
        WebElement password=driver.findElement(By.id("username_password"));
        password.sendKeys("pa$$w0rd");
        WebElement button= driver.findElement(By.id("bigbutton"));
        button.click();
        // Close the browser
        wait.until(ExpectedConditions.urlContains("index.php?module=Home&action=index"));

        driver.findElement(By.id("grouptab_0")).click();
        driver.findElement(By.id("moduleTab_9_Accounts")).click();
        // Wait for the table to load
        WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("table.list.view")));

        // Get all rows of the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Print the names of the first 5 odd-numbered rows
        for (int i = 0; i < rows.size(); i++) {
            if (i % 2 != 0 && i < 10) { // Checking for odd number and printing only 5 rows
                WebElement row = rows.get(i);
                WebElement nameElement = row.findElement(By.cssSelector("td:nth-child(3)")); // Assuming the name is in the third column
                String name = nameElement.getText().trim();
                System.out.println("Name of row " + (i + 1) + ": " + name);
            }
        }

        driver.quit();
    }
}