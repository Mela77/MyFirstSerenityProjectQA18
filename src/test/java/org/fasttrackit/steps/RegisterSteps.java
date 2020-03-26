package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.pages.RegisterPage;
import org.junit.Assert;

public class RegisterSteps {

    private HomePage homePage;
    private RegisterPage registerPage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToRegisterPage(){
        homePage.open();
        homePage.clickAccount();
        homePage.clickRegister();
    }
    @Step
    public void setDetails(String firstName, String lastName, String emailAddress, String password){
        registerPage.setFirstNameField(firstName);
        registerPage.setLastNameField(lastName);
        registerPage.setEmailAddressField(emailAddress);
        registerPage.setPasswordField(password);
        registerPage.setConfirmPasswordField(password);
    }
    @Step
    public void clickRegister(){
        registerPage.clickRegister();
    }

    @Step
    public void checkRegistered(String expected){
        String message = myAccountPage.getThanksForRegisterMessage() ;
        Assert.assertEquals(expected, message);
    }
}
