package Day30_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_demo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        //Frame1
     WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
     driver.switchTo().frame(frame1);//passed frame1 as webelement
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
        driver.switchTo().defaultContent();// go back to page

        //Frame 2
      WebElement  frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
      driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("JAVA");
        driver.switchTo().defaultContent();

        //Frame 3
       WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
       driver.switchTo().frame(frame3);

        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("iframe");

        //inner iframe=inside frame 3
        driver.switchTo().frame(0); //switching using index ie inner frame
        //indexing we will used when only single frame vailable
        driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
        driver.switchTo().defaultContent();

    }
}
