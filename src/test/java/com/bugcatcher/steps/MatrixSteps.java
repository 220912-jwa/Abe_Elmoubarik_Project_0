package com.bugcatcher.steps;


import com.bugcatcher.runner.BugCatcherRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class MatrixSteps {

    public WebDriver driver = BugCatcherRunner.driver;

    @When("The manager chooses to create a new matrix")
    public void the_manager_chooses_to_create_a_new_matrix() {
    }

    @When("The manager creates a title for the matrix")
    public void the_manager_creates_a_title_for_the_matrix() {
    }

    @When("The manager adds requirements to the matrix")
    public void the_manager_adds_requirements_to_the_matrix() {
    }

    @When("The manager saves the matrix")
    public void the_manager_saves_the_matrix() {
    }

    @Then("An alert with a success message should appear")
    public void an_alert_with_a_success_message_should_appear() {
    }

    @Given("The manager is on the matrix homepage")
    public void the_manager_is_on_the_matrix_homepage() {
    }

    @Given("The manager has selected the matrix")
    public void the_manager_has_selected_the_matrix() {
    }

    @When("The manager adds a defect")
    public void the_manager_adds_a_defect() {
    }

    @When("The manager adds a Test Cases")
    public void the_manager_adds_a_test_cases() {
    }

    @When("The manager confirms their changes")
    public void the_manager_confirms_their_changes() {
    }

    @Then("Then the matrix should saved")
    public void then_the_matrix_should_saved() {
    }
}
