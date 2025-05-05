package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Selenium_Grid {
    public static void main(String[] args) throws MalformedURLException {
        String hubURL = "http://192.168.0.108:4444";
        DesiredCapabilities cp = new DesiredCapabilities();
        cp.setPlatform(Platform.WIN11); // setting OS
//        cp.setPlatform(Platform.MAC); // setting os to MAC
        cp.setBrowserName("chrome"); // setting browser

        WebDriver driver = new RemoteWebDriver(new URL(hubURL), cp);

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        int noOfBrokenlinks = 0;
        int noOfNotBrokenLink = 0;

        List<WebElement> noOfLinks = driver.findElements(By.tagName("a"));
        System.out.println("No of Broken links in this page  " + noOfLinks.size());
        try {
            for (WebElement links : noOfLinks) {
                String hrefvalue = links.getAttribute("href");
                if (hrefvalue == null || hrefvalue.isEmpty()) {
                    System.out.println("It is not possible");
                    continue;
                }
                // hit URL to the sever
                URL linkURL = new URL(hrefvalue); // converting URL in String format to URL format
                // set connection to server and storing into the value
                HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
                conn.connect();
                if (conn.getResponseCode() >= 400) {
                    System.out.println(hrefvalue + ">>>>>>>>>>>>>> Broken Link");
                    noOfBrokenlinks++;
                } else
                    System.out.println(hrefvalue + ">>>>>>>>>>>>>>  Not Broken Link");
                noOfNotBrokenLink++;
                conn.disconnect();
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(noOfBrokenlinks + " : Broken Links");
        System.out.println(noOfNotBrokenLink + " : Not Broken Links");
        driver.quit();


    }
}
