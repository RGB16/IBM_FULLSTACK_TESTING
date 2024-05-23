import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Activity03 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");

        // Find the first copyright text in the footer
        WebElement copyrightText = driver.findElement(By.xpath("/html/body/div[1]/div[3]"));

        // Get the text of the copyright element
        String copyright = copyrightText.getText();

        // Print the text to the console
        System.out.println("Copyright text: " + copyright);

        // Close the browser
        driver.quit();

    }
}
