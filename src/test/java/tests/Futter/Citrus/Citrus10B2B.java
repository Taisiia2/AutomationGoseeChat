package tests.Futter.Citrus;

import org.testng.annotations.Test;

import java.awt.*;

import static tests.Futter.Citrus.Links.LinkB2B;
import static tests.Futter.Citrus.XpathFutter.B2B;

public class Citrus10B2B extends Methods {
    @Test(description = "tests citrus")
    public static void FutterCheck10() throws InterruptedException, AWTException {
        ScrollToFutter();
        waitUntil(B2B);
        ClickButton(B2B);
        WaitLoadPage(2000);
        GoToNewTabBrowser();
        Assert(LinkB2B, "futter10");
    }
}