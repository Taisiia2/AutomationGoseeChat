package tests.Futter.Citrus;

import org.testng.annotations.Test;
import tests.Futter.Methods;

import static tests.Futter.Links.LinkAboutCompany;
import static tests.Futter.XpathFutter.AboutCompany;

public class Citrus6AboutCompany extends Methods {
    @Test(description = "tests citrus")
    public static void FutterCheck6() throws InterruptedException {
        WaitLoadPage(2000);
        ClickButton(AboutCompany);
        WaitLoadPage(2000);
        GoToNewTabBrowser();
        Assert(LinkAboutCompany, "futter6");
    }
}
