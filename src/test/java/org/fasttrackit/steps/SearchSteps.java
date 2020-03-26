package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchResultPage;
import org.junit.Assert;

public class SearchSteps {

    private HomePage homePage;
    private SearchResultPage searchResultPage;

    @Step
    public void navigateToSearchBar(){
        homePage.open();
        homePage.clickSearchBar();
    }
    @Step
    public void searchProduct(String product){
        homePage.searchForProduct(product);
    }
    @Step
    public void clickSearch(){
        homePage.clickSearchButton();
    }
    @Step
    public void checkSearchResults(String expected){
        String message = searchResultPage.getSearchResultTitlePage();
        Assert.assertEquals(expected, message);
    }
}
