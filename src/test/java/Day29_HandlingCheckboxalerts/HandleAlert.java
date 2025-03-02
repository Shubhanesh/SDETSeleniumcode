package Day29_HandlingCheckboxalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        // normal alert with ok button
        /*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(5000);
        //driver.switchTo().alert().accept();
        Alert myalert=driver.switchTo().alert();// stored in variable
        System.out.println(myalert.getText());
        myalert.accept();

         */

        //Confirmation Alert-ok& cancle
       /* driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(5000);
        //driver.switchTo().alert().accept(); //closed alert using ok button

        driver.switchTo().alert().dismiss();//closed alert using cancle button

        */

        //Promt Alert
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(5000);
        Alert prompt=driver.switchTo().alert();
        prompt.sendKeys("Welcome");
        prompt.accept();
    }
}
