package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/create/")
public class RegisterPage extends PageObject {

    @FindBy(id = "firstname")
    private WebElementFacade firstNameField;
    @FindBy(id = "lastname")
    private WebElementFacade lastNameField;
    @FindBy(id = "email_address")
    private WebElementFacade emailAddressField;
    @FindBy(id = "password")
    private WebElementFacade passwordField;
    @FindBy(id = "confirmation")
    private WebElementFacade confirmPasswordField;
    @FindBy(css = "button[title='Register']")
    private WebElementFacade registerButton;


    public void setFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }
    public void setLastNameField(String lastName){
        typeInto(lastNameField, lastName);
    }
    public void setEmailAddressField(String emailAddress){
        typeInto(emailAddressField,emailAddress);
    }
    public void setPasswordField(String password){
        typeInto(passwordField, password);
    }
    public void setConfirmPasswordField(String password){
        typeInto(confirmPasswordField,password);
    }
    public void clickRegister(){
        clickOn(registerButton);
    }

}
