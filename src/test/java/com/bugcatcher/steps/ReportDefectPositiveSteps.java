package com.bugcatcher.steps;

import com.bugcatcher.runner.BugCatcherRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ReportDefectPositiveSteps {

    public WebDriver driver = BugCatcherRunner.driver;


    @Given("The employee is on the Defect Reporter Page")
    public void the_employee_is_on_the_defect_reporter_page() {
    }

    @When("The employee selects todays date")
    public void the_employee_selects_todays_date() {
    }

    @When("The employee types in Description with")
    public void the_employee_types_in_description_with(String docString) {
    }

    @When("The employee types in Steps with")
    public void the_employee_types_in_steps_with(String docString) {
    }

    @When("The employee selects {string} priority")
    public void the_employee_selects_priority(String string) {
    }

    @When("The employee selects {string} severity")
    public void the_employee_selects_severity(String string) {
    }

    @When("The employee clicks the report button")
    public void the_employee_clicks_the_report_button() {
    }

    @Then("There should be a confirmation box")
    public void there_should_be_a_confirmation_box() {
    }

    @When("The employee clicks Ok")
    public void the_employee_clicks_ok() {
    }

    @Then("A modal should appear with a Defect ID")
    public void a_modal_should_appear_with_a_defect_id() {
    }

    @When("The employee clicks close")
    public void the_employee_clicks_close() {
    }

    @Then("The modal should disappear")
    public void the_modal_should_disappear() {
    }

}
