package Day39_BrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinks_Demo {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();
        // capture all links
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total no of links:" +links.size());
        int noofBrokenlinks =0;

        for(WebElement linkele:links){
           String hrefvalue= linkele.getAttribute("href");

           if(hrefvalue==null|| hrefvalue.isEmpty()){
               System.out.println("if href is null or empty then not possible to check");
               continue;
           }

           //hit URL to server
            try {
                URL linkURL = new URL(hrefvalue);//convert href value string to URL
                HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();//Open connection
                conn.connect();//connect server

                if (conn.getResponseCode() >= 400) {
                    System.out.println(hrefvalue+ "====>Broken links");
                    noofBrokenlinks++;
                } else {
                    System.out.println(hrefvalue +"====>Not broken links ");
                }
            }catch(Exception e){

            }

        }
        System.out.println(noofBrokenlinks);
    }

}
