package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import java.util.HashMap;
import java.util.Map;

public class ExtentTestManager {
    private static final Map<Long, ExtentTest> testMap = new HashMap<>();
    private static final ExtentReports extent = ExtentManager.getInstance();

    public static synchronized ExtentTest getTest() {
        return testMap.get(Thread.currentThread().getId());
    }

    public static synchronized void startTest(String testName) {
        ExtentTest test = extent.createTest(testName);
        testMap.put(Thread.currentThread().getId(), test);
    }

    public static synchronized void endTest() {
        extent.flush();
    }
}
