package Day43_TestNGAnnotation.pack1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
    @Test
    /*void test_hardassertion(){
        System.out.println("testing");
        Assert.assertEquals(1,2);
        System.out.println("Testing");
    }

     */
    void test_softassertions(){


        System.out.println("testing");
        SoftAssert sa=new SoftAssert();
      sa.assertEquals(1,2);
        System.out.println("Testing");
        sa.assertAll();//mandtory
    }
}
