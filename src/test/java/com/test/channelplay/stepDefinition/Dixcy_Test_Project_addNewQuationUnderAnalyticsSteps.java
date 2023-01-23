package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.Dixcy_Test_Project_addNewQuationUnderAnalyticsObject;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dixcy_Test_Project_addNewQuationUnderAnalyticsSteps extends DriverBase{
	
	CommonUtils commonUtils = new CommonUtils();
	Dixcy_Test_Project_addNewQuationUnderAnalyticsObject dixcy_Test_Project_addNewQuationUnderAnalyticsObject = new Dixcy_Test_Project_addNewQuationUnderAnalyticsObject();
	
	@Given("user is on Manage Activities screen under Market Working Activity menu under Market Working menu")
	public void user_is_on_manage_activities_screen_under_market_working_activity_menu_under_market_working_menu() {
		getDriver().get(GetProperty.value("appUrl"));
		commonUtils.validatePage("1Channel Login");
		dixcy_Test_Project_addNewQuationUnderAnalyticsObject.login(GetProperty.value("username"), GetProperty.value("password"));
	}

	@And("select analytics")
	public void select_analytics() {
		dixcy_Test_Project_addNewQuationUnderAnalyticsObject.Select_analytics();
	}


	@And("select quation")
	public void select_quation() {
		dixcy_Test_Project_addNewQuationUnderAnalyticsObject.Select_quation();
	}



	@When("user select add button")
	public void user_select_add_button() {
		dixcy_Test_Project_addNewQuationUnderAnalyticsObject.User_select_add_button();
	}



	@And("input values in all fields")
	public void input_values_in_all_fields() {

	}



	@And("hit save")
	public void hit_save() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	@And("user select add product button")
	public void user_select_add_product_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	@And("user add product with Usage as Pump")
	public void user_add_product_with_usage_as_pump() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	@And("hit save button")
	public void hit_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	@Then("quation created successfully message will show")
	public void quation_created_successfully_message_will_show() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	@When("user search with new created quation")
	public void user_search_with_new_created_quation() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	@Then("searched quation will show")
	public void searched_quation_will_show() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	@And("user select action button for that quation")
	public void user_select_action_button_for_that_quation() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	@Then("quation will open on edit mode")
	public void quation_will_open_on_edit_mode() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	@And("all data will same as given data while creating the quation")
	public void all_data_will_same_as_given_data_while_creating_the_quation() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
