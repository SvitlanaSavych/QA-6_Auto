package lesson2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        Thread.sleep(3000);
        driver.findElement(By.id("Username")).sendKeys("Hello");
        driver.findElement(By.id("Password")).sendKeys("World");
        driver.findElement(By.id("RememberMe")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
