package tests.Futter.Citrus;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.Futter.Methods;

import static tests.Futter.Links.LinkNews;
import static tests.Futter.XpathFutter.News;

public class Citrus3News extends Methods {
    @Test(description = "tests citrus")
    public static void FutterCheck3() throws InterruptedException {
        WaitLoadPage(2000);
        ClickButton(News);
        WaitLoadPage(2000);
        GoToNewTabBrowser();
        Assert(LinkNews, "futter3");
    }
}
