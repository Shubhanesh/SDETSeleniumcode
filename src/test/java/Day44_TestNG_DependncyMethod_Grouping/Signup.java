package Day44_TestNG_DependncyMethod_Grouping;

import org.testng.annotations.Test;

public class Signup {
    @Test(priority = 1,groups = {"regression"})
    void signupbyEmail()
    {
        System.out.println("signup by email");
    }
    @Test(priority = 2,groups = {"regression"})
    void signupByFB()
    {
        System.out.println("sign up by FB");
    }
    @Test(priority = 3,groups = {"regression"})
    void signupByTwitter(){
        System.out.println("sign up by twitter");
    }
}
