package com.bugcatcher.steps;

import com.bugcatcher.runner.BugCatcherRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class TestCasesSteps {

    public WebDriver driver = BugCatcherRunner.driver;

    @Given("The tester is on the test case dashboard")
    public void the_tester_is_on_the_test_case_dashboard() {

    }

    @When("The tester types Description into input with")
    public void the_tester_types_description_into_input_with(String docString) {

    }

    @When("The tester types Steps into input with")
    public void the_tester_types_steps_into_input_with(String docString) {

    }

    @When("The tester presses the submit button")
    public void the_tester_presses_the_submit_button() {

    }

    @Then("The test case should appear at the bottom of the table")
    public void the_test_case_should_appear_at_the_bottom_of_the_table() {

    }

    @Then("The test case result should say UNEXECUTED")
    public void the_test_case_result_should_say_unexecuted() {
    }

    @When("The tester presses on details")
    public void the_tester_presses_on_details() {

    }

    @Then("A test case modal should appear showing the case ID")
    public void a_test_case_modal_should_appear_showing_the_case_id() {

    }

    @Then("The performed by field should say No One")
    public void the_performed_by_field_should_say_no_one() {

    }

    @When("The tester presses the close buttton")
    public void the_tester_presses_the_close_buttton() {

    }

    @Then("The Modal Should be closed")
    public void the_modal_should_be_closed() {

    }

    @When("The Tester clicks on edit within the modal")
    public void the_tester_clicks_on_edit_within_the_modal() {

    }

    @Then("The Tester should be on the case editor for that case")
    public void the_tester_should_be_on_the_case_editor_for_that_case() {

    }

    @When("The tester clicks on the edit button")
    public void the_tester_clicks_on_the_edit_button() {

    }

    @When("The tester types in {string} into the description text area")
    public void the_tester_types_in_into_the_description_text_area(String string) {

    }

    @When("The tester types in {string} into the steps text area")
    public void the_tester_types_in_into_the_steps_text_area(String string) {

    }

    @When("The tester clicks on the automated check mark")
    public void the_tester_clicks_on_the_automated_check_mark() {

    }

    @When("The tester selects {string} for performed from drop down")
    public void the_tester_selects_for_performed_from_drop_down(String string) {

    }

    @When("The tester selects {string} for test result from drop down")
    public void the_tester_selects_for_test_result_from_drop_down(String string) {

    }

    @When("The tester types in {string} into the summary text area")
    public void the_tester_types_in_into_the_summary_text_area(String string) {

    }

    @When("The tester clicks save on test case page")
    public void the_tester_clicks_save_on_test_case_page() {

    }

    @Then("A confirmation prompt should appear")
    public void a_confirmation_prompt_should_appear() {

    }

    @When("The tester clicks on Ok")
    public void the_tester_clicks_on_ok() {

    }

    @Then("An alert says the test case has been saved")
    public void an_alert_says_the_test_case_has_been_saved() {

    }

    @When("The tester clicks on the reset button")
    public void the_tester_clicks_on_the_reset_button() {

    }

    @Then("The fields should be populated to their old values")
    public void the_fields_should_be_populated_to_their_old_values() {

    }
}
