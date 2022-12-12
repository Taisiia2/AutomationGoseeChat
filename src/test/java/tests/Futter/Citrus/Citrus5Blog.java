package tests.Futter.Citrus;

import org.testng.annotations.Test;
import tests.Futter.Methods;

import static tests.Futter.Links.LinkBlackBlog;
import static tests.Futter.Links.LinkBlackFriday;
import static tests.Futter.XpathFutter.BlackFriday;
import static tests.Futter.XpathFutter.Blog;

public class Citrus5Blog extends Methods {
    @Test(description = "tests citrus")
    public static void FutterCheck5() throws InterruptedException {
        WaitLoadPage(3000);
        ClickButton(Blog);
        WaitLoadPage(2000);
        Assert(LinkBlackBlog, "futter5");
    }
}