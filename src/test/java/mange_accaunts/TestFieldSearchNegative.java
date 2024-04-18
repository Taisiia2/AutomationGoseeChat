package mange_accaunts;

import Methdos.Methods;
import org.testng.annotations.Test;

import static xpath.and.methods.StaticVariable.RegistrarionMth;
import static xpath.and.methods.Xpath.*;

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
        AssertTXT("                                    10\n" +
                "                                    25\n" +
                "                                    50\n" +
                "                                    100\n" +
                "                                ", newUser);

//        waitUntil(String.valueOf(10000));

    }
}