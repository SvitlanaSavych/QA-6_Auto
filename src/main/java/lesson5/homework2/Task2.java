package lesson5.homework2;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class Task2 {
// 2)  http://www.ashortjourney.com/
//     Написать программу, которая будет автоматизировать сценарий показанный на видео
//     "Сценарий для автоматизии.mp4".

    public static void dragAndDrop(int x, int y, WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("[r='40']")))
                .clickAndHold().moveToElement(driver.findElement(By.cssSelector("[r='8']")), x, y)
                .release().build().perform();
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("http://www.ashortjourney.com/");
        Thread.sleep(7000);
        dragAndDrop(0, 30, driver);
        Thread.sleep(6000);
        dragAndDrop(20, -20, driver);
        Thread.sleep(5000);
        dragAndDrop(30, 0, driver);
        Thread.sleep(5000);
        dragAndDrop(-30, 0, driver);
        Thread.sleep(5000);
        dragAndDrop(-20, 30, driver);
        Thread.sleep(5000);
        dragAndDrop(30, 0, driver);
        Thread.sleep(5000);
        dragAndDrop(0, -30, driver);
        Thread.sleep(3000);
        driver.findElement(By.tagName("textarea")).sendKeys("Задание выполнено!");
        Thread.sleep(3000);
        driver.quit();
    }
}


