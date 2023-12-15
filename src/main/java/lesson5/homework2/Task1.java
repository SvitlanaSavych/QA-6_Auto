package lesson5.homework2;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 {
    // 1) http://only-testing-blog.blogspot.com/2014/01/textbox.html?
//    Написать программу реализующую действие показанное на "видео1.mp4".
//    После выполнения программы на консоли должна выводится информация в следующем виде:
//
//    Автомобили доступные для выбора:
//    Volvo, BMW, Opel, Audi, Toyota, Renault, Maruti Car.
//    Страны из первой таблицы:
//    USA, Russia, Japan, Mexico, India, Malaysia, Greece.
//    Страны из второй таблицы:
//    France, Germany, Italy, Spain.
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");

        WebElement carsWebElement = driver.findElement(By.id("Carlist"));
        Select cars = new Select(carsWebElement);
        driver.findElement(By.xpath("//select[@id='Carlist']")).click();

        Thread.sleep(2000);
        List<WebElement> carsList = cars.getOptions();
        System.out.println("Автомобили доступные для выбора:");
        for (WebElement singleElement : carsList) {
            System.out.print(singleElement.getText() + ", ");
        }
        Thread.sleep(1000);
        cars.selectByVisibleText("Renault");


        WebElement countriesWebElement = driver.findElement(By.xpath("//select[@name='FromLB']"));
        Select countries = new Select(countriesWebElement);
        countries.selectByVisibleText("France");
        countries.selectByVisibleText("India");
        countries.deselectByVisibleText("India");
        countries.selectByVisibleText("Germany");
        countries.selectByVisibleText("Italy");
        countries.selectByVisibleText("Malaysia");
        countries.deselectByVisibleText("Malaysia");
        countries.selectByVisibleText("Spain");
        driver.findElement(By.xpath("//input[@onclick='move(this.form.FromLB,this.form.ToLB)']")).click();

        List<WebElement> countriesList = countries.getOptions();
        System.out.println(" ");
        System.out.println("Страны из первой таблицы:");
        for (WebElement singleElement : countriesList) {
            System.out.print(singleElement.getText() + ", ");
        }

        Thread.sleep(2000);
        WebElement countriesWebElement2 = driver.findElement(By.xpath("//select[@name='ToLB']"));
        Select countries2 = new Select(countriesWebElement2);
        List<WebElement> selectedCountries = countries2.getOptions();
        System.out.println(" ");
        System.out.println("Страны из второй таблицы:");
        for (WebElement singleElement : selectedCountries) {
            System.out.print(singleElement.getText() + ", ");
        }
    }

}
