package tests.Futter.Citrus;

import org.testng.annotations.Test;

import java.awt.*;

import static tests.Futter.Citrus.Links.LinkSupports;
import static tests.Futter.Citrus.XpathFutter.Supports;

public class Citrus8Supports extends Methods {
    @Test(description = "tests citrus")
    public static void FutterCheck8() throws InterruptedException, AWTException {
        ScrollToFutter();
        waitUntil(Supports);
        ClickButton(Supports);
        WaitLoadPage(2000);
        Assert(LinkSupports, "futter8");
    }
}