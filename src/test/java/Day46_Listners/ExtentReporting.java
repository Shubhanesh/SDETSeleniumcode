package Day46_Listners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReporting implements ITestListener {
    public ExtentSparkReporter sparkReporter;//ui of the report
    public ExtentReports extent;//populate common info of the report
    public ExtentTest test;//creating test case entries and update status of test method

    public void onStart(ITestContext context)

    {
        sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"Reports/myreport.html");
        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("Functional Testing");
        sparkReporter.config().setTheme(Theme.STANDARD);

        extent=new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Computer name","Local host");
        extent.setSystemInfo("Environment","QA");
        extent.setSystemInfo("Tester name","Shubha");
        extent.setSystemInfo("OS","Window 10");
        extent.setSystemInfo("Browser name","Edge");

    }

    public void onTestSuccess(ITestResult result)
    {
       test=extent.createTest(result.getName());//create new entry in report
        test.log(Status.PASS,"Test case pass is :"+result.getName());//update the status of method
    }

    public void onTestFailure(ITestResult result)
    {
        test=extent.createTest(result.getName());
        test.log(Status.FAIL,"Test case failed is :"+result.getName());
        test.log(Status.FAIL,"Test case fail cause is :"+result.getThrowable());

    }

    public void onTestSkipped(ITestResult result)
    {
       test=extent.createTest(result.getName());
       test.log(Status.SKIP,"Test case Skipped is :"+result.getName());
    }

    public void onFinish(ITestContext context)
    {
        extent.flush();
    }


}
