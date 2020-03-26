package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/index/")
public class MyAccountPage extends PageObject {

    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeMessageParagraph;
    @FindBy(css = ".success-msg")
    private WebElementFacade thanksForRegisterMessage;

    @FindBy(id = "search")
    private WebElementFacade searchBar;
    @FindBy(css = ".search-button")
    private WebElementFacade searchButton;

    @FindBy(css = ".skip-cart")
    private WebElementFacade cartButton;
    @FindBy(css = ".checkout-button")
    private WebElementFacade checkoutButton;




    public String getWelcomeMessage(){
        return welcomeMessageParagraph.getText();
    }
    public String getThanksForRegisterMessage(){
        return thanksForRegisterMessage.getText();
    }

    public void clickSearchBar(){
        clickOn(searchBar);
    }
    public void searchForProduct(String product){
        typeInto(searchBar, product);
    }
    public void clickSearchButton(){
        clickOn(searchButton);
    }

    public void clickCartButton(){
        clickOn(cartButton);
    }
    public void clickCheckoutButton(){
        clickOn(checkoutButton);
    }


}
