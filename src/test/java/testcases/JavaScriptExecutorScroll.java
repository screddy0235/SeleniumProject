package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorScroll {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;    // type casting...up casting
//        ChromeDriver driver = new ChromeDriver();
//        JavascriptExecutor js = driver;         //type casting ... down casting
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//label[text()='Samsung']"));

        // scroll down by pixel number
        js.executeScript("window.scrollBy(0, 4000)");

       //scroll up to the element
        js.executeScript("arguments[0].scrollIntoView()",element);

        //scroll to the bottom
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");

        //scroll to the top
        js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");

        Thread.sleep(5000);

    }
}
