package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.steps.CheckoutSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private CheckoutSteps checkoutSteps;



    @Test
    public void checkoutCart(){
        loginSteps.login(Constants.USER_EMAIL, Constants.USER_PASSWORD, "Hello, Mela Pandrea!");
        checkoutSteps.clickCartButton();
        checkoutSteps.clickCheckoutButton();
        checkoutSteps.billingInfo("Ana","Pop","abcd 1","Cluj-Napoca", "400000","1234567890");
        checkoutSteps.shippingInfo();
        checkoutSteps.paymentInfo();
        checkoutSteps.orderReview();
        checkoutSteps.checkOrderReceived("THANK YOU FOR YOUR PURCHASE!");

    }
}
