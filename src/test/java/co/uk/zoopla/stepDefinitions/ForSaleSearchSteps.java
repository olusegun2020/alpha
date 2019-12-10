package co.uk.zoopla.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForSaleSearchSteps {
    WebDriver driver;
    WebElement searchfield;


    @Given("I navigate to Zoopla homepage")
    public void i_navigate_to_Zoopla_homepage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.zoopla.co.uk");
    }

    @When("i entered a Manchester into the search field")
    public void i_entered_a_Manchester_into_the_search_field() {

    }

    @When("i select {string} from minimum price dropdown")
    public void i_select_from_minimum_price_dropdown(String string) {

    }

    @When("I select {string} from maximum price dropdown")
    public void i_select_from_maximum_price_dropdown(String string) {
    }

    @When("I Select {string} from Property type Dropdown")
    public void i_Select_from_Property_type_Dropdown(String string) {

    }

    @When("I Selet {string} From Bedrooms From Dropdown")
    public void i_Selet_From_Bedrooms_From_Dropdown(String string) {

    }

    @When("I click on search Button")
    public void i_click_on_search_Button() {

    }

    @Then("a list of {string} in {string}are displayed")
    public void a_list_of_in_are_displayed(String string, String string2) {

    }

    @When("i entered a London into the search field")
    public void i_entered_a_London_into_the_search_field() {

    }

    @When("i entered a Coventry into the search field")
    public void i_entered_a_Coventry_into_the_search_field() {

    }

    @When("i entered a Birmingham into the search field")
    public void i_entered_a_Birmingham_into_the_search_field() {

    }

    @When("i entered a M{int} {int}xc into the search field")
    public void i_entered_a_M_xc_into_the_search_field(Integer int1, Integer int2) {

    }

    @Then("an error result page is displayed")
    public void an_error_result_page_is_displayed() {

    }

    @When("i entered a £££ into the search field")
    public void i_entered_a_£££_into_the_search_field() {

    }

    @When("i entered a {int} into the search field")
    public void i_entered_a_into_the_search_field(Integer int1) {

    }


    }
