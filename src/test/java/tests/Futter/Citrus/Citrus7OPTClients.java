package tests.Futter.Citrus;

import org.testng.annotations.Test;

import java.awt.*;

import static tests.Futter.Citrus.Links.LinkOPTClient;
import static tests.Futter.Citrus.XpathFutter.OPTClients;

public class Citrus7OPTClients extends Methods {
    @Test(description = "tests citrus")
    public static void FutterCheck7() throws InterruptedException, AWTException {
        ScrollToFutter();
        waitUntil(OPTClients);
        ClickButton(OPTClients);
        WaitLoadPage(2000);
        GoToNewTabBrowser();
        Assert(LinkOPTClient, "futter7");
    }
}

