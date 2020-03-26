package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchResultPage extends PageObject {

    @FindBy (css = "products-grid products-grid--max-3-col first last odd")
    private WebElementFacade searchForNecklaceResults;



    @FindBy(css = ".page-title")
    private WebElementFacade searchResultTitlePage;

    @FindBy(id="product-collection-image-413")
    private WebElementFacade productForCart;



    public String getSearchResultTitlePage(){
        return searchResultTitlePage.getText();
    }
    public void selectProduct(){
        clickOn(productForCart);
    }






}
