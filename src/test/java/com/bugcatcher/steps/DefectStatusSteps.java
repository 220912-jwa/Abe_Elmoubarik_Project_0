package com.bugcatcher.steps;

import com.bugcatcher.runner.BugCatcherRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DefectStatusSteps {

    public WebDriver driver = BugCatcherRunner.driver;

    @Given("The tester is on the Home Page")
    public void theTesterIsOnTheHomePage() {

        driver.navigate().to("https://bugcatcher-primer.coe.revaturelabs.com/?dev=84");
        driver.findElement(By.xpath("/html/body/div/fieldset/input[1]")).sendKeys("ryeGuy");
        driver.findElement(By.xpath("/html/body/div/fieldset/input[2]")).sendKeys("coolbeans");
        driver.findElement(By.xpath("/html/body/div/fieldset/button")).click();

    }

    @Then("The tester can can see only defects assigned to them")
    public void theTesterCanCanSeeOnlyDefectsAssignedToThem() {

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/h3[1]")).isDisplayed());
    }

    @When("The tester changes to defect to any status")
    public void theTesterChangesToDefectToAnyStatus() {

        driver.findElement(By.xpath("//*[@id=\"collapsible-trigger-1665035639806\"]/p")).click();
        driver.findElement(By.xpath("//*[@id=\"collapsible-trigger-1665035639806\"]/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/div/div/div/div[1]/div/div/button[1]")).click();
    }

    @Then("The tester should see the defect has a different status")
    public void theTesterShouldSeeTheDefectHasADifferentStatus() {

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"collapsible-trigger-1665035639806\"]/p/b[2]")).isDisplayed());
    }
}
