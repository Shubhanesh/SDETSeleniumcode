package Day36_KeyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SilderDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
        driver.manage().window().maximize();
        Actions act=new Actions(driver);
       WebElement min_slider=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
       min_slider.getLocation().getX();//if we want to only x value vice versa
        System.out.println("before moving minimum slider location :" +min_slider.getLocation());

        act.dragAndDropBy(min_slider,100,256).perform();
        System.out.println("after moving location of min_silder ;"+min_slider.getLocation());

        // maximum slider
       WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
        System.out.println("before moving location of mazimum slider:"+max_slider.getLocation());
        act.dragAndDropBy(max_slider,49,249);
        System.out.println("after moving location of mazimum slider:"+max_slider.getLocation());


    }
}
