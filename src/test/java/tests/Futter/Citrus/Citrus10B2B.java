package tests.Futter.Citrus;

import org.testng.annotations.Test;
import tests.Futter.Methods;

import static tests.Futter.Links.LinkB2B;
import static tests.Futter.Links.LinkOPTClient;
import static tests.Futter.XpathFutter.B2B;
import static tests.Futter.XpathFutter.OPTClients;

public class Citrus10B2B extends Methods {
    @Test(description = "tests citrus")
    public static void FutterCheck10() throws InterruptedException {
        WaitLoadPage(2000);
        ClickButton(B2B);
        WaitLoadPage(2000);
        GoToNewTabBrowser();
        Assert(LinkB2B, "futter10");
    }
}