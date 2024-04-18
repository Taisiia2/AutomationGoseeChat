package notifications;

import Methdos.Methods;
import org.testng.annotations.Test;

import static xpath.and.methods.StaticVariable.RegistrarionMth;
import static xpath.and.methods.Xpath.*;

public class AddNewNotification extends Methods {
    @Test(description = "Create new notification")
    public void Test1() throws InterruptedException{
        RegistrarionMth();
        ClickButton(AdminNotificationButton);
        ClickButton(NotificationsButton);
        ClickButton(OpenNotificationForm);
        String name = randomName();
SendKeys(FieldNameNotification,name);
SendKeys(FieldSlugNotification, name);
ClickButton(SaveNotificationButton);
        WaitLoadPage(15000);
        SendKeysWithoutEnter(SearchFieldNotification,name);
        WaitLoadPage(2000);
        String newNotififcation = getTXT(NewNotificationName);
        AssertTXT(name, newNotififcation);
    }
}