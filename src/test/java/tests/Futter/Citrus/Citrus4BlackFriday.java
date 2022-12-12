package tests.Futter.Citrus;

import org.testng.annotations.Test;
import tests.Futter.Methods;

import static tests.Futter.Links.LinkBlackFriday;
import static tests.Futter.Links.LinkNews;
import static tests.Futter.XpathFutter.BlackFriday;
import static tests.Futter.XpathFutter.News;

public class Citrus4BlackFriday extends Methods {
    @Test(description = "tests citrus")
    public static void FutterCheck4() throws InterruptedException {
        WaitLoadPage(2000);
        ClickButton(BlackFriday);
        WaitLoadPage(2000);
        GoToNewTabBrowser();
        Assert(LinkBlackFriday, "futter4");
    }
}
