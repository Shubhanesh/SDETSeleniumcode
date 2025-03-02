package Day44_TestNG_DependncyMethod_Grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMerhod {
@Test(priority = 1)
    void openapp()
    {
        Assert.assertTrue(false);

    }
    @Test(priority = 2 ,dependsOnMethods={"openapp"})
    void login()
    {
        Assert.assertTrue(true);

    }
    @Test(priority = 3,dependsOnMethods={"login"})
    void serach()
    {
        Assert.assertTrue(true);

    }
    @Test(priority = 4,dependsOnMethods={"login","serach"})
    void Advsearch()
    {
        Assert.assertTrue(true);

    }
    @Test(priority = 5,dependsOnMethods={"login"})
    void logout()
    {
        Assert.assertTrue(true);

    }
}
