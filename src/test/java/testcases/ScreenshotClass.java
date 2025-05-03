package testcases;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class ScreenshotClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
//        ChromeDriver driver = new ChromeDriver();

//        TakesScreenshot ts = driver;
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
