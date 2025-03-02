package Day43_TestNGAnnotation.pack1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {

    @Test
    void xyz()
    {
        System.out.println("xyz method");

    }
    @AfterTest
    void at()
    {
        System.out.println("after test");

    }

}
