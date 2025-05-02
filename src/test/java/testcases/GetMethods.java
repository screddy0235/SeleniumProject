package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        String title = driver.getTitle();
        String expTitle = "Automation Testing Practice";
        System.out.println(expTitle);
        String url = driver.getCurrentUrl();
        System.out.println(url);
//        String pageSource = driver.getPageSource();
        String windowID = driver.getWindowHandle();
        System.out.println(windowID);
        driver.quit();
    }
}
