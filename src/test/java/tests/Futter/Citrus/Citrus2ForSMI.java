package tests.Futter.Citrus;

import org.testng.annotations.Test;

import java.awt.*;

import static tests.Futter.Citrus.Links.LinkForSMI;
import static tests.Futter.Citrus.XpathFutter.ForSMI;

public class Citrus2ForSMI extends Methods {

    @Test(description = "tests citrus")
    public static void FutterCheck2() throws InterruptedException, AWTException {
        ScrollToFutter();
        waitUntil(ForSMI);
        ClickButton(ForSMI);
        WaitLoadPage(3000);
        Assert(LinkForSMI, "futter2");
    }
}