package com.bugcatcher.steps;

import com.bugcatcher.runner.BugCatcherRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DefectStatusSteps {

    public WebDriver driver = BugCatcherRunner.driver;

    @Given("The tester is on the Home Page")
    public void theTesterIsOnTheHomePage() {

        driver.navigate().to("https://bugcatcher-primer.coe.revaturelabs.com/?dev=84");
        WebElement loginBox = driver.findElement(By.xpath("/html/body/div/fieldset/input[1]"));
        loginBox.sendKeys("ryeGuy");
        WebElement passWordBox = driver.findElement(By.xpath("/html/body/div/fieldset/input[2]"));
        passWordBox.sendKeys("coolbeans");
        WebElement logInButton = driver.findElement(By.xpath("/html/body/div/fieldset/button"));
        logInButton.click();

    }

    @Then("The tester can can see only defects assigned to them")
    public void theTesterCanCanSeeOnlyDefectsAssignedToThem() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.titleIs("Tester Home"));
        WebElement defects = driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/div/span/p/b[1]"));
        defects.click();
        WebElement assignedTo = driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/div/div/div/p[5]"));
        String assignee = assignedTo.getText();
        String test = null;
        Assertions.assertNotEquals(test, assignee);
    }

    @When("The tester changes to defect to any status")
    public void theTesterChangesToDefectToAnyStatus() {

        WebElement changeStatusButton = driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/div/div/div/div[1]/span/button"));
        changeStatusButton.click();
        String compareStatus = driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/div/div/div/div[1]/div/div/button[1]")).getText();
        WebElement defectStatusButton = driver.findElement(By.xpath("//button['Change Status']"));
        defectStatusButton.click();
        String comparedString = driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/div/span/p/b[2]")).getText();
        Assertions.assertNotEquals(comparedString, compareStatus);

    }

    @Then("The tester should see the defect has a different status")
    public void theTesterShouldSeeTheDefectHasADifferentStatus() {

        System.out.println("Status changed");
    }
}

