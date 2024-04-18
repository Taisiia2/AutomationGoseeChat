package mange_accaunts;

import Methdos.Methods;
import org.testng.annotations.Test;

import static xpath.and.methods.StaticVariable.RegistrarionMth;
import static xpath.and.methods.Xpath.*;

public class TestFieldSearchPositive extends Methods {
    @Test(description = "Test field search positive data")
    public void Test1() throws InterruptedException{
        RegistrarionMth();
        ClickButton(ButtonApps);
        ClickButton(ButtonUserManager);
        ClickButton(Employee);
        ClickButton(Employees);
        SendKeysWithoutEnter(FieldSearch,"Testik");
        String newUser = getTXT(NewEmployeeName);
        AssertTXT("Testik\n" +
                "xaxeci6575@abnovel.com", newUser);

//        waitUntil(String.valueOf(10000));

    }
}
