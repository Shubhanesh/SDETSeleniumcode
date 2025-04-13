package TestAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandlePopupWin {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='PopUp']")).click();
        Set<String> collectallwin=driver.getWindowHandles();

        List<String> arraylist=new ArrayList<>(collectallwin);
        String parentid=arraylist.get(0);
        String childid=arraylist.get(1);
        String childid1=arraylist.get(2);
        System.out.println(parentid);

        driver.switchTo().window(childid);
        System.out.println("tile of child window:"+driver.getTitle());
        driver.switchTo().window(childid1);
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentid);
        System.out.println("title of parent window:" + driver.getTitle());

    }
}
