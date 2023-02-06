package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.AddAllFieldTypeObject;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class AddAllFieldTypesSteps extends DriverBase {

    AddAllFieldTypeObject addAllFieldTypeObject = new AddAllFieldTypeObject();
    CommonUtils commonUtils = new CommonUtils();

    @Given("after login to crm user will be on the Customer page under Settings")
    public void afterLoginToCrmUserWillBeOnTheCustomerPageUnderSettings() {
        getDriver().get(GetProperty.value("crmPortal"));
        commonUtils.validatePage("Assistive");
        addAllFieldTypeObject.login(GetProperty.value("username"), GetProperty.value("password"));
    }

    @And("user select Add Field button")
    public void userSelectAddFieldButton() {
        addAllFieldTypeObject.UserSelectAddFieldButton();
    }


    @When("user select numeric from the field type dropdown")
    public void userSelectNumericFromTheFieldTypeDropdown() {
        addAllFieldTypeObject.UserSelectNumericFromTheFieldTypeDropdown();
    }

    @And("enter Field Name for Numeric type")
    public void enterFieldNameForNumericType() {
        addAllFieldTypeObject.EnterFieldNameForNumericType();
    }

    @And("select Save button")
    public void selectSaveButton() {
        addAllFieldTypeObject.SelectSaveButton();
    }


    @When("user select Multi Select Dropdown from the field type dropdown")
    public void userSelectMultiSelectDropdownFromTheFieldTypeDropdown() {
        addAllFieldTypeObject.UserSelectMultiSelectDropdownFromTheFieldTypeDropdown();
    }

    @And("enter Field Name for Multi Select Dropdown type")
    public void enterFieldNameForMultiSelectDropdownType() {
        addAllFieldTypeObject.EnterFieldNameForMultiSelectDropdownType();
    }

    @And("enter Options")
    public void enterOptions() {
        addAllFieldTypeObject.enterOptions();
    }


    @When("user select Date from the field type dropdown")
    public void userSelectDateFromTheFieldTypeDropdown() {
        addAllFieldTypeObject.UserSelectDateFromTheFieldTypeDropdown();
    }

    @And("enter Field Name for Date type")
    public void enterFieldNameForDateType() {
        addAllFieldTypeObject.EnterFieldNameForDateType();
    }

    @And("select Value Type as Custom")
    public void selectValueTypeAsCustom() {
        addAllFieldTypeObject.SelectValueTypeAsCustom();
    }

    @When("user select Email from the field type dropdown")
    public void userSelectEmailFromTheFieldTypeDropdown() {
        addAllFieldTypeObject.UserSelectEmailFromTheFieldTypeDropdown();
    }

    @And("enter Field Name for Email type")
    public void enterFieldNameForEmailType() {
        addAllFieldTypeObject.EnterFieldNameForEmailType();
    }

    @When("user select Document Upload from the field type dropdown")
    public void userSelectDocumentUploadFromTheFieldTypeDropdown() {
        addAllFieldTypeObject.UserSelectDocumentUploadFromTheFieldTypeDropdown();
    }

    @And("enter Field Name for Document Upload type")
    public void enterFieldNameForDocumentUploadType() {
        addAllFieldTypeObject.EnterFieldNameForDocumentUploadType();
    }

    @When("user select Video from the field type dropdown")
    public void userSelectVideoFromTheFieldTypeDropdown() {
        addAllFieldTypeObject.UserSelectVideoFromTheFieldTypeDropdown();
    }

    @And("enter Field Name for Video type")
    public void enterFieldNameForVideoType() {

    }
}
