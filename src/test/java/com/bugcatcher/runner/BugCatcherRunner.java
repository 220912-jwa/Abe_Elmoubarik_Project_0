package com.bugcatcher.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/bugcatcher/features", glue = "com.bugcatcher.steps")

public class BugCatcherRunner {

    // We will need an instance of our WebDriver
    public static WebDriver driver;
    // and if we're using a Page Object Model - we'll need that as well

    // and then we'll need a way to set it up and configure it before running our tests
    @BeforeClass // this is JUnit 4 (JUnit 5 equivalent is @BeforeAll)
    public static void setup() {

        // we instantiate our driver
        // 1. Set a system property to tell the driver Object where to locate the browserdriver we downloaded from the internet
        // Create a File Object
        File chrome = new File("src/test/resources/chromedriver.exe");

        // Set the system property
        System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());

        // instantiate driver and POM
        driver = new ChromeDriver(); // or FirefoxDriver or OperaDriver
    }

    @AfterClass
    public static void teardown() {

        // clean up our resources
        // driver.quit();
    }
}
