package xpath.and.methods;

public class Xpath {
    public static final String linkMyRoom ="https://adm.dev.goseechat.com/dashboard";
    public static final String FieldEmail = "//*[@placeholder='Email']";
    public static final String FieldPassword = "//*[@placeholder='Password']";
    public static final String ButtonSignIn = "//button[@id='kt_sign_in_submit']";
    public static final String ButtonApps = "//*[@class='menu-title' and contains(text(),'Apps')] ";
    public static final String ButtonUserManager = "//*[@class='menu-title' and contains(text(),'User Management')]";
    public static final String Employee = "//*[@class='menu-title' and contains(text(),'Employee')]";
    public static final String Employees = "//*[@class='menu-title' and contains(text(),'Employees')]";
    public static final String ButtonAddEmployee = "//button[@id='addEmployeeBtn']";
    public static final String FieldFullName = "//*[@placeholder='Full name']";
    public static final String FieldFullEmail = "//*[@placeholder='Email']";
    public static final String ButtonSaveChanges = "//button[@id='saveChanges']";
    public static final String FieldSearch = "//*[@placeholder='Search employee']";
    public static final String NewEmployeeName = "//td[@class='d-flex align-items-center']";
    public static final String NewEmployeeEmail = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/table/tbody/tr/td[1]/div/span";
    public static final String  ErromMsgWithEmail = "//div[@data-field='email']";
    public static final String  ErrorMsgWithPassword = " //div[@id='swal2-html-container']";
    public static final String NegativeBackDataFromFieldSearch = "//select[@name='users-table_length']";
//    public static final String NegativeBackDataFromFieldSearch = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/label/select/option[1]";



    //xpath from Taya

public static final String AdminNotificationButton = "/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div/div[4]/span/span[2]";
public static final String NotificationsButton = "/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div/div[4]/div/div/a/span[2]";
public static final String OpenNotificationForm = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[2]";
public static final String FieldNameNotification = "//*[@id=\"kt_modal_employee\"]/div/div/div[2]/div[1]/input";
public static final String FieldSlugNotification = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div[2]/input";
public static final String SaveNotificationButton = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[3]/button[2]";
public static final String SearchFieldNotification = "//*[@placeholder='Search employee']";
public static final String NewNotificationName = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]";
    //xpath from Alex
public static final String ButtonActions = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/table/tbody/tr/td[5]/a";
public static final String ButtonDismiss = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/table/tbody/tr/td[5]/div/div[3]/a";


}
