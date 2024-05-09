import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/tables");

        // getting page's title and print it in console
        String title = driver.getTitle();
        System.out.println(title);

        // Find the table element
        WebElement table = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table"));

        int rowCount = table.findElements(By.xpath(".//tr")).size();
        System.out.println("Number of rows: " + rowCount);

        int columnCount = table.findElements(By.xpath(".//tr[1]/td")).size();
        System.out.println("Number of columns: " + columnCount);

        System.out.println(table.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table/tbody/tr[3]")).getText());

        System.out.println(table.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table/tbody/tr[3]/td[2]")).getText());
        driver.quit();
    }
}