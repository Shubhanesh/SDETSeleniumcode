package Day35_MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        // switch to frame
        driver.switchTo().frame("iframeResult");


         //input[@id='field1']
          //input[@id='field1']
        //button[@ondblclick='myFunction()']
      // WebElement box1=driver.findElement(By.xpath("//input[@value='Hello World!']"));
      // WebElement box2=driver.findElement(By.xpath("input[@id='field1']"));
      // WebElement button=driver.findElement(By.xpath("button[@ondblclick='myFunction()']"));

        WebElement box1 = driver.findElement(By.id("field1"));
        WebElement box2 = driver.findElement(By.id("field2"));
        WebElement button = driver.findElement(By.tagName("button"));
       box1.clear();
       box1.sendKeys("welcome");
       //dobuleclick action
        Actions act =new Actions(driver);
        act.doubleClick(button).build().perform();

        //validation box 2 contain "wlcome"
       // String text=box2.getText();
        String text=box2.getAttribute("value");
        System.out.println(text);
        if(text.equals("welcome")){
            System.out.println("text copied");

        }
        else {
            System.out.println("Text not copied properly ");
        }
    }
}
