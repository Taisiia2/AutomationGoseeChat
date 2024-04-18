package mange_accaunts;

import Methdos.Methods;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static xpath.and.methods.StaticVariable.RegistrarionMth;
import static xpath.and.methods.Xpath.*;

public class DeleteUser extends Methods {
    @Test(description = "Delete User")
    public void Test1() throws InterruptedException{
        RegistrarionMth();
        ClickButton(ButtonApps);
        ClickButton(ButtonUserManager);
        ClickButton(Employee);
        ClickButton(Employees);
        SendKeysWithoutEnter(FieldSearch,"Oleksii");
        ClickButton(ButtonActions);
        ClickButton(ButtonDismiss);
        SendKeysWithoutEnter(FieldSearch,"Oleksii");
        String newUser = getTXT(NegativeBackDataFromFieldSearch);
        AssertTXT("10", newUser);


    }
}

