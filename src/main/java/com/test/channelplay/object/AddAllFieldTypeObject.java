package com.test.channelplay.object;

import com.test.channelplay.utils.DriverBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAllFieldTypeObject extends DriverBase {


    @FindBy(xpath = "//input[@formcontrolname=\"email\"]")
    private WebElement username_field;

    @FindBy(xpath = "//input[@formcontrolname=\"password\"]")
    private WebElement password_field;

    @FindBy(xpath = "//input[@formcontrolname=\"password\"]")
    private WebElement submit_button;

    @FindBy(xpath = "//a[@href=\"javascript:;\"]//span[text()=\" Settings \"]")
    private WebElement settings_menu;

    @FindBy(xpath = "//span[text()=\" Settings \"]/ancestor::li//span[text()=\" CRM \"]")
    private WebElement CRM_dropdown;

    @FindBy(xpath = "//span[text()=\" Settings \"]/ancestor::li//span[text()=\" Customer \"]")
    private WebElement customer_option;

    @FindBy(xpath = "//button/span[text()=\"Add Field\"]")
    private WebElement addField_button;

    @FindBy(xpath = "//h4[text()=\"Add Field\"]/parent::div/following-sibling::div//div[@class=\"mat-select-arrow-wrapper\"]")
    private WebElement fieldType_dropdown;

    @FindBy(xpath = "//mat-option[@id=\"mat-option-25\"]")
    private WebElement numeric_option;

    @FindBy(xpath = "//label[text()=\"Field Name\"]/parent::div/following-sibling::div//input")
    private WebElement fieldName_field;

    @FindBy(xpath = "//mat-option[@id=\"mat-option-27\"]")
    private WebElement multiSelectDropdown_option;

        @FindBy(xpath = "//label[text()=\"Options\"]/parent::div/following-sibling::div//input")
        private WebElement options_field;

    @FindBy(xpath = "//mat-option[@id=\"mat-option-28\"]")
    private WebElement date_option;

        @FindBy(xpath = "//label[text()=\"Value Type\"]/parent::div/following-sibling::div//mat-radio-button[@id=\"mat-radio-3\"]//input")
        private WebElement CustomValueType_radioButton;

    @FindBy(xpath = "//mat-option[@id=\"mat-option-29\"]")
    private WebElement email_option;

    @FindBy(xpath = "//mat-option[@id=\"mat-option-31\"]")
    private WebElement documentUpload_option;

    @FindBy(xpath = "//mat-option[@id=\"mat-option-32\"]")
    private WebElement video_option;

    @FindBy(xpath = "//mat-option[@id=\"mat-option-33\"]")
    private WebElement referenceDocuments_option;

    @FindBy(xpath = "//mat-option[@id=\"mat-option-34\"]")
    private WebElement headerText_option;

    @FindBy(xpath = "//mat-option[@id=\"mat-option-35\"]")
    private WebElement normalText_option;

    @FindBy(xpath = "//mat-option[@id=\"mat-option-36\"]")
    private WebElement pageSeparator_option;

    @FindBy(xpath = "//mat-option[@id=\"mat-option-37\"]")
    private WebElement dataList_option;

    @FindBy(xpath = "//mat-option[@id=\"mat-option-38\"]")
    private WebElement OTPValidation_option;

    @FindBy(xpath = "//button[text()=\"Save\"]")
    private WebElement save_button;




    public AddAllFieldTypeObject(){
        PageFactory.initElements(getDriver(), this);
    }



    public void login(String username, String password){
        username_field.sendKeys(username);
        password_field.sendKeys(password);
        submit_button.click();
        sleep(3000);
        settings_menu.click();
        CRM_dropdown.click();
        customer_option.click();
    }

    public void UserSelectAddFieldButton(){
        addField_button.click();
        sleep(3000);
    }

    public void UserSelectNumericFromTheFieldTypeDropdown(){
        fieldType_dropdown.click();
        numeric_option.click();
        sleep(2000);
    }

    public void EnterFieldNameForNumericType(){
        fieldName_field.sendKeys("Phone Number");
    }

    public void SelectSaveButton(){
        save_button.click();
    }

    public void UserSelectMultiSelectDropdownFromTheFieldTypeDropdown(){
        fieldType_dropdown.click();
        multiSelectDropdown_option.click();
        sleep(2000);
    }

    public void EnterFieldNameForMultiSelectDropdownType(){
        fieldName_field.sendKeys("Company");
    }

    public void enterOptions(){
        options_field.sendKeys("Channel Play");
    }

    public void UserSelectDateFromTheFieldTypeDropdown(){
        fieldType_dropdown.click();
        date_option.click();
        sleep(2000);
    }

    public void EnterFieldNameForDateType(){
        fieldName_field.sendKeys("Started Date");
    }

    public void SelectValueTypeAsCustom(){
        CustomValueType_radioButton.click();
    }

    public void UserSelectEmailFromTheFieldTypeDropdown(){
        fieldType_dropdown.click();
        email_option.click();
        sleep(2000);
    }

    public void EnterFieldNameForEmailType(){
        fieldName_field.sendKeys("Company Registered Email");
    }

    public void UserSelectDocumentUploadFromTheFieldTypeDropdown(){
        fieldType_dropdown.click();
        documentUpload_option.click();
        sleep(2000);
    }

    public void EnterFieldNameForDocumentUploadType(){
        fieldName_field.sendKeys("Company Registration Certificate");
    }

    public void UserSelectVideoFromTheFieldTypeDropdown(){
        fieldType_dropdown.click();
        video_option.click();
        sleep(2000);
    }

    public void EnterFieldNameForVideoType(){
        fieldName_field.sendKeys("Company Location Video");
    }


    public void sleep(long s){
        try{
            Thread.sleep(s);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
