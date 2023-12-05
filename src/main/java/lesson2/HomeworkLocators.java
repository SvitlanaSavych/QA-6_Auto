package lesson2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v85.tracing.model.TraceConfig;

public class HomeworkLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

//        driver.get("https://eva.ua/ua/");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//span[@class='account-entrance__text']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//span[@class='modal__close ico-canceled']")).click();
//        driver.findElement(By.xpath("//button[@class='sf-button navigation__trigger']")).click();
//        driver.findElement(By.xpath("//span[@class='mega-menu__left-side-el-text']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//a[@class='sf-link m-prg-link o-filter__link'])[2]")).click();

//        driver.get("https://dan-it.com.ua/");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[@href='https://dan-it.com.ua/uk']")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//h1[contains(text(),'IT-освіта')]/../div[@class='banner__btns']/a[@href='#programm']")).click();

//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//header[@id='pageHeader']/div[@class='container page-header__container']/a[@href='tel:0 800 335 695']")).click();
//        System.out.println(driver.findElement(By.xpath("(//p[@class='banner-meta__name'])[2]")).getText());
//        Thread.sleep(2000);
//        System.out.println(driver.findElement(By.xpath("//p[@class='main-info__title']/../../../div[@class='main-expertise__wrapper']/ul[@class='main-expertise__points']/li/following-sibling::*[2]/b")).getText());
//        driver.quit();


//        driver.get("https://www.w3schools.com/");
//        driver.findElement(By.id("tnb-google-search-input")).sendKeys("Java");
//        Thread.sleep(2000);
//        driver.findElement(By.id("search2")).sendKeys("HTML");
//        Thread.sleep(1000);
//        driver.findElement(By.id("navbtn_services")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("navbtn_certified")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("filter-certified-input")).sendKeys("SQL");
//        Thread.sleep(1000);
//        driver.quit();

//        driver.get("https://www.jetbrains.com/idea/");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[@class='wt-col-inline menu-second__download-button wt-button wt-button_size_s wt-button_mode_primary wt-button_theme_dark']")).click();
//        Thread.sleep(3000);
//        driver.quit();

        driver.get("https://www.jetbrains.com/idea/download/#section=windows");
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//a[@href='/idea/download/download-thanks.html?platform=windows']")).getText());
        System.out.println(driver.findElement(By.xpath("//a[@class='_main_121lxce_17 _modeOutline_121lxce_389 _sizeM_121lxce_99 _alignIconLeft_121lxce_77 _dark_121lxce_62 _flatRight_121lxce_158 _wtDownloadButton__left_lo1c2 _wtDownloadButton__left_nxion _wtDownloadButton__left_gm3ug']")).getText());
        driver.quit();
    }

}
