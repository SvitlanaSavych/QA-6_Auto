package lesson3.homework1;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {
//    2)
//    Написать метод в параметры которого принимаются два ВебЭлемента.
//    Метод выводит в консоль информацию какой из двух элементов располагается  выше на странице,
//    какой из элементов располагается левее на странице,
//    а также какой из элементов занимает большую площадь.
//    Параметры метода могут также включать в себя другие аргументы, если это необходимо.

    public static void compareElementsToEachOther(WebElement element1, WebElement element2) {
        int x1 = element1.getLocation().x;
        int y1 = element1.getLocation().y;
        int x2 = element2.getLocation().x;
        int y2 = element2.getLocation().y;
        System.out.println("Element 1: x=" + x1 + ", y=" + y1);
        System.out.println("Element 2: x=" + x2 + ", y=" + y2);

        if (y1 < y2) {
            System.out.println("Element 1 located higher on the page");
        } else if (y1 > y2) {
            System.out.println("Element 2 located higher on the page");
        } else {
            System.out.println("Elements located on the same horizontal line");
        }

        if (x1 < x2) {
            System.out.println("Element 1 located to the left on the page");
        } else if (x1 > x2) {
            System.out.println("Element 2 located to the left on the page");
        } else {
            System.out.println("Elements located on the same vertical line");
        }


        int area1 = element1.getSize().width * element1.getSize().height;
        int area2 = element2.getSize().width * element2.getSize().height;
        if (area1 > area2) {
            System.out.println("Element 1 occupies a larger area");
        } else if (area1 < area2) {
            System.out.println("Element 2 occupies a larger area");
        } else {
            System.out.println("Elements occupy the same area");
        }
    }

    public static void main(String[] args) {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        WebElement element1 = driver.findElement(By.xpath("//img[@src='http://www.automationpractice.pl/modules/homeslider/images/sample-2.jpg']"));
        WebElement element2 = driver.findElement(By.xpath("//img[@src='http://www.automationpractice.pl/modules/themeconfigurator/img/banner-img7.jpg']"));
        compareElementsToEachOther(element1, element2);
        driver.quit();
    }
}
