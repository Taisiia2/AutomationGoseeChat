package notifications;

import Methdos.Methods;
import org.testng.annotations.Test;

import java.io.IOException;

import static xpath.and.methods.StaticVariable.RegistrarionMth;
import static xpath.and.methods.Xpath.*;

public class DeleteNotification extends Methods {
    @Test(description = "Delete notification")
    public void Test1() throws InterruptedException, IOException {
        RegistrarionMth();
        ClickButton(AdminNotificationButton);
        ClickButton(NotificationsButton);
        SendKeysWithoutEnter(SearchFieldNotification,"fhzmdtfyew");
        WaitLoadPage(7000);
        ClickButton(ActionNotificationButton);
        ClickButton(DeleteNotificationButton);
    }
}
