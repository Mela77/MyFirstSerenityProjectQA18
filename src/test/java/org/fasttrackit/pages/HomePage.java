package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(css = "a[title='Register']")
    private WebElementFacade registerLink;

    @FindBy(id = "search")
    private WebElementFacade searchBar;
    @FindBy(css = ".search-button")
    private WebElementFacade searchButton;

//
//    @FindBy(css = "a[title='Pearl Necklace']")
//    private WebElementFacade necklaceResult1;
//    @FindBy(css = "a[title='Silver Desert Necklace']")
//    private WebElementFacade necklaceResult2;
//    @FindBy(css = "a[title='Ludlow Sheath Dress']")
//    private WebElementFacade necklaceResult3;
//    @FindBy(css = "a[title='Racer Back Maxi Dress']")
//    private WebElementFacade necklaceResult4;



    public void clickAccount(){
        clickOn(accountLink);
    }
    public void clickLogin(){
        clickOn(loginLink);
    }
    public void clickRegister(){
        clickOn(registerLink);
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

}
