package lesson8.homework3;

import driverFactory.DriverSetUp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utils.ActionsClass;

import java.util.Set;

//    Необходимо автоматизировать сценарий, который показан на видео “Сценарий для автоматизации.mp4”.
public class Task1 {
    @Test
    public void homework3() {

        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.google.com/search");
        ActionsClass actionsClass = new ActionsClass(driver);

        actionsClass.sendKeys(By.id("APjFqb"), "https://www.guinnessworldrecords.com/account/register?");
        actionsClass.sendKeys(By.id("APjFqb"), Keys.ENTER);

        String handle1 = driver.getWindowHandle();
        Set<String> windowHandles1 = driver.getWindowHandles();
        actionsClass.clickAndOpenInNewWindow(By.xpath("(//h3[text()='Create account'])[1]"));
        Set<String> windowHandles2 = driver.getWindowHandles();
        windowHandles2.removeAll(windowHandles1);
        String handle2 = windowHandles2.iterator().next();

        actionsClass.clearAndSendKeys(By.id("APjFqb"), "https://www.hyrtutorials.com/p/alertsdemo.html");
        actionsClass.sendKeys(By.id("APjFqb"), Keys.ENTER);

        Set<String> windowHandles3 = driver.getWindowHandles();
        actionsClass.clickAndOpenInNewWindow(By.xpath("//h3[text()='AlertsDemo']"));
        Set<String> windowHandles4 = driver.getWindowHandles();
        windowHandles4.removeAll(windowHandles3);
        String handle3 = windowHandles4.iterator().next();

        actionsClass.clearAndSendKeys(By.id("APjFqb"), "https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        actionsClass.sendKeys(By.id("APjFqb"), Keys.ENTER);
        actionsClass.click(By.xpath("//h3[text()='W3Schools Tryit Editor - HTML Forms']"));
        driver.switchTo().frame("iframeResult");
        actionsClass.clearAndSendKeys(By.id("fname"), "Svitlana");
        actionsClass.clearAndSendKeys(By.id("lname"), "Savych");
        actionsClass.click(By.xpath("//input[@value='Submit']"));
        System.out.println(driver.findElement(By.xpath("//div[@class='w3-panel w3-pale-yellow w3-leftbar w3-border-yellow']/p")).getText());

        driver.switchTo().window(handle2);
        actionsClass.sendKeys(By.id("LastName"), "Savych");
        actionsClass.sendKeys(By.id("FirstName"), "Svitlana");
        actionsClass.sendKeys(By.id("DateOfBirthDay"), "02");
        actionsClass.sendKeys(By.id("DateOfBirthMonth"), "11");
        actionsClass.sendKeys(By.id("DateOfBirthYear"), "1975");
        Select country = new Select(driver.findElement(By.id("Country")));
        country.selectByVisibleText("Ukraine");
        actionsClass.sendKeys(By.id("State"), "Boryspil");
        actionsClass.sendKeys(By.id("EmailAddress"), "svch122@gmail.com");
        actionsClass.sendKeys(By.id("ConfirmEmailAddress"), "svch122@gmail.com");
        actionsClass.sendKeys(By.id("Password"), "789456");
        actionsClass.sendKeys(By.id("ConfirmPassword"), "7894555");
        actionsClass.sendKeys(By.id("ConfirmPassword"), Keys.ENTER);
        System.out.println(driver.findElement(By.xpath("//span[@for='ConfirmPassword']")).getText());

        driver.switchTo().window(handle3);
        actionsClass.click(By.id("alertBox"));
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        System.out.println("Button 1: " + driver.findElement(By.id("output")).getText());

        actionsClass.click(By.id("confirmBox"));
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        System.out.println("Button 2: " + driver.findElement(By.id("output")).getText());

        actionsClass.click(By.id("promptBox"));
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("'Final step of this task'");
        alert3.accept();
        System.out.println(driver.findElement(By.id("output")).getText());
    }
}


