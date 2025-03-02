package Day43_TestNGAnnotation;

import org.testng.annotations.*;

public class AnnotationDemo2 {
    @BeforeClass
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

    @AfterClass
    void logout()
    {
        System.out.println("logout");
    }
}
