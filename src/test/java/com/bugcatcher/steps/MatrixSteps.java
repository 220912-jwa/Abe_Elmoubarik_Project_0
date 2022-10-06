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

public class MatrixSteps {

    public WebDriver driver = BugCatcherRunner.driver;

    @When("The manager chooses to create a new matrix")
    public void the_manager_chooses_to_create_a_new_matrix() {

        driver.findElement(By.xpath("//*[@id=\"root\"]/button")).click();
    }

    @When("The manager creates a title for the matrix")
    public void the_manager_creates_a_title_for_the_matrix() {

        driver.findElement(By.xpath("//*[@id=\"root\"]/input")).sendKeys("Title1");
    }

    @When("The manager adds requirements to the matrix")
    public void the_manager_adds_requirements_to_the_matrix() {

        driver.findElement(By.xpath("//*[@id=\"root\"]/fieldset/table/tbody/tr/td[1]/input")).sendKeys("Story1");
        driver.findElement(By.xpath("//*[@id=\"root\"]/fieldset/table/tbody/tr/td[3]/input")).sendKeys("Note1");
        driver.findElement(By.xpath("//*[@id=\"root\"]/fieldset/button")).click();
    }

    @When("The manager saves the matrix")
    public void the_manager_saves_the_matrix() {

        driver.findElement(By.xpath("//*[@id=\"root\"]/button")).click();
    }

    @Then("An alert with a success message should appear")
    public void an_alert_with_a_success_message_should_appear() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    @Given("The manager is on the matrix homepage")
    public void the_manager_is_on_the_matrix_homepage() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/h1")).click();
    }

    @Given("The manager has selected the matrix")
    public void the_manager_has_selected_the_matrix() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.findElement(By.xpath("//*[@id=\"root\"]/nav/a[1]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/ul/li[1]/div/span/button")));
        driver.findElement(By.xpath("/html/body/div/ul/li[1]/div/span/button")).click();
    }

    @When("The manager adds a defect")
    public void the_manager_adds_a_defect() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        driver.findElement(By.xpath("//*[@id=\"root\"]/nav/a[1]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div/ul/li[1]/div/span/button")));
        driver.findElement(By.xpath("/html/body/div/ul/li[1]/div/span/button")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div/ul/li[1]/div/div/div/table/tbody/tr[1]/td[6]/button")));
        driver.findElement(By.xpath("/html/body/div/ul/li[1]/div/div/div/table/tbody/tr[1]/td[6]/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.xpath("//input[@list='defectlist']")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div/ul/li[1]/div/div/div/ul[2]/li[3]/button")).click();

    }

    @When("The manager adds a Test Cases")
    public void the_manager_adds_a_test_cases() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.xpath("//*[@id=\"root\"]/nav/a[1]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div/ul/li[1]/div/span/button")));
        driver.findElement(By.xpath("/html/body/div/ul/li[1]/div/span/button")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div/ul/li[1]/div/div/div/table/tbody/tr[1]/td[6]/button")));
        driver.findElement(By.xpath("/html/body/div/ul/li[1]/div/div/div/table/tbody/tr[1]/td[6]/button")).click();
        driver.findElement(By.xpath("//input[@list='testlist']")).sendKeys("2");
        driver.findElement(By.xpath("/html/body/div/ul/li[1]/div/div/div/ul[1]/li[2]/button")).click();


    }

    @When("The manager confirms their changes")
    public void the_manager_confirms_their_changes() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.findElement(By.xpath("/html/body/div/ul/li[1]/div/div/div/button")).click();
    }

    @Then("Then the matrix should saved")
    public void then_the_matrix_should_saved() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

}