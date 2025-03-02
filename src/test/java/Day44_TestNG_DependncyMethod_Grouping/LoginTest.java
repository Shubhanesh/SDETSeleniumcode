package Day44_TestNG_DependncyMethod_Grouping;

import org.testng.annotations.Test;

public class LoginTest {
    @Test(priority = 1,groups = {"sanity"})
    void loginByemail()
    {
        System.out.println("login by email");

    }
    @Test(priority = 2,groups = {"sanity"})
    void loginByfb()
    {
        System.out.println("login by FB");

    }

    @Test(priority = 3,groups = {"sanity"})
    void loginbyTwitter()
    {
        System.out.println("Login by twitter");

    }
}

