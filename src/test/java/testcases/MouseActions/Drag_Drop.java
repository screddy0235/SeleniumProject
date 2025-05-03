package testcases.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement dragElement = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
        WebElement dropElement = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragElement, dropElement).perform();
        Thread.sleep(5000);
        WebElement slide = driver.findElement(By.xpath("//span[@style=\"left: 15%;\"]"));
        actions.clickAndHold(slide).moveByOffset(100,0).release().perform();
        Thread.sleep(5000);
        driver.quit();
    }

}
