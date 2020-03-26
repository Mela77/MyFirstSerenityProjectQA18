package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void testValidRegister(){
        registerSteps.navigateToRegisterPage();
        registerSteps.setDetails("Ion", "Popescu", "ionpopescu12@mailinator.com","123456");
        registerSteps.clickRegister();
        registerSteps.checkRegistered("Thank you for registering with Madison Island.");
    }
}
