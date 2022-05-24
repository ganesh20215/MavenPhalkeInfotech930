package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertExample {

    public void testFunction(int a, int b) {
        System.out.println(a + b);
    }


    @Test
    public void verifyHardAssert(){
        String a = null;
        String s = "Ganesh";
        Assert.assertEquals(s, "Ganesh", "String should be null");
        Assert.assertFalse(s.contains("test"), "condition should true");
        Assert.assertNotNull(a, "String should not be null");
        System.out.println("Hiii");
        Assert.assertNull(a, " your string should null");
    }

    @Test
    public void verifySoftAssert(){
        SoftAssert softAssert = new SoftAssert();
        String a = null;
        String s = "Ganesh";
        softAssert.assertEquals(s, "Ganesh", "String should be null");
        softAssert.assertFalse(s.contains("test"), "condition should true");
        softAssert.assertNotNull(a, "String should not be null");
        System.out.println("Hiii");
        softAssert.assertNull(a, " your string should null");
        softAssert.assertAll();
    }
}
