package org.fasttrackit.features;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

public class CartTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CartSteps cartSteps;

    @Test
    public void addToCart() {
        loginSteps.login(Constants.USER_EMAIL, Constants.USER_PASSWORD, "Hello, Mela Pandrea!");
        cartSteps.clickSearchBar();
        cartSteps.searchProduct("shirt");
        cartSteps.clickSearch();
        cartSteps.chooseProduct();
        cartSteps.selectProduct();
        cartSteps.checkProductWasAddedToCart("Core Striped Sport Shirt was added to your shopping cart.");

    }
}
