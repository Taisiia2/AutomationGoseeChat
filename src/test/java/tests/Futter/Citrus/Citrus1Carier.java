package tests.Futter.Citrus;

import org.testng.annotations.Test;
import tests.Futter.Methods;

import static tests.Futter.Links.LinkCarrier;
import static tests.Futter.XpathFutter.Carrier;

public class Citrus1Carier extends Methods {

    @Test(description = "tests citrus")
    public static void FutterCheck1() throws InterruptedException {
        WaitLoadPage(2000);
        ClickButton(Carrier);
        WaitLoadPage(2000);
        Assert(LinkCarrier, "futter1");
    }
}