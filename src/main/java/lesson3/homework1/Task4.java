package lesson3.homework1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task4 {
//    Написать программу, которая повторит действия на видео.

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("http://www.automationpractice.pl/index.php");
        Thread.sleep(3000);
        driver.findElement(By.id("search_query_top")).sendKeys("Printed Chiffon Dress");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@name='submit_search']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='http://www.automationpractice.pl/index.php?id_product=7&controller=product&search_query=Printed+Chiffon+Dress&results=2']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@name='Submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='continue btn btn-default button exclusive-medium']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='sf-with-ul']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("search_query_top")).sendKeys("Faded Short");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@name='submit_search']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@href='http://www.automationpractice.pl/index.php?id_product=1&controller=product&search_query=Faded+Short&results=1'])[4]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@name='Submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='continue btn btn-default button exclusive-medium']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='http://www.automationpractice.pl/index.php?controller=order']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
