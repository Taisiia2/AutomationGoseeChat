package registration;

import Methdos.Methods;
import org.testng.annotations.Test;

import static xpath.and.methods.StaticVariable.RegistrarionMth;
import static xpath.and.methods.Xpath.*;

public class CreateNewUser extends Methods {
    @Test(description = "Create newUser")
    public void Test1() throws InterruptedException{
        RegistrarionMth();
        ClickButton(ButtonApps);
        ClickButton(ButtonUserManager);
        ClickButton(Employee);
        ClickButton(Employees);
        ClickButton(ButtonAddEmployee);
        String name = randomName();
        SendKeys(FieldFullName,name);
        String email = randomEmail();
        SendKeys(FieldFullEmail,email);
        String user = name + "\n" +email;
        getTXT(FieldFullEmail);
        ClickButton(ButtonSaveChanges);
        WaitLoadPage(5000);
        SendKeysWithoutEnter(FieldSearch,name);
        String newUser = getTXT(NewEmployeeName);
        AssertTXT(user, newUser);
    }
}
