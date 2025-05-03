package testcases;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class HeadLess {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        WebDriver driver = new ChromeDriver(options);


        TakesScreenshot ts = (TakesScreenshot) driver;

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        File sc = ts.getScreenshotAs(OutputType.FILE);
        File scl = new File(System.getProperty("user.dir")+ "/screenshots/fullpage.png");
        sc.renameTo(scl);  // setting location

        Thread.sleep(5000);

        driver.quit();

    }
}
