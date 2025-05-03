package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;    // type casting...up casting

//        ChromeDriver driver = new ChromeDriver();
//        JavascriptExecutor js = driver;         //type casting ... down casting

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//input[@placeholder=\"Enter Name\"]"));
        js.executeScript("arguments[0].setAttribute('value', 'ss')", element);  // sendKeys action

        WebElement click = driver.findElement(By.xpath("//input[@value=\"male\"]"));
        js.executeScript("arguments[0].click()", click);  // click action

        Thread.sleep(5000);

    }
}
