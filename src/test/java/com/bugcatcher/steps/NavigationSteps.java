package com.bugcatcher.steps;

import com.bugcatcher.runner.BugCatcherRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationSteps {

    public WebDriver driver = BugCatcherRunner.driver;

    @Then("The manager should see links for Matrices, Test Cases, Defect Reporting and Defect Overview")
    public void the_manager_should_see_links_for_matrices_test_cases_defect_reporting_and_defect_overview() {
        // Write code here that turns the phrase above into concrete actions
        String Matrices = driver.findElement(By.xpath("//*[@id=\"root\"]/nav/a[1]")).getText();
        String TestCases = driver.findElement(By.xpath("//*[@id=\"root\"]/nav/a[2]")).getText();
        String DefectReporting = driver.findElement(By.xpath("//*[@id=\"root\"]/nav/a[3]")).getText();
        String DefectOverview = driver.findElement(By.xpath("//*[@id=\"root\"]/nav/a[4]")).getText();
        Assertions.assertEquals("Matrices", Matrices);
        Assertions.assertEquals("Test Cases", TestCases);
        Assertions.assertEquals("Defect Reporting", DefectReporting);
        Assertions.assertEquals("Defect Overview", DefectOverview);


    }

    @When("The manager clicks on Matrices")
    public void the_manager_clicks_on_matrices() {

        driver.findElement(By.xpath("//*[@id=\"root\"]/nav/a[1]")).click();
    }

    @Then("The title of the page should be Matrix Page")
    public void the_title_of_the_page_should_be_matrix_page() {

        Assertions.assertEquals("Matrix Page", driver.getTitle());
    }

    @When("The manager clicks the browser back button")
    public void the_manager_clicks_the_browser_back_button() {

        driver.navigate().back();
    }

    @Then("The manager should be on the home page and the title of page is Home")
    public void the_manager_should_be_on_the_home_page_and_the_title_of_page_is_home() {

        Assertions.assertEquals("Home", driver.getTitle());
    }

    @When("The manager clicks on Test Cases")
    public void the_manager_clicks_on_test_cases() {

        driver.findElement(By.xpath("//*[@id=\"root\"]/nav/a[2]")).click();

    }

    @When("The manager clicks on {string}")
    public void the_manager_clicks_on(String string) {

    }

    @Then("The title of page should be {string}")
    public void the_title_of_page_should_be(String string) {

    }
}