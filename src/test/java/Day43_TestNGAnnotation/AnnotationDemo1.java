package Day43_TestNGAnnotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo1 {
    @BeforeMethod
    void login()
    {
        System.out.println("login method");
    }
    @Test(priority=1)
    void search()
    {
        System.out.println("search");
    }
    @Test(priority=2)
    void advanceSearch(){
        System.out.println("adv search");
    }

    @AfterMethod
    void logout()
    {
        System.out.println("logout");
    }
}
