import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity01{
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Open the browser
        driver.get("http://alchemy.hguy.co/crm");
        System.out.println(driver.getTitle());
        String pageTitle = driver.getTitle();
            if(pageTitle.equals("SuiteCRM")){
                System.out.println("THE title is:"+pageTitle);
            }else {
                System.out.println("the title doesn't match");
            }




        driver.close();
    }
}