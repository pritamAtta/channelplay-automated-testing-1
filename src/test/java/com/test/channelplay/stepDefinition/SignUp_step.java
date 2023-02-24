package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.signUp;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignUp_step extends DriverBase {
    CommonUtils commonUtils = new CommonUtils();
    signUp signup = new signUp();

    @Given("user landed on assistive login page")
    public void userLandedOnAssistiveLoginPage() {
        getDriver().get(GetProperty.value("appUrl"));
        commonUtils.validatePage("Assistive");
    }


    @When("click on Sign Up at login page")
    public void click_on_sign_up_at_login_page() {
        signup.Click_on_sign_up_at_login_page();
        WebElement Signup_title = getDriver().findElement(By.xpath("//div/h3[text()=\"Sign Up\"]"));
        Assert.assertTrue(Signup_title.isDisplayed());
    }

    @And("user enters firstname")
    public void user_enters_firstname() {
        signup.User_enters_firstname();
    }

    @And("user enters lastname")
    public void user_enters_lastname() {
        signup.User_enters_lastname();
    }

    @And("user enters email address")
    public void user_enters_email_address() {
        signup.User_enters_email_address();
    }

    @And("click on terms & conditions checkbox")
    public void click_on_terms_conditions_checkbox() {
        signup.Click_on_terms_conditions_checkbox();
    }

    @Then("click on sign Up button")
    public void click_on_sign_up_button() {
        signup.Click_on_sign_up_button();
    }


}
