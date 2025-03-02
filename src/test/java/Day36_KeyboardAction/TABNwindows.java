package Day36_KeyboardAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TABNwindows {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.switchTo().newWindow(WindowType.TAB);// new tab
        driver.switchTo().newWindow(WindowType.WINDOW);//new window

        driver.get("https://demo.nopcommerce.com/");
    }


}
