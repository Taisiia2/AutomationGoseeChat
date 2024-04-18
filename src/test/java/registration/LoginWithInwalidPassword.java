package registration;

import Methdos.Methods;
import org.testng.annotations.Test;
import xpath.and.methods.LoggingsInfo;

import java.io.IOException;

import static xpath.and.methods.LogFile.LogIntoFile;
import static xpath.and.methods.Xpath.*;

public class LoginWithInwalidPassword extends Methods {
    private static String Msg = "These credentials do not match our records.";
    private static String Pass = "Test case 777 Pass";
    private static String Fail = "Test case 777 Fail";
    private static boolean RESULT;

    @Test(description = "Login Admin")
    public static void RegistrationTest() throws InterruptedException, IOException {
            SendKeys(FieldEmail,"administrator@goseechat.com");
            SendKeys(FieldPassword,"Test");
            ClickButton(ButtonSignIn);
            waitUntil(ErrorMsgWithPassword);
            String ErorMsgEmail = getTXT(ErrorMsgWithPassword);
            RESULT = AssertTXTBool(Msg, ErorMsgEmail);
            LogIntoFile(Pass,Fail,RESULT);
            AssertTXT(Msg, ErorMsgEmail);

    }
}
