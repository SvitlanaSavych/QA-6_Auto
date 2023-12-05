package lesson3;

import driverFactory.DriverSetUp;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().window().maximize();

        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        List<WebElement> webElementList = driver.findElements(By.xpath("//div[@class='columned block block-4-12']/a"));
        for (WebElement element : webElementList) {
            System.out.println(element.getText());
        }
        driver.quit();
    }
}
