package aspiration.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import aspiration.pages.AspirationPage;

public class AspirationStepDefinition {

@Steps
AspirationPage aspirationPage;


@Given("user is on aspiration home page")
public void user_is_on_aspiration_home_page() {
	aspirationPage.verifyLandingPage();

}

@When("user clicks on Spend and Save link on home page")
public void user_clicks_on_Spend_and_Save_link_on_home_page(){
	aspirationPage.navigateToProducts();
}

@When("user can see aspiration products")
public void user_can_see_aspiration_products()  throws InterruptedException{
	aspirationPage.viewProducts();
}

@When("user clicks on get aspiration and can see sign up with email")
public void user_clicks_on_get_aspiration_and_can_see_sign_up_with_email()  throws InterruptedException{
	aspirationPage.getAspiration();
	aspirationPage.verifyGetStartedAspiration();
}

@When("user clicks on get aspiration plus and can see price plans")
public void user_clicks_on_get_aspiration_plus_and_can_see_price_plans() throws InterruptedException {
	aspirationPage.clickGetAspirationPlus();
}

@Then("^\"([^\"]*)\" as \"([^\"]*)\" and \"([^\"]*)\" as \"([^\"]*)\" price options are displayed$")
public void as_yearly_and_as_monthly_price_options_are_displayed(String plusplanprc,String plusplan,String regplanprc,String regplan) {
	aspirationPage.verifyGetStartedAspirationPlus(plusplanprc, plusplan,regplanprc,regplan);
}

}
