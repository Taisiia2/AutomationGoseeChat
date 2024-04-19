package notifications;

import Methdos.Methods;
import org.testng.annotations.Test;

import java.io.IOException;

import static xpath.and.methods.LogFile.LogIntoFile;
import static xpath.and.methods.StaticVariable.RegistrarionMth;
import static xpath.and.methods.Xpath.*;
import static xpath.and.methods.Xpath.NewNotificationName;

public class DeleteNotififcation extends Methods {
    @Test(description = "Create new notification")
    public void Test1() throws InterruptedException, IOException {
        RegistrarionMth();
        ClickButton(AdminNotificationButton);
        ClickButton(NotificationsButton);
        SendKeysWithoutEnter(SearchFieldNotification,"hpqmmkjdor");
        WaitLoadPage(7000);
        ClickButton(ActionNotificationButton);
        ClickButton(DeleteNotificationButton);
        LogIntoFile("Test case 888 pass");
    }
}
