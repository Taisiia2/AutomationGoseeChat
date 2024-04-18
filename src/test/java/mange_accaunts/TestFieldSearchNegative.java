package mange_accaunts;

import Methdos.Methods;
import org.testng.annotations.Test;

import static xpath.and.methods.StaticVariable.RegistrarionMth;
import static xpath.and.methods.Xpath.*;
import static xpath.and.methods.Xpath.NewEmployeeName;

public class TestFieldSearchNegative extends Methods {
    @Test(description = "Test field search positive data")
    public void Test1() throws InterruptedException{
        RegistrarionMth();
        ClickButton(ButtonApps);
        ClickButton(ButtonUserManager);
        ClickButton(Employee);
        ClickButton(Employees);
        SendKeysWithoutEnter(FieldSearch,"negative test");
        String newUser = getTXT(NegativeBackDataFromFieldSearch);
        AssertTXT("10", newUser);

//        waitUntil(String.valueOf(10000));

    }
}