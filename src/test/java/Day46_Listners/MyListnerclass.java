package Day46_Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListnerclass implements ITestListener {
   public void onStart(ITestContext context)

    {
        System.out.println("Test Execution is started.....");
    }
  public void onTestStart(ITestResult result)
    {
        System.out.println("test started..");
    }

   public void onTestSuccess(ITestResult result)
    {
        System.out.println("test passed");
    }

    public void onTestFailure(ITestResult result)
    {
        System.out.println("test failed");
    }

public void onTestSkipped(ITestResult result)
    {
        System.out.println("Test skipped");
    }

   public void onFinish(ITestContext context)
    {
        System.out.println("Test finished");
    }
}



