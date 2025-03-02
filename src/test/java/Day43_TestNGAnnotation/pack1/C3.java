package Day43_TestNGAnnotation.pack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
    @Test
    void pqr()
    {
        System.out.println("pqr methdo");
    }

    @BeforeSuite
    void bs()
    {
        System.out.println("Before suite");
    }

    @AfterSuite
    void as()
    {
        System.out.println("after suite");
    }
}
