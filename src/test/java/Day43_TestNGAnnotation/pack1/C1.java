package Day43_TestNGAnnotation.pack1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {

    @Test
    void abc()
    {
        System.out.println("abc method");

    }
    @BeforeTest
    void bt()
    {
        System.out.println("Before Test");

    }
}
