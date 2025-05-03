package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //for single file
        driver.findElement(By.xpath("(//input[@type=\"file\"])[1]"))
                .sendKeys("C:\\Users\\NANI0235\\OneDrive\\Desktop\\Documents\\Doc1.docx");

        // for multiple files
        String file1 = "C:\\Users\\NANI0235\\OneDrive\\Desktop\\Documents\\Doc1.docx";
        String file2 = "C:\\Users\\NANI0235\\OneDrive\\Desktop\\Documents\\naveen24.pdf";

        driver.findElement(By.xpath("(//input[@type=\"file\"])[2]"))
                .sendKeys(file1 + "\n"+ file2);

        Thread.sleep(10000);
    }
}
