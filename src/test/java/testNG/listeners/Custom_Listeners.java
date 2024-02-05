package testNG.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.List;

public class Custom_Listeners implements ITestListener {

    //
    @Override
    public void onStart(ITestContext context) {
        System.out.println("invoked after the test class is instantiated and before any config method is called " + context.getName());
        ITestListener.super.onStart(context);
    }
    @Override
    public void onFinish(ITestContext arg) {
        System.out.println("ITestContext........... " + arg.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart ........... " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult skip) {

        System.out.println("onTestSkipped .............. "+ skip.getName());
    }

    @Override
    public void onTestSuccess(ITestResult success) {
        System.out.println("onTestSuccess .................... "+ success.getName());
    }

    @Override
    public void onTestFailure(ITestResult failure) {
        System.out.println("onTestFailed ................ "+ failure.getName());
    }
    //not much in use, but we have to define it here because ITestListener is an interface it must address all the INTERFACE

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult faiSuccPercentage) {
        System.out.println("invoked each time a method fails but has been\n" +
                "                                           annotated with successPercentage this failure still keeps it\n" +
                "                                           within the success percentage "+ faiSuccPercentage.getName());
    }

}
