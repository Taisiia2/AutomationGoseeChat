package tests.Futter.Citrus;

import org.testng.annotations.Test;
import tests.Futter.Methods;

import static tests.Futter.Links.LinkCarrier;
import static tests.Futter.XpathFutter.Carrier;

public class Citrus1Carier extends Methods {

    @Test(description = "tests citrus")
    public static void FutterCheck1Carrier() throws InterruptedException {
        WaitLoadPage();
        ClickButton(Carrier);
        WaitLoadPage();
        Assert(LinkCarrier, "futter1");
    }
}