package Day43_TestNGAnnotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionMethod {

    @Test
    void test(){
        Assert.assertEquals("abc","abc");
        Assert.assertEquals("abc","abc1");

        Assert.assertEquals("abc","123");
        Assert.assertEquals("123",123);
        Assert.assertNotEquals(123,123);
        Assert.assertNotEquals(123,345);
        Assert.assertTrue(true);
        Assert.assertTrue(false);
        Assert.assertTrue(1==2);
        Assert.assertTrue(1==1);

        Assert.assertFalse(1==2);
        Assert.assertFalse(1==1);
        Assert.fail();

    }
}
