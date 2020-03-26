package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class ProductDetailsPage extends PageObject {

    @FindBy (id = "swatch26")
    private WebElementFacade productColourIndigo;
    @FindBy (id="swatch79")
    private WebElementFacade productSizeM;
    @FindBy(id="swatch78")
    private WebElementFacade productSizeL;
    @FindBy(id="swatch77")
    private WebElementFacade productSizeXL;
    @FindBy(css = ".add-to-cart-buttons")
    private WebElementFacade addToCartButton;


    public void selectColour(){
        clickOn(productColourIndigo);
    }
    public void selectSizeM(){
        clickOn(productSizeM);
    }
    public void selectSizeL(){
        clickOn(productSizeL);
    }
    public void selectSizeXL(){
        clickOn(productSizeXL);
    }
    public void addToCart(){
        clickOn(addToCartButton);
    }



}
