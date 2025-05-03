package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticWebTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //getting no of rows in table
        int noOfRows = driver.findElements(By.xpath("//table[@name ='BookTable']//tr")).size();
        System.out.println(noOfRows);
        int noOfColumns = driver.findElements(By.xpath("//table[@name ='BookTable']//th")).size();
        System.out.println(noOfColumns);

        // read the data from specific row and column
        String data = driver.findElement(By.xpath("//table[@name ='BookTable']//tr[3]//td[4]")).getText();
        System.out.println(data);

        // read the data from all rows and columns
        for (int r=2; r<=noOfRows; r++){
            for (int c=1; c<=noOfColumns ; c++){
                String text = driver.findElement(By.xpath("//table[@name ='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(text+ " ");
            }
            System.out.println("");
        }
        driver.quit();
    }
}

