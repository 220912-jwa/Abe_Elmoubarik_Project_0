package com.bugcatcher.steps;

import com.bugcatcher.runner.BugCatcherRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssignDefectSteps {

    public WebDriver driver = BugCatcherRunner.driver;

    @Given("The manager is logged in as a manager")
    public void the_manager_is_logged_in_as_a_manager() throws InterruptedException {

        driver.navigate().to("https://bugcatcher-primer.coe.revaturelabs.com/?dev=84");
        driver.findElement(By.name("username")).sendKeys("g8tor");
        driver.findElement(By.name("pass")).sendKeys("chomp!");
        driver.findElement(By.tagName("BUTTON")).click();
        Thread.sleep(2000);
    }

    @Given("The manager is on the home page")
    public void the_manager_is_on_the_home_page() {

        String actualUrl = "https://bugcatcher-primer.coe.revaturelabs.com/managerhome";
        String expectedUrl = driver.getCurrentUrl();
    }

    @Then("The manager should see pending defects")
    public void theManagerShouldSeePendingDefects() {

        //checking text from Web element
        WebElement Defects = driver.findElement(By.xpath("/html/body/div/h3"));
        String assignDefects = Defects.getText();
        Assertions.assertEquals("Assign Defects", assignDefects);
    }

    @When("The manager clicks on the select button for a defect")
    public void theManagerClicksOnTheSelectButtonForADefect() {

        //Finding select button and clicking on it
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[3]/button")).click();
    }

    @Then("The defect description should appear in bold")
    public void theDefectDescriptionShouldAppearInBold() {

        //checking if there is an element for the description
        WebElement bugTitle = driver.findElement(By.xpath("/html/body/div/div/h4"));
    }

    @When("The manager selects a tester from the drop down list")
    public void theManagerSelectsATesterFromTheDropDownList() {

        WebElement dropDown = driver.findElement(By.xpath("/html/body/div/div/input"));
        String value = dropDown.getAttribute("value");
        dropDown.sendKeys("ryeGuy");
    }

    @When("The manager clicks assign")
    public void theManagerClicksAssign() {

        // clicking the assign button
        driver.findElement(By.xpath("/html/body/div/div/button")).click();
    }

    @Then("The defect should disappear from the list")
    public void theDefectShouldDisappearFromTheList() {

    }
}
