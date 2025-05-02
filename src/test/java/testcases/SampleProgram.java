package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProgram {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        String title = driver.getTitle();
        String expTitle = "Automation Testing Practice";
        if(expTitle.equals(title)){
            System.out.println("Passed");
        }
        driver.quit();
    }
}
