package lesson9.homework4;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.ActionsClass;

import java.time.Duration;

public class Task5 {
    static WebDriver driver;
    static ActionsClass actionsClass;

    @BeforeClass
    public void precondition() {
        driver = DriverSetUp.setUpDriver();
        actionsClass = new ActionsClass(driver);
    }

    @AfterClass
    public void postConditions() {
        driver.quit();
    }


    @Test
    @Parameters({"text"})
    public void searchField(String text) {
        driver.get("https://www.foxtrot.com.ua/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='button user-confirm-location-button']")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='button user-confirm-location-button']"))).click();
        }catch (Exception e){}

        actionsClass.sendKeys(By.xpath("//input[@type='search']"), text);
        actionsClass.click(By.xpath("//input[@value='Знайти']"));
//        Assert.assertTrue(driver.findElement(By.tagName("h1")).getText().contains(text));
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='search-page__box-title']/label")).getText().contains(text));
    }
}

