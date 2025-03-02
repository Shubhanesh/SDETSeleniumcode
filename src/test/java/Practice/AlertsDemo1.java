package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsDemo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //normal alert

       /* driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
        Thread.sleep(5000);
      Alert myalert= driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();

        */

        //ok or cancle alert
      /*  driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
        Thread.sleep(5000);
        Alert myalert1=driver.switchTo().alert();
        System.out.println(myalert1.getText());
        myalert1.accept();
        /*Alert canclealert=driver.switchTo().alert();
        System.out.println(canclealert.getText());
        canclealert.dismiss();

         */

        //Prompt alert
        driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
        Thread.sleep(5000);

        Alert promptalrt=driver.switchTo().alert();
        System.out.println(promptalrt.getText());


        promptalrt.sendKeys("welcome");
        Thread.sleep(5000);

        promptalrt.accept();



    }
}
