package com.bugcatcher.steps;

import com.bugcatcher.runner.BugCatcherRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ReportDefectNegativeSteps {

    public WebDriver driver = BugCatcherRunner.driver;

    @When("The employee types in description with")
    public void the_employee_types_in_description_with(String docString) {

    }

    @When("The employee types in steps with")
    public void the_employee_types_in_steps_with(String docString) {

    }

    @When("The employee selects high priority")
    public void the_employee_selects_high_priority() {

    }

    @When("The employee selects low severity")
    public void the_employee_selects_low_severity() {

    }

    @Then("No confirmation dialog appears")
    public void no_confirmation_dialog_appears() {

    }
}
