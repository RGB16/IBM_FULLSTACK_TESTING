//open a browser to https://v1.training-support.net/selenium/selects
//get the title and print it to the console
//On the single select
//-select the second option using visible text
//-select the third option using index
//-select the fourth option using the value
//-get all the options and and print them to console

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class Activity17{
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser

        driver.get("https://v1.training-support.net/selenium/selects");

        System.out.println(driver.getTitle());
        Actions action=new Actions(driver);
        WebElement option2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/select/option[3]"));option2.click();
        WebElement dropdown= driver.findElement(By.xpath(("//*[@id=\"single-select\"]")));
        Select select = new Select(dropdown);

        List<WebElement> options = select.getOptions();
        select.selectByIndex(3);

        WebElement dropdown1= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/select"));
        Select select1 = new Select(dropdown1);
        List<WebElement> options1 = select1.getOptions();
        select1.selectByValue("4");
        System.out.println(options1);
        //close
        driver.close();


    }
}