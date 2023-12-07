package lesson3.homework1;

import driverFactory.DriverSetUp;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class Task1 {
    //    1)
//    Написать программу, которая будет открывать четыре различные страницы в новых окнах:
//          https://zoo.kiev.ua/
//          https://www.w3schools.com/
//          https://taxi838.ua/ru/dnepr/
//          https://klopotenko.com/
//    Прописать цикл, который будет переключаться поочередно через все страницы,
//    для каждой страницы выводить в консоль название и ссылку на эту страницу.
//    И будет закрывать ту страницу в названии которой есть слово зоопарк.

    public static void openLinkInANewTab(WebDriver driver, String url){
        Set<String> set1 = driver.getWindowHandles();
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> set2 = driver.getWindowHandles();
        set2.removeAll(set1);
        String newDescriptor = set2.iterator().next();
        driver.switchTo().window(newDescriptor);
        driver.get(url);
    }
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://zoo.kiev.ua/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        openLinkInANewTab(driver, "https://www.w3schools.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        openLinkInANewTab(driver,"https://taxi838.ua/ru/dnepr/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        openLinkInANewTab(driver,"https://klopotenko.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        Set<String> handlers = driver.getWindowHandles();
        for (String handler: handlers){
            driver.switchTo().window(handler);
            if(driver.getTitle().contains("зоопарк")){
                driver.close();
            }
        }
        Thread.sleep(3000);
        driver.quit();
    }

}
