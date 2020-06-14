package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.MyDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase {

    public WebDriver driver=null;

    @Parameters("driverName")

    @BeforeClass(alwaysRun = true)
    public void setUp( String drivername){
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
        driver= MyDriver.getDriver(drivername);
        driver.manage().window().maximize();


    }

}
