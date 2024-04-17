package registration;

import Methdos.Methods;
import org.testng.annotations.Test;

import static xpath.and.methods.Xpath.*;
import static xpath.and.methods.Xpath.linkMyRoom;

public class LoginWithInwalidEmail extends Methods {

    @Test(description = "Login Admin")
    public static void RegistrationTest() throws InterruptedException{
        SendKeys(FieldEmail,"administratorgoseechat.com");
        SendKeys(FieldPassword,"dL67y7h3ZP");
        ClickButton(ButtonSignIn);
        String ErorMsgEmail = getTXT(ErromMsgWithEmail);
        AssertTXT("The value is not a valid email address", ErorMsgEmail);
    }
}