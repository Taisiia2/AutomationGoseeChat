package tests.Futter.Citrus;

import org.testng.annotations.Test;

import java.awt.*;

import static tests.Futter.Citrus.Links.LinkNews;
import static tests.Futter.Citrus.XpathFutter.News;

public class Citrus3News extends Methods {
    @Test(description = "tests citrus")
    public static void FutterCheck3() throws InterruptedException, AWTException {
        ScrollToFutter();
        waitUntil(News);
        ClickButton(News);
        WaitLoadPage(2000);
        GoToNewTabBrowser();
        Assert(LinkNews, "futter3");
    }
}
