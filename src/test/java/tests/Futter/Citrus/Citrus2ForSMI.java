package tests.Futter.Citrus;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.Futter.Methods;

import static tests.Futter.Links.LinkCarrier;
import static tests.Futter.Links.LinkForSMI;
import static tests.Futter.XpathFutter.Carrier;
import static tests.Futter.XpathFutter.ForSMI;

public class Citrus2ForSMI extends Methods {

    @Test(description = "tests citrus")
    public static void FutterCheck1Carrier() throws InterruptedException {
        WaitLoadPage();
        ClickButton(ForSMI);
        Assert(LinkForSMI, "futter2");
    }
}