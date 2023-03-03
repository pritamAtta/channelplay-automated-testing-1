package com.test.channelplay.stepDefinition;

import com.test.channelplay.object.CustomerTransObject;
import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerTransSteps extends DriverBase {

    CustomerTransObject customerTransObject = new CustomerTransObject();

    CommonUtils commonUtils = new CommonUtils();
    @Given("after login to crm user will be on the Customer page under CRM")
    public void afterLoginToCrmUserWillBeOnTheCustomerPageUnderCRM() {
        getDriver().get(GetProperty.value("appUrl"));
        commonUtils.validatePage("Assistive");
        customerTransObject.loginCRM(GetProperty.value("username"), GetProperty.value("password"));
    }


    @And("user select CRM and Click on Customer")
    public void userSelectCRMAndClickOnCustomer() {
         customerTransObject.Customer();
    }

    @When("User Click on Add button")
    public void userClickOnAddButton() {
        customerTransObject.UserClickOnAddButton();

    }

    @And("user Enter Customer Name")
    public void userEnterCustomerName() {
        customerTransObject.addCus();
    }

    @And("user select CustomerType dropdown and click first option")
    public void userSelectCustomerTypeDropdownAndClickFirstOption() {
        customerTransObject.setCustomerType_dropdown();

    }

    @And("user enter address")
    public void userEnterAddress() {
        customerTransObject.setAddress_Field();
    }

       @And("user select Country")
    public void userSelectCountry() {
        customerTransObject.setCountry_Dropdown();
        customerTransObject.setIndia_Option();
    }

    @And("user select State")
    public void userSelectState() {
        customerTransObject.setState_Dropdown();
        customerTransObject.setAndhraPradesh_Option();
    }

    @And("user select City")
    public void userSelectCity() {
        customerTransObject.setCity_Dropdown();
        customerTransObject.setAdilabad_Option();
    }

    @And("user upload photo")
    public void userUploadPhoto() {
        customerTransObject.setPhoto_upload();
    }

    @And("user enter phone number")
    public void userEnterPhoneNumber() {
        customerTransObject.setPhone_Field();
    }

    @And("user select timezone dropdown and click on first option")
    public void userSelectTimezoneDropdownAndClickOnFirstOption() {
        customerTransObject.setTimeZone_Dropdown();
    }

    @And("user click calender button and click select current date")
    public void userClickCalenderButtonAndClickSelectCurrentDate() {
        customerTransObject.setCalender_button();
    }

    @And("user enter email")
    public void userEnterEmail() {
        customerTransObject.setEmail_Field();
    }

    @And("user upload document docs,pdf,ppt.xlsx")
    public void userUploadDocumentDocsPdfPptXlsx() {
        customerTransObject.setDocument_upload();
    }

    @And("user upload video mpfour,mpg")
    public void userUploadVideoMpfourMpg() {
        customerTransObject.setVideo_upload();
    }

    @And("user select select gender and click first option")
    public void userSelectSelectGenderAndClickFirstOption() {
        customerTransObject.setGender_Dropdown();
    }

    @Then("user click save button")

    public void userClickSaveButton() {
        customerTransObject.setSave_button();
    }


    @Then("customer will added successfully with active status")
    public void customerWillAddedSuccessfullyWithActiveStatus() {
        customerTransObject.setSearch_bar();
      }

    @And("user click save and Add New button")
    public void userClickSaveAndAddNewButton() {
        customerTransObject.setSaveAndAddNew_button();

    }

    @And("then user click on cancel button")
    public void thenUserClickOnCancelButton() {
        customerTransObject.setCancel_button();
    }
    //Scenario: Edit Customer with all fields
    @When("User Click on Edit button")
    public void userClickOnEditButton() {
        customerTransObject.setEdit_button();

    }

    @And("user select CustomerType dropdown and click first option to Second option")
    public void userSelectCustomerTypeDropdownAndClickFirstOptionToSecondOption() {
        customerTransObject.setChangeCustomerType();
    }

    @And("user select Country india to UAE")
    public void userSelectCountryIndiaToUAE() {
        customerTransObject.UAECountryOption();
    }

    @And("user select State Dubai")
    public void userSelectStateDubai() {
        customerTransObject.StateOptionDubai();
    }

    @And("user select City Dubai")
    public void userSelectCityDubai() {
        customerTransObject.DubaiCityOption();
    }

    @And("user select timezone dropdown and click on first option to second option")
    public void userSelectTimezoneDropdownAndClickOnFirstOptionToSecondOption() {
        customerTransObject.EditTimeZone_Dropdown();
    }

    @And("user select select gender and click first option to second option")
    public void userSelectSelectGenderAndClickFirstOptionToSecondOption() {
    }

    @And("user click calender button and click current date")
    public void userClickCalenderButtonAndClickCurrentDate() {
        customerTransObject.setEditCalender_button();
    }
}
