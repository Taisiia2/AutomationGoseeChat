package tests.Futter.Citrus;

import org.testng.annotations.Test;

import java.awt.*;

import static tests.Futter.Citrus.Links.LinkBlackBlog;
import static tests.Futter.Citrus.XpathFutter.Blog;

public class Citrus5Blog extends Methods {
    @Test(description = "tests citrus")
    public static void FutterCheck5() throws InterruptedException, AWTException {
        ScrollToFutter();
        waitUntil(Blog);
        ClickButton(Blog);
        WaitLoadPage(3000);
        Assert(LinkBlackBlog, "futter5");
    }
}