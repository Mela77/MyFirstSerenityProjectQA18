package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/onepage/")
public class CheckoutPage extends PageObject {



    @FindBy(id = "billing-address-select")
    private WebElementFacade newAddressDropdown;

    @FindBy(id="billing:firstname")
    private WebElementFacade firstNameField;
    @FindBy(id="billing:lastname")
    private WebElementFacade lastNameField;
    @FindBy(id="billing:street1")
    private WebElementFacade addressField;
    @FindBy(id="billing:city")
    private WebElementFacade cityField;
    @FindBy(id="billing:region_id")
    private WebElementFacade stateFieldDropdown;
    @FindBy(id="billing:postcode")
    private WebElementFacade zipField;
    @FindBy(id="billing:country_id")
    private WebElementFacade countryFieldDropdown;
    @FindBy(id="billing:telephone")
    private WebElementFacade telephoneField;
    @FindBy(id="billing:use_for_shipping_yes")
    private WebElementFacade shipToRadioButton;
    @FindBy(css =".buttons-set [onclick='billing.save()']")
    private WebElementFacade continueButton;
    @FindBy(id="s_method_freeshipping_freeshipping")
    private WebElementFacade freeShippingRadioButton;
    @FindBy(css = ".buttons-set [onclick='shippingMethod.save()']")
    private WebElementFacade continueButton2;
    @FindBy(css = ".buttons-set [onclick='payment.save()']")
    private WebElementFacade continueButton3;
    @FindBy(css = ".buttons-set [onclick='review.save();']")
    private WebElementFacade placeOrderButton;
    @FindBy(css = ".sub-title")
    private WebElementFacade orderReceivedMessage;



    public void selectNewAddressDropdown() {
        clickOn(newAddressDropdown);
        newAddressDropdown.selectByVisibleText("New Address");
    }

    public void setFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }
    public void setLastNameField(String lastName){
        typeInto(lastNameField, lastName);
    }
    public void setAddressField(String address){
        typeInto(addressField, address);
    }
    public void setCityField(String city){
        typeInto(cityField, city);
    }
    public void selectStateDropdownValues(){
        clickOn(stateFieldDropdown);
        stateFieldDropdown.selectByVisibleText("Cluj");
        assertThat(stateFieldDropdown.getSelectedVisibleTextValue(), is("Cluj"));
    }
    public void setZipField(String zip){
        typeInto(zipField, zip);
    }
    public void selectCountryDropdownValues(){
        clickOn(countryFieldDropdown);
        countryFieldDropdown.selectByVisibleText("România");
        clickOn(countryFieldDropdown);
    }
    public void setTelephoneField(String telephone){
        typeInto(telephoneField, telephone);
    }
    public void shipTo(){
        clickOn(shipToRadioButton);
    }
    public void nextStep(){
        waitFor(continueButton);
        clickOn(continueButton);
    }
    public void typeOfShipping(){
        waitFor(freeShippingRadioButton);
        clickOn(freeShippingRadioButton);
    }
    public void nextStep2(){
        waitFor(continueButton2);
        clickOn(continueButton2);
    }
    public void nextStep3(){
        waitFor(continueButton3);
        clickOn(continueButton3);
    }
    public void placeOrder(){
        waitFor(placeOrderButton);
        clickOn(placeOrderButton);
    }
    public String getOrderReceivedConf(){
        waitFor(orderReceivedMessage);
        return orderReceivedMessage.getText();
    }
}
