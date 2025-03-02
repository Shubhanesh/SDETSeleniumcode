package Day42_TestNg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
@Test(priority=1)
    void openapp()
    {
        System.out.println("Open application");

    }
    @Test(priority=2)

    void login()
    {
        System.out.println("login application");

    }
    @Test(priority=3)
    void logout()
    {
        System.out.println("logout application");

    }


}
