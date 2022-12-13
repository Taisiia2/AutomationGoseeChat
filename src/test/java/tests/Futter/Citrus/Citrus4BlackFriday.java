package tests.Futter.Citrus;

import org.testng.annotations.Test;

import java.awt.*;

import static tests.Futter.Citrus.Links.LinkBlackFriday;
import static tests.Futter.Citrus.XpathFutter.BlackFriday;

public class Citrus4BlackFriday extends Methods {
    @Test(description = "tests citrus")
    public static void FutterCheck4() throws InterruptedException, AWTException {
        ScrollToFutter();
        waitUntil(BlackFriday);
        ClickButton(BlackFriday);
        WaitLoadPage(2000);
        GoToNewTabBrowser();
        Assert(LinkBlackFriday, "futter4");
    }
}
