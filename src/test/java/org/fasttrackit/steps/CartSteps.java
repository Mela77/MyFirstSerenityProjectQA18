package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class CartSteps  {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private ProductDetailsPage productDetailsPage;
    private CartPage cartPage;
    private SearchResultPage searchResultPage;

    @Step
    public void clickSearchBar(){
        myAccountPage.clickSearchBar();
    }
    @Step
    public void searchProduct(String product){
        myAccountPage.searchForProduct(product);
    }
    @Step
    public void clickSearch(){
        myAccountPage.clickSearchButton();
    }
    @Step
    public void chooseProduct(){
        searchResultPage.selectProduct();
    }
    @Step
    public void selectProduct(){
        productDetailsPage.selectColour();
        productDetailsPage.selectSizeM();
        productDetailsPage.addToCart();
    }

    @Step
    public void checkProductWasAddedToCart(String expected){
        String message = cartPage.getAddedToCartMessage();
        Assert.assertEquals(expected, message);
    }

}
