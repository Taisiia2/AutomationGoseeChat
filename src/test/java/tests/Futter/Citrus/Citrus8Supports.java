package tests.Futter.Citrus;

import org.testng.annotations.Test;
import tests.Futter.Methods;

import static tests.Futter.Links.LinkOPTClient;
import static tests.Futter.Links.LinkSupports;
import static tests.Futter.XpathFutter.OPTClients;
import static tests.Futter.XpathFutter.Supports;

public class Citrus8Supports extends Methods {
    @Test(description = "tests citrus")
    public static void FutterCheck8() throws InterruptedException {
        WaitLoadPage(2000);
        ClickButton(Supports);
        WaitLoadPage(2000);
        Assert(LinkSupports, "futter8");
    }
}