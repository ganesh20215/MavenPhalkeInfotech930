package listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzerExample implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxCount = 2;

    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxCount) {
            retryCount++;
            return true;
        }

        return false;
    }
}
