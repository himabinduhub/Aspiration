package swapi.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import swapi.pages.SwapiPage;

public class SwapiStepDefinitions {
	
@Steps
SwapiPage swapiPage;


@Given("swapi home page is launched")
public void swapi_home_page_is_launched() {
	swapiPage.apiUrl();
}

@When("^Enter \"([^\"]*)\" endpoint and request response$")
public void enter_endpoint_and_request_response(String url) {
	swapiPage.subUrl(url);
	swapiPage.request();
}

@When("Response received")
public void response_received() {
	swapiPage.response();
}

@When("^Total number of people are \"([^\"]*)\" where height is greater than \"([^\"]*)\"$")
public void total_number_of_people_are_where_height_is_greater_than(Integer people, Integer height) {
	swapiPage.totalPeople(people, height);
}

@When("^Total \"([^\"]*)\" individuals are returned$")
public void total_individuals_are_returned(Integer peoplecnt) {
	swapiPage.totalPeopleNames(peoplecnt);
}

@Then("^Total number of people checked are \"([^\"]*)\"$")
public void total_number_of_people_checked_are(Integer checked) {
	swapiPage.totalPeopleChecked(checked);
}

}
