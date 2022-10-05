package com.bugcatcher.steps;

import com.bugcatcher.runner.BugCatcherRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class PositiveLoginSteps {

    public WebDriver driver = BugCatcherRunner.driver;

    @Given("The employee is on the login page")
    public void the_employee_is_on_the_login_page() {

        driver.get("https://bugcatcher-primer.coe.revaturelabs.com/?dev=84");

    }

    @When("The employee types {string} into username input")
    public void the_employee_types_into_username_input(String string) {

        driver.findElement(By.xpath("//*[@id=\"root\"]/fieldset/input[1]")).sendKeys(string);

    }

    @When("The employee types {string} into password input")
    public void the_employee_types_into_password_input(String string) {

        driver.findElement(By.xpath("//*[@id=\"root\"]/fieldset/input[2]")).sendKeys(string);

    }

    @When("The employee clicks on the login button")
    public void the_employee_clicks_on_the_login_button() {

        driver.findElement(By.xpath("//*[@id=\"root\"]/fieldset/button")).click();


    }

    @Then("the employee should be on the {string} page")
    public void the_employee_should_be_on_the_page(String string) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.not(ExpectedConditions.titleIs("Login")));
        assertEquals(string + " Home", driver.getTitle());

    }

    @Then("The employee should see their name {string} {string} on the home page")
    public void the_employee_should_see_their_name_on_the_home_page(String string, String string2) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions
                .not(ExpectedConditions.titleIs("Login")));
        String name = driver.findElement((By.xpath("//*[@id=\"root\"]/nav/p"))).getText();
        assertEquals("Welcome " + string + " " + string2, name);

    }
}
