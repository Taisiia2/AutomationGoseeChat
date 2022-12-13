package tests.Futter.Citrus;

import org.testng.annotations.Test;

import java.awt.*;

import static tests.Futter.Citrus.Links.LinkAboutCompany;
import static tests.Futter.Citrus.XpathFutter.AboutCompany;

public class Citrus6AboutCompany extends Methods {
    @Test(description = "tests citrus")
    public static void FutterCheck6() throws InterruptedException, AWTException {
        ScrollToFutter();
        waitUntil(AboutCompany);
        ClickButton(AboutCompany);
        WaitLoadPage(2000);
        GoToNewTabBrowser();
        Assert(LinkAboutCompany, "futter6");
    }
}
