package TestAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        System.out.println("Total no of links :" +allLinks.size());
        int noofbrokenlinks=0;

        for(WebElement broken:allLinks){
            String herfvalue=broken.getAttribute("herf");
            if(herfvalue==null || herfvalue.isEmpty()){
                System.out.println("Not possible to check");
                continue;
            }

            try{
                URL linkurl=new URL(herfvalue);
                HttpURLConnection connection = (HttpURLConnection) linkurl.openConnection();
                connection.connect();

                if(connection.getResponseCode()>=400){
                    System.out.println("Broken links");
                    noofbrokenlinks++;
                }
                else {
                    System.out.println("Not a broken links");
                }
            }catch (Exception e){

            }
            System.out.println(noofbrokenlinks);
        }
    }
}
