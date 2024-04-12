package xpath.and.methods;

import Methdos.Methods;

import static xpath.and.methods.Xpath.*;

public class StaticVariable extends Methods {
    public static void RegistrarionMth() throws InterruptedException {
        SendKeys(FieldEmail,"administrator@goseechat.com");
        SendKeys(FieldPassword,"dL67y7h3ZP");
        ClickButton(ButtonSignIn);
        WaitLoadPage2S();
    }
}
