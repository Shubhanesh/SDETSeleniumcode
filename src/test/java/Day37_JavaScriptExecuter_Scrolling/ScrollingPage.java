package Day37_JavaScriptExecuter_Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js= (JavascriptExecutor)driver;

        // scroll page down by pixcel number

        //js.executeScript("window.scrollBy(0,1000)","");
        //System.out.println(js.executeScript("return window.pageYOffset;"));


        //Scroll the page till element is visible
       // WebElement ele= driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
      //  js.executeScript("arguments[0].scrollIntoView();",ele);
      //  System.out.println(js.executeScript("return window.pageYOffset;"));

        // Scroll page till end of the documents

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
        Thread.sleep(5000);


        //scrolling upto intial position
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");




        // driver.quit();
    }
}
