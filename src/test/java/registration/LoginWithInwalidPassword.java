package registration;

import Methdos.Methods;
import org.testng.annotations.Test;

import java.io.IOException;

import static xpath.and.methods.LogFile.LogIntoFile;
import static xpath.and.methods.Xpath.*;

public class LoginWithInwalidPassword extends Methods {

    @Test(description = "Login Admin")
    public static void RegistrationTest() throws InterruptedException, IOException {
            SendKeys(FieldEmail,"administrator@goseechat.com");
            SendKeys(FieldPassword,"Test");
            ClickButton(ButtonSignIn);
            waitUntil(ErrorMsgWithPassword);
            String ErorMsgEmail = getTXT(ErrorMsgWithPassword);
            AssertTXT("These credentials do not match our records.1", ErorMsgEmail);
            LogIntoFile("Test case 777 pass");
    }
}
