package com.bugcatcher.steps;

import com.bugcatcher.runner.BugCatcherRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NegativeLoginSteps {

    public WebDriver driver = BugCatcherRunner.driver;

    @When("The employee types in g8tor into the username input")
    public void the_employee_types_in_g8tor_into_the_username_input() {

        driver.findElement(By.xpath("//*[@id=\"root\"]/fieldset/input[1]")).sendKeys("g8tor");

    }

    @When("The employee types in chomp!! into the password input")
    public void the_employee_types_in_chomp_into_the_password_input() {

        driver.findElement(By.xpath("//*[@id=\"root\"]/fieldset/input[2]")).sendKeys("chomp!!");

    }

    @Then("The employee should see an alert saying they have the wrong password")
    public void the_employee_should_see_an_alert_saying_they_have_the_wrong_password() {

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .ignoring(NoAlertPresentException.class)
                .until(ExpectedConditions.alertIsPresent());

        String alertPassword = driver.switchTo().alert().getText();
        assertEquals("Wrong password for User", alertPassword);
        driver.switchTo().alert().accept();

    }

    @When("The employee types in sicEmDawgs into the username input")
    public void the_employee_types_in_sic_em_dawgs_into_the_username_input() {

        driver.findElement(By.xpath("//*[@id=\"root\"]/fieldset/input[1]")).sendKeys("sicEmDawgs");

    }

    @When("The employee types in natchamps into the password input")
    public void the_employee_types_in_natchamps_into_the_password_input() {

        driver.findElement(By.xpath("//*[@id=\"root\"]/fieldset/input[2]")).sendKeys("natchamps");

    }

    @Then("The employee should see an alert saying no user with that username found")
    public void the_employee_should_see_an_alert_saying_no_user_with_that_username_found() {

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .ignoring(NoAlertPresentException.class)
                .until(ExpectedConditions.alertIsPresent());

        String alertUser = driver.switchTo().alert().getText();
        assertEquals("Username not found", alertUser);
        driver.switchTo().alert().accept();


    }

}