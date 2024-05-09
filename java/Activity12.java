import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity12 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");

        System.out.println(driver.getTitle());


        WebElement box = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input"));
        box.isSelected();

        if (box.isSelected()) {
            System.out.println("Checkbox is selected.");
        } else {
            System.out.println("Checkbox is not selected.");
        }

        WebElement box1 = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input"));
        box1.click();

        if (box1.isSelected()) {
            System.out.println("Checkbox is selected.");
        } else {
            System.out.println("Checkbox is not selected.");
        }

        driver.close();
    }
}