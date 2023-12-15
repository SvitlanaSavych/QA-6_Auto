package lesson3.homework1;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3 {
//    3)
//    Написать метод который выводит сообщение об айди элемента,
//    значении тэга элемента , значении класса элемента,
//    значении атрибута name элемента, текста данного элемента,
//    а также о координатах центра контейнера данного элемента.

    public static void printElementInfo (WebDriver driver, By selector){
        WebElement element = driver.findElement(selector);
        System.out.println("ID of element is: " + element.getAttribute("id"));
        System.out.println("TAG of element is: " + element.getTagName());
        System.out.println("CLASS of element is: " + element.getAttribute("class"));
        System.out.println("Attribute name of element is: " + element.getAttribute("name"));
        System.out.println("Text of element is: " + element.getText());

        int centerX = element.getLocation().x + element.getSize().width/2;
        int centerY = element.getLocation().y + element.getSize().height/2;
        System.out.println("Coordinates of center of container is: x=" + centerX + ", y=" + centerY);
    }

    public static void main(String[] args) {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        By selector = By.cssSelector("#search_query_top");
        printElementInfo(driver, selector);
        driver.quit();
    }
}
