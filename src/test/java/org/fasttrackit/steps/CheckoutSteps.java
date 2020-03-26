package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class CheckoutSteps {

    private MyAccountPage myAccountPage;
    private CheckoutPage checkoutPage;

    @Step
    public void clickCartButton(){
        myAccountPage.clickCartButton();
    }
    @Step
    public void clickCheckoutButton(){
        myAccountPage.clickCheckoutButton();
    }
    @Step
    public void billingInfo(String firstName, String lastName, String address, String city, String zipCode, String telephone) {
        checkoutPage.selectNewAddressDropdown();
        checkoutPage.setFirstNameField(firstName);
        checkoutPage.setLastNameField(lastName);
        checkoutPage.setAddressField(address);
        checkoutPage.setCityField(city);
        checkoutPage.selectCountryDropdownValues();
        checkoutPage.selectStateDropdownValues();
        checkoutPage.setZipField(zipCode);
        checkoutPage.setTelephoneField(telephone);
        checkoutPage.shipTo();
        checkoutPage.nextStep();
    }
    @Step
    public void shippingInfo(){
        checkoutPage.typeOfShipping();
        checkoutPage.nextStep2();
    }
    @Step
    public void paymentInfo(){
        checkoutPage.nextStep3();
    }
    @Step
    public void orderReview(){
        checkoutPage.placeOrder();
    }
    @Step
    public void checkOrderReceived(String expected){
        String message = checkoutPage.getOrderReceivedConf() ;
        Assert.assertEquals(expected, message);
    }

}
