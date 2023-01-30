package com.demo.serenity.is.testing.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class AutomationTestingPages extends PageObject {

    public static final Target BTN_REGISTER = Target.the("REGISTER").located(By.xpath("//a[@class='text-decoration-none']"));
    public static final Target REGISTER_ACCOUNT = Target.the("Formato Registro").located(By.xpath("//h2[@class='text-center p-4']"));
    public static final Target INP_FULLNAME = Target.the("Ingresar NombreUsuario").located(By.xpath("//input[@id='SignUpPanel0_DisplayName']"));
    public static final Target INP_EMAIL = Target.the("Ingresar Email").located(By.xpath("//input[@id='SignUpPanel0_Email']"));
    public static final Target CONFIRM_EMAIL1 = Target.the("Confirmar Email").located(By.xpath("//input[@id='SignUpPanel0_ConfirmEmail']"));
    public static final Target INP_PASSW = Target.the("Ingresar Password").located(By.xpath("//input[@id='SignUpPanel0_Password']"));
    public static final Target CONFIRM_PASSW = Target.the("Confirmar Password").located(By.xpath("//input[@id='SignUpPanel0_ConfirmPassword']"));
    public static final Target BTN_INGRESAR = Target.the("Boton Ingresar").located(By.xpath("//button[@id='SignUpPanel0_SubmitButton']"));
    public static final Target USERNAME = Target.the("Usuario Login").located(By.xpath("//input[@placeholder='admin']"));
    public static final Target CLICK_OK = Target.the("Aceptar").located(By.xpath("//button[@class='btn btn-info']"));
    public static final Target VALID_ACTIVATE = Target.the("Validar_Cuenta").located(By.xpath("//div[@class='alert alert-info alert-dismissible']"));
    public static final Target LOGIN_PASSWORD = Target.the("Nombre Login").located(By.xpath("//input[@placeholder='serenity']"));
    public static final Target CLICK_SIGN_IN = Target.the("Aceptar").located(By.xpath("//button[@id='LoginPanel0_LoginButton']"));
    public static final Target VALID_USER = Target.the("Validar_Cuenta").located(By.xpath("(//p[@class='s-user-info fs-6 mb-1'])[1]"));
    public static final Target CLICK_USER = Target.the("Usuario").located(By.xpath("//i[@class='s-sidebar-band-icon fa fa-user']"));


}
