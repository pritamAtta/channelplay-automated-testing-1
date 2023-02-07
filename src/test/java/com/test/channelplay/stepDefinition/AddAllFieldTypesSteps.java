package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.AddAllFieldTypeObject;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddAllFieldTypesSteps extends DriverBase {

    AddAllFieldTypeObject addAllFieldTypeObject = new AddAllFieldTypeObject();
    CommonUtils commonUtils = new CommonUtils();

    @Given("after login to crm user will be on the Customer page under Settings")
    public void afterLoginToCrmUserWillBeOnTheCustomerPageUnderSettings() {
        getDriver().get(GetProperty.value("appUrl"));
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

    @Then("new field will be shown in the list")
    public void newFieldWillBeShownInTheList() {
        addAllFieldTypeObject.NewFieldWillBeShownInTheList();
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
        addAllFieldTypeObject.EnterFieldNameForVideoType();
    }

    @When("user select Reference Documents from the field type dropdown")
    public void userSelectReferenceDocumentsFromTheFieldTypeDropdown() {
        addAllFieldTypeObject.UserSelectReferenceDocumentsFromTheFieldTypeDropdown();
    }

    @And("enter Field Name for Reference Documents type")
    public void enterFieldNameForReferenceDocumentsType() {
        addAllFieldTypeObject.EnterFieldNameForReferenceDocumentsType();
    }

    @And("upload a file under Upload File")
    public void uploadAFileUnderUploadFile() {
        addAllFieldTypeObject.UploadAFileUnderUploadFile();
    }

    @When("user select Header Text from the field type dropdown")
    public void userSelectHeaderTextFromTheFieldTypeDropdown() {
        addAllFieldTypeObject.UserSelectHeaderTextFromTheFieldTypeDropdown();
    }

    @And("enter Field Name for Header Text type")
    public void enterFieldNameForHeaderTextType() {
        addAllFieldTypeObject.EnterFieldNameForHeaderTextType();
    }

    @When("user select Normal Text from the field type dropdown")
    public void userSelectNormalTextFromTheFieldTypeDropdown() {
        addAllFieldTypeObject.UserSelectNormalTextFromTheFieldTypeDropdown();
    }

    @And("enter Field Name for Normal Text type")
    public void enterFieldNameForNormalTextType() {
        addAllFieldTypeObject.EnterFieldNameForNormalTextType();
    }

    @When("user select Page Separator from the field type dropdown")
    public void userSelectPageSeparatorFromTheFieldTypeDropdown() {
        addAllFieldTypeObject.UserSelectPageSeparatorFromTheFieldTypeDropdown();
    }

    @And("enter Field Name for Page Separator type")
    public void enterFieldNameForPageSeparatorType() {
        addAllFieldTypeObject.EnterFieldNameForPageSeparatorType();
    }

    @When("user select Data List from the field type dropdown")
    public void userSelectDataListFromTheFieldTypeDropdown() {
        addAllFieldTypeObject.UserSelectDataListFromTheFieldTypeDropdown();
    }

    @And("enter Field Name for Data List type")
    public void enterFieldNameForDataListType() {
        addAllFieldTypeObject.EnterFieldNameForDataListType();
    }

    @And("select List Name")
    public void selectListName() {
        addAllFieldTypeObject.SelectListName();
    }

    @When("user select OTP Validation from the field type dropdown")
    public void userSelectOTPValidationFromTheFieldTypeDropdown() {
        addAllFieldTypeObject.UserSelectOTPValidationFromTheFieldTypeDropdown();
    }

    @And("enter Field Name OTP Validation type")
    public void enterFieldNameOTPValidationType() {
        addAllFieldTypeObject.EnterFieldNameOTPValidationType();
    }

    @And("enter Entity")
    public void enterEntity() {
        addAllFieldTypeObject.EnterEntity();
    }

    @And("select Entity Field")
    public void selectEntityField() {
        addAllFieldTypeObject.SelectEntityField();
    }

}
