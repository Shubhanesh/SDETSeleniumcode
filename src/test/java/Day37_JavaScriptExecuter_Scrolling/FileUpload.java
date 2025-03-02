package Day37_JavaScriptExecuter_Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();
       /* driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\insprie tranning\\automation files\\selenium automation code.txt");

       if( driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("selenium automation code.txt")){
           System.out.println("File is sucessfully uploaded");

       }
       else{
           System.out.println("file upload failed");
       }

        */
        // Upload multiple file

        String file1="C:\\insprie tranning\\automation files\\selenium automation code.txt";
        String file2="C:\\insprie tranning\\\\automation files\\project notes.txt";

        String filePaths = file1 + "\n" + file2;

        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(filePaths);
        int nooffilesuploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();

        if (nooffilesuploaded==2){
            System.out.println("Files are uploaded");
        }
        else {
            System.out.println("files uploaded are failed ");
        }

        //validations
        if( driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("selenium automation code.txt")&&
                driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("project notes.txt")){
            System.out.println("files name are matching");
        }
        else {
            System.out.println("files name are not matching ");
        }


    }
}
