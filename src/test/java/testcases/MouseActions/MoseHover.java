package testcases.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoseHover {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement firstButton = driver.findElement(By.xpath("//button[text()='Point Me']"));
        WebElement secondButton = driver.findElement(By.xpath("//a[text()='Mobiles']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(firstButton).moveToElement(secondButton).click().build().perform();
        // mouse hover and click
        Thread.sleep(3000);
        driver.quit();
    }
}
