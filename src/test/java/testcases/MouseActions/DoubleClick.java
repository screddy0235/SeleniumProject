package testcases.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement firstButton = driver.findElement(By.xpath("//button[text()='Copy Text']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(firstButton).perform();
        Thread.sleep(10000);
        driver.quit();
    }

}
