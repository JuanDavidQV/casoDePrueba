package useriterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://demos.devexpress.com/rwa/dxhotels/")
public class PaginaPrincipalPage extends PageObject {

    public static Target BTN_LOGIN = Target.the("logueo").locatedBy("//div[@id='HeaderControl_Login_CD']");
    public static Target INPUT_CORREO = Target.the("Escribir correo").locatedBy("//input[@id='HeaderControl_LogonControl_LoginFormLayout_txtEmail_I']");
    public static Target INPUT_CLAVE= Target.the("Escribir clave").locatedBy("//td[@id='HeaderControl_LogonControl_LoginFormLayout_1']");
    public static Target BTN_CANCEL = Target.the("logueo").locatedBy("//div[@id='HeaderControl_LogonControl_btnCancelLogin']");

    public static Target INPUT_LOCATION = Target.the("Escribir lugar").locatedBy("//input[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_LocationComboBox_I']");
    public static Target BTN_LISTA = Target.the("lista").locatedBy("//td[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_LocationComboBox_B-1']");
    public static Target BTN_PAIS = Target.the("pais").locatedBy("//td[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_LocationComboBox_DDD_L_LBI2T1']");

    public static Target BTN_CHECKIN = Target.the("boton check in").locatedBy("//img[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_CheckInDateEdit_B-1Img']");
    public static Target BTN_CHECKINDIA = Target.the("boton check in dia").locatedBy("//td[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_CheckInDateEdit_DDD_C_mc_0x0_32']");
    public static Target BTN_CHECKOUT = Target.the("boton check out").locatedBy("//img[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_CheckOutDateEdit_B-1Img']");
    public static Target BTN_CHECKOUTDIA = Target.the("boton check out dia").locatedBy("//td[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_CheckOutDateEdit_DDD_C_mc_0x0_36']");
    public static Target BTN_ROOM = Target.the("boton habitaciones").locatedBy("//img[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_RoomsComboBox_B-1Img']");
    public static Target BTN_ROOMCANT = Target.the("boton cantidad habitaciones").locatedBy("//td[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_RoomsComboBox_DDD_L_LBI1T0']");
    public static Target BTN_ADULT = Target.the("boton cantidad adultos").locatedBy("//td[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_AdultsSpinEdit_B-4']");
    public static Target BTN_CHILDREN = Target.the("boton cantidad niños").locatedBy("//td[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_ChildrenSpinEdit_B-4']");
    public static Target BTN_SEARCH = Target.the("boton buscar").locatedBy("//div[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_SearchButton_CD']");
}
