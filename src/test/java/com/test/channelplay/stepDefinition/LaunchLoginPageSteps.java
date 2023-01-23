package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.LaunchLoginPageObject;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaunchLoginPageSteps extends DriverBase{
	
	CommonUtils commonUtils = new CommonUtils();
	LaunchLoginPageObject launchLoginPageObject = new LaunchLoginPageObject();
	
	@Given("the user is on the log in page")
	public void the_user_is_on_the_log_in_page() {
		getDriver().get(GetProperty.value("appUrl"));
		commonUtils.validatePage("1Channel Login");
	}

	@When("user enter user_name")
	public void user_enter_user_name() {
		launchLoginPageObject.User_enter_user_name(GetProperty.value("username"));
	}

	@And("enter password")
	public void enter_password() {
		launchLoginPageObject.Enter_password(GetProperty.value("password"));
	}

	@And("select login button")
	public void select_login_button() {
		launchLoginPageObject.Select_login_button();
	}

	@Then("user will be on project list screen")
	public void user_will_be_on_project_list_screen() {
		launchLoginPageObject.User_will_be_on_project_list_screen();
	}
	
	@When("user select wrong userName and password")
	public void user_select_wrong_user_name_and_password() {
		launchLoginPageObject.User_select_wrong_user_name_and_password();
	}
	
	@Then("validation message will show")
	public void validation_message_will_show() {
		launchLoginPageObject.Validation_message_will_show();
	}


}
