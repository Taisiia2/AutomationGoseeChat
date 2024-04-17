package registration;

import Methdos.Methods;
import org.testng.annotations.Test;

import static xpath.and.methods.Xpath.*;
import static xpath.and.methods.Xpath.ErromMsgWithEmail;

public class LoginWithInwalidPassword extends Methods {

    @Test(description = "Login Admin")
    public static void RegistrationTest() throws InterruptedException{
        SendKeys(FieldEmail,"administrator@goseechat.com");
        SendKeys(FieldPassword,"Test");
        ClickButton(ButtonSignIn);
        waitUntil(ErrorMsgWithPassword);
        String ErorMsgEmail = getTXT(ErrorMsgWithPassword);
        AssertTXT("These credentials do not match our records.", ErorMsgEmail);

    }
}
