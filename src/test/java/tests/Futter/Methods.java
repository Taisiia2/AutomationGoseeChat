package tests.Futter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;


public class Methods {


    protected static WebDriver driver;

    @BeforeClass
    public static void Connect() {
        try {

            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.get("https://www.ctrs.com.ua/ru/");
        } catch (Exception e) {
        }
    }

    public static void waitUntil(String selector) {
        WebElement element = (new WebDriverWait(driver, java.time.Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(selector)));
    }
    public static void GetRegUrlForRegistrationEmail(){
        String GetURLPage = driver.getCurrentUrl();
        Assert.assertEquals("https://my.ctrs.com.ua/ru/auth/register", GetURLPage,"test url registration page");
    }
    public static void GetRegUrlForAuthorizationEmail() throws InterruptedException {
        String GetURLPage = driver.getCurrentUrl();
        Thread.sleep(700);
        Assert.assertEquals("https://my.ctrs.com.ua/ru/auth/email", GetURLPage,"test url registration page");
    }
    public static void GetRegUrlForRegistrationPhoneNember(){
        String GetURLPage = driver.getCurrentUrl();
        Assert.assertEquals("https://my.ctrs.com.ua/ru/auth/sms_code", GetURLPage,"test url registration page");
    }
    public static void CheckLinkAuthorization(){
        String GetURLPage = driver.getCurrentUrl();
        Assert.assertEquals("https://my.ctrs.com.ua/ru/orders", GetURLPage,"test url registration page");
    }


    public static void ClickButton(String xp){
        WebElement element = driver.findElement(By.xpath(xp));
        element.click();
    }

    public static void Assert(String tl, String task){
        String gl = driver.getCurrentUrl();
        Assert.assertEquals(gl,tl,task);
    }

    public static void Scroll() {
        ((JavascriptExecutor) driver).executeScript("5000");

    }

    public static void WaitLoadPage() throws InterruptedException {
        Thread.sleep(1000);
    }



    @AfterClass(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}

