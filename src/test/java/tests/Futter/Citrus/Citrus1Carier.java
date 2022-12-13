package tests.Futter.Citrus;

import org.testng.annotations.Test;

import java.awt.*;

import static tests.Futter.Citrus.Links.LinkCarrier;
import static tests.Futter.Citrus.XpathFutter.Carrier;

public class Citrus1Carier extends Methods {

    @Test(description = "tests citrus")
    public static void FutterCheck1() throws InterruptedException, AWTException {
        ScrollToFutter();
        waitUntil(Carrier);
        ClickButton(Carrier);
        WaitLoadPage(2000);
        Assert(LinkCarrier, "futter1");
    }
}