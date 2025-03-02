package Day37_JavaScriptExecuter_Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class JavascriptExecuter_Demo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();//need type casting
       // ChromeDriver driver1=new ChromeDriver();//no need type casting

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
       // driver.findElement(By.xpath("//input[@id='name']")).sendKeys("shubha");//using sendkeys method

        // java script--SendKeys()
        WebElement namebox=driver.findElement(By.xpath("//input[@id='name']"));

        //upcasting storing child class object to parent class refer the diagram
        JavascriptExecutor js= (JavascriptExecutor)driver;// assiging webdriver variable to javascript variable

       // JavascriptExecutor js1= driver1;

      //  js.executeAsyncScript("arguments[0].setAttribute('value','shubha')",namebox);

        // Click action
        WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
        radiobtn.click();
       // js.executeScript("arguments[0].click()",radiobtn);



    }
}
