package tests.Futter.Categories;

import org.testng.annotations.Test;
import tests.Futter.Methods;

import static tests.Futter.Links.LinkAudio;
import static tests.Futter.Links.LinkCarrier;
import static tests.Futter.XpathFutter.Audio;

public class Audio extends Methods {

    @Test(description = "tests citrus")
    public static void FutterCheck1Carrier() throws InterruptedException {
        WaitLoadPage();
        WaitLoadPage();
        ClickButton(Audio);
        WaitLoadPage();
        Assert(LinkAudio, "Futter Audio");
    }
}
