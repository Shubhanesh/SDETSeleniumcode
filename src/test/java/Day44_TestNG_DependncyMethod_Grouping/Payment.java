package Day44_TestNG_DependncyMethod_Grouping;

import org.testng.annotations.Test;

public class Payment {
    @Test(priority = 1,groups = {"sanity","regression","functional"})

    void paymentinRupee()
    {
        System.out.println("payment in RS");
    }
    @Test(priority = 2,groups = {"sanity","regression","functional"})

    void paymentinDoller()
    {
        System.out.println("payment in doller");
    }
}
