package com.test.channelplay.stepDefinition;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.test.channelplay.utils.DriverBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Hooks extends DriverBase {

//    private static final Logger logger = LoggerFactory.getLogger(Hooks.class);
    private WebDriver driver;
    private DriverBase driverBase;

    static ExtentReports report;
    static ExtentTest test;

    public static Logger logger;

    @Before
    public void driverSetup()
    {
        driverBase = new DriverBase();
        driver = driverBase.initialize(System.getProperty("browser"));
        report = new ExtentReports("C:\\Users\\Pritam Atta\\Documents\\GitHub\\channelplay-automated-testing\\Reports\\report.html", true);
        System.out.println("Getting the Driver information");
    }

    @After(order = 2)
    public void addDataAndClose(io.cucumber.java.Scenario scenario) {
        if (scenario.isFailed() && driver instanceof TakesScreenshot) {
            addScreenshot(scenario);
        }
        addPageLink(scenario);
    }

    @After(order = 1)
    public void tearDown() {
        driver.quit();
        report.endTest(test);
        report.flush();
    }

    private void addPageLink(io.cucumber.java.Scenario scenario) {
        scenario.log(String.format("Test page: %s", driver.getCurrentUrl()));
        scenario.log(String.format("Test Browser: %s", System.getProperty("browser")));
    }

    private void addScreenshot(io.cucumber.java.Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "Screenshot");
    }
}

