package tests.Futter.Citrus;

import org.testng.annotations.Test;
import tests.Futter.Methods;

import static tests.Futter.Links.LinkOPTClient;
import static tests.Futter.Links.LinkStores;
import static tests.Futter.XpathFutter.OPTClients;
import static tests.Futter.XpathFutter.Stores;

public class Citrus9Stores extends Methods {
    @Test(description = "tests citrus")
    public static void FutterCheck9() throws InterruptedException {
        WaitLoadPage(2000);
        ClickButton(Stores);
        WaitLoadPage(2000);
        Assert(LinkStores, "futter9");
    }
}

