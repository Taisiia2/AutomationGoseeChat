package tests.Futter.Citrus;

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

import java.awt.*;
import java.awt.event.KeyEvent;
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
            driver.get("https://www.ctrs.com.ua/");
        } catch (Exception e) {
        }
    }

    public static void waitUntil(String selector) {
        WebElement element = (new WebDriverWait(driver, java.time.Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(selector)));
    }

    public static void ClickButton(String xp){
        WebElement element = driver.findElement(By.xpath(xp));
        element.click();
    }

    public static void Assert(String tl, String task){
        String gl = driver.getCurrentUrl();
        Assert.assertEquals(gl,tl,task);
    }

    public static void ScrollToFutter() throws AWTException {
//        ((JavascriptExecutor) driver).executeScript("100000");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_END);
    }

    public static void WaitLoadPage(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    public static void GoToNewTabBrowser() {
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
//        System.out.println(driver.getCurrentUrl());
    }


    @AfterClass(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}

