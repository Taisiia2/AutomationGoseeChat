package tests.Futter.Citrus;

import org.testng.annotations.Test;
import tests.Futter.Methods;

import static tests.Futter.Links.LinkOPTClient;
import static tests.Futter.XpathFutter.OPTClients;

public class Citrus7OPTClients extends Methods {
    @Test(description = "tests citrus")
    public static void FutterCheck7() throws InterruptedException {
        WaitLoadPage(2000);
        ClickButton(OPTClients);
        WaitLoadPage(2000);
        GoToNewTabBrowser();
        Assert(LinkOPTClient, "futter7");
    }
}

