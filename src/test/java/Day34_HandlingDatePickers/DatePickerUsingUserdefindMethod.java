package Day34_HandlingDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerUsingUserdefindMethod {

    static void selectPastDate(WebDriver driver,String month,String year,String date){
        while(true) {
            String current_yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            if (current_month.equals(month) && current_yr.equals(year)) {
                break;
            }
            // driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  //next button

            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous button
        }
        List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//a"));
        for(WebElement dt:dates){
            if (dt.getText().equals(date)){
                dt.click();
                break;
            }

        }

    }
    static void selectFutureDate(WebDriver driver,String month,String year,String date){
        while(true) {
            String current_yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            if (current_month.equals(month) && current_yr.equals(year)) {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  //next button


        }
        List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//a"));
        for(WebElement dt:dates){
            if (dt.getText().equals(date)){
                dt.click();
                break;
            }

        }

    }


    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);


        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
      //selectPastDate(driver,"June","2024","5");
        selectFutureDate(driver,"May","2025","1");


    }
}
