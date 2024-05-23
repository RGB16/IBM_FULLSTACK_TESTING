import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity02 {

    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");

        // Find the header image element
        WebElement headerImage = driver.findElement(By.xpath("/html/head/link[1]"));

        // Get the URL of the header image
        String headerImageUrl = headerImage.getAttribute("href");

        // Print the URL to the console
        System.out.println("URL of the header image: " + headerImageUrl);

        // Close the browser
        driver.quit();
    }
}
