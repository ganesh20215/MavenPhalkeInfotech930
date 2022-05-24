package extendsreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;


public class ExtendsReportExample {

    public static Logger logger = LogManager.getLogger(ExtendsReportExample.class);

//    ExtentReports reports = new ExtentReports();
//    ExtentSparkReporter spark = new ExtentSparkReporter("MorningBatchReport.html");
//    ExtentTest test;

//    @BeforeTest
//    void beforeTest() {
//        reports.attachReporter(spark);
//    }


    @Test
    public void verifyTest1() {
        System.out.println("verifyTest 1");
        logger.info("This is an information message");
        logger.trace("This is a trace message");
        logger.error("This is an error message");
        logger.warn("this is a warn message");
        logger.fatal("this is a fatal message");
//        test = reports.createTest("This is my first test 1").assignAuthor("Amol").assignDevice("chrome");
//        test.pass("test 1 is passing");
    }

/*    @Test
    public void verifyTest2() {
        System.out.println("verifyTest 2");
        test = reports.createTest("This is my second test 2").assignAuthor("Laxmikant").assignDevice("Firefox");
        test.fail("test 2 is fail");
        Assert.assertFalse(true);
    }

    @Test
    public void verifyTest3() {
        System.out.println("verifyTest 3");
        test = reports.createTest("This is my Third test 3").assignAuthor("pramila").assignDevice("IE");
        ;
        test.pass("test 3 is passing");
    }

    @Test
    public void verifyTest4() {
        System.out.println("verifyTest 4");
        test = reports.createTest("This is my Fourth test 4").assignAuthor("Sonam").assignDevice("edge");
        ;
        test.pass("test 4 is passing");
    }

    @Test
    public void verifyTest5() {
        System.out.println("verifyTest 5");
        test = reports.createTest("This is my Fourth test 5").assignAuthor("priti").assignDevice("opera");
        ;
        test.pass("test 5 is passing");
    }

    @Test
    public void verifyTest6() {
        System.out.println("verifyTest 6");
        test = reports.createTest("This is my second test 6").assignAuthor("Priyanka").assignDevice("Safari");
        test.fail("test 6 is fail");
        Assert.assertFalse(true);
    }*/

//    @AfterTest
//    void afterTest() {
//        reports.flush();
//    }
}
