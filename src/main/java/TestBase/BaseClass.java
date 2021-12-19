package TestBase;

import Util.testUtil;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class BaseClass {

    public static WebDriver driver;
    public static HomePage HomePage;

    public static void initialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://app-qa.phrasee.co");
        driver.manage().window().maximize();
        HomePage = new HomePage(driver);
        driver.manage().deleteAllCookies();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(testUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }

    public void pageLoadTimeout(){
        driver.manage().timeouts().pageLoadTimeout(testUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    }

    public void scriptWait(int timeToWait) throws InterruptedException {
        Thread.sleep(timeToWait);
    }

    public void tearDown(){
        driver.quit();
    }
}