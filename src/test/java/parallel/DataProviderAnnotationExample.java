package parallel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class DataProviderAnnotationExample {

    public WebDriver driver;

    @DataProvider(name = "excel-data")
    public Object[][] dataProvider() {
        Object[][] arrayObj = getExcelData("C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Desktop\\publish_events\\TestDataMorningBatch.xlsx", "TestData1");
        return arrayObj;
    }

    public String[][] getExcelData(String filePath, String sheetName) {
        String[][] data = null;
        try {
            FileInputStream file = new FileInputStream(filePath);
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sh = wb.getSheet(sheetName);
            XSSFRow row = sh.getRow(0);
            int noOfRows = sh.getPhysicalNumberOfRows();
            int noOfCols = row.getLastCellNum();
            Cell cell;
            data = new String[noOfRows - 1][noOfCols];

            for (int i = 1; i < noOfRows; i++) {
                for (int j = 0; j < noOfCols; j++) {
                    row = sh.getRow(i);
                    cell = row.getCell(j);
                    data[i - 1][j] = cell.getStringCellValue();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test(dataProvider = "excel-data")
    public void feedValues(String keyword1, String keyword2) {
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(keyword1, keyword2);
        element.sendKeys(Keys.ENTER);
        System.out.println("Hello");
        System.out.println("Hello");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
