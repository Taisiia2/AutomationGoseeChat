package tests.Futter.Citrus;

import org.testng.annotations.Test;

import java.awt.*;

import static tests.Futter.Citrus.Links.LinkStores;
import static tests.Futter.Citrus.XpathFutter.Stores;

public class Citrus9Stores extends Methods {
    @Test(description = "tests citrus")
    public static void FutterCheck9() throws InterruptedException, AWTException {
        ScrollToFutter();
        waitUntil(Stores);
        ClickButton(Stores);
        WaitLoadPage(2000);
        Assert(LinkStores, "futter9");
    }
}

