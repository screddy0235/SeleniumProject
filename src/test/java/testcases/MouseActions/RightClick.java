package testcases.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement firstButton = driver.findElement(By.xpath("//button[text()='Point Me']"));
        Actions actions = new Actions(driver);
        actions.contextClick(firstButton).perform();
        driver.quit();
    }

}
