package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

    public static WebDriver driver;


    @Parameters("browserName")
    @BeforeMethod
    void beforeMethod(String browserName) {
        if(browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\ganesh.jadhav\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        }else if(browserName.equals("edge")){
            System.setProperty("webdriver.edge.driver", "C:\\Users\\ganesh.jadhav\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            System.out.println("Please select the correct browser name");
        }

    }

    @Parameters("keyword")
    @Test
    public void feedValues(String keyword){
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(keyword);
        element.sendKeys(Keys.ENTER);
    }

    @Parameters({"a", "b"})
    @Test
    public void verifyParameterization(int a, int b){
        System.out.println(a + b);
    }
}
