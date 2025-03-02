package Day30_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();


        driver.switchTo().frame(1);
        WebElement frame0= driver.findElement(By.xpath("//iframe[@id='frame1']"));
                //driver.findElement(By.id("sampleHeading"));

       String frameotext=frame0.getText();
        System.out.println("The text of frame :"+frameotext);

        driver.switchTo().defaultContent();

    }
}
