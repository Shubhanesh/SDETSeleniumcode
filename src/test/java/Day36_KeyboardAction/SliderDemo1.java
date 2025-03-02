package Day36_KeyboardAction;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        // Locate the minimum slider
        WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
        System.out.println("Before moving minimum slider location: " + min_slider.getLocation());

        // Move the minimum slider
        act.dragAndDropBy(min_slider, 100, 0).build().perform();
        Thread.sleep(1000); // Wait to allow DOM update

        // Refresh slider reference and print new location
        WebElement updatedMinSlider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
        System.out.println("After moving location of min_slider: " + updatedMinSlider.getLocation());

        // Locate the maximum slider
        WebElement max_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
        System.out.println("Before moving location of maximum slider: " + max_slider.getLocation());

        // Move the maximum slider
        act.dragAndDropBy(max_slider, -50, 0).build().perform();
        Thread.sleep(1000); // Wait to allow DOM update

        // Refresh slider reference and print new location
        WebElement updatedMaxSlider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
        System.out.println("After moving location of max_slider: " + updatedMaxSlider.getLocation());

        // Close the browser
        driver.quit();
    }
}