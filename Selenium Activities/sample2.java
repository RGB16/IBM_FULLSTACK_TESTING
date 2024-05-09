import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample2 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("rohan");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();

        driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));

        System.out.println();
        driver.quit();
    }
}
