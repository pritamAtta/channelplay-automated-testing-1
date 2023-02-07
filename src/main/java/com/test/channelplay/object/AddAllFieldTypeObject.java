package com.test.channelplay.object;

import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAllFieldTypeObject extends DriverBase {

//    LoginPage loginPage = new LoginPage();

//    WebElement username_field = getDriver().findElement(By.xpath("//input[@formcontrolname=\"email\"]"));
//
//    WebElement password_field = getDriver().findElement(By.xpath("//input[@formcontrolname=\"password\"]"));
//
//    WebElement submit_button = getDriver().findElement(By.xpath("//button[text()=\"Sign In\"]"));


    @FindBy(xpath = "//input[@formcontrolname=\"email\"]")
    private WebElement username_field;

    @FindBy(xpath = "//input[@formcontrolname=\"password\"]")
    private WebElement password_field;

    @FindBy(xpath = "//button[text()=\"Sign In\"]")
    private WebElement submit_button;


//    @FindBy(xpath = "//a[@href=\"javascript:;\"]//span[text()=\" Settings \"]")
    @FindBy(xpath="//div[@id='kt_header_menu']/ul/li[4]/a/span[2]")
    private WebElement settings_menu;


//    @FindBy(xpath = "//span[text()=\" Settings \"]/ancestor::li//span[text()=\" CRM \"]")
    @FindBy(xpath="//div[@id='kt_header_menu']/ul/li[4]/div/ul/li[2]/a/span[2]")
    private WebElement CRM_dropdown;

    @FindBy(xpath = "//span[text()=\" Settings \"]/ancestor::li//span[text()=\" Customer \"]")
    private WebElement customer_option;

//    @FindBy(xpath = "//button/span[text()=\"Add Field\"]")
    @FindBy(xpath="//div[@id='kt_content']/div/div/kt-company-configuration/kt-portlet/div/kt-portlet-body/kt-fields-list/div/div/div/div[3]/button")
    private WebElement addField_button;

    @FindBy(xpath = "//h4[text()=\"Add Field\"]/parent::div/following-sibling::div//div[@class=\"mat-select-arrow-wrapper\"]")
    private WebElement fieldType_dropdown;

    @FindBy(xpath = "//mat-option/span[text()=\" Numeric \"]")
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

        @FindBy(xpath = "//label[text()=\"Upload File\"]/parent::div/following-sibling::div//img")
        private WebElement uploadFile_field;

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

        @FindBy(xpath = "//label[text()=\"Entity\"]/parent::div/following-sibling::div/mat-form-field")
        private WebElement entity_dropdown;

        @FindBy(xpath = "//label[text()=\"Entity Field\"]/parent::div/following-sibling::div/mat-form-field")
        private WebElement entityField_dropdown;

    @FindBy(xpath = "//button[text()=\"Save\"]")
    private WebElement save_button;


    @FindBy(xpath = "//span[text()=\"Field added.\"]")
    private WebElement success_message;



    CommonUtils commonUtils = new CommonUtils();

    public AddAllFieldTypeObject(){
        PageFactory.initElements(getDriver(), this);
    }

    public String NewFieldName;


    public void login(String username, String password){
        username_field.sendKeys(username);
        password_field.sendKeys(password);
        submit_button.click();
        commonUtils.waitForPageToLoad();
        sleep(5000);
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
        NewFieldName = "Company Phone Number";
        fieldName_field.sendKeys(NewFieldName);
    }

    public void SelectSaveButton(){
        save_button.click();
        sleep(4000);
    }

    public void NewFieldWillBeShownInTheList(){
        Assert.assertTrue(getDriver().findElement(By.xpath("//div//span[text()='"+NewFieldName+"']")).isDisplayed());
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

    public void UserSelectReferenceDocumentsFromTheFieldTypeDropdown(){
        fieldType_dropdown.click();
        referenceDocuments_option.click();
        sleep(2000);
    }

    public void EnterFieldNameForReferenceDocumentsType(){
        fieldName_field.sendKeys("Company Reference Details");
    }

    public void UploadAFileUnderUploadFile(){
        uploadFile_field.sendKeys("samplePDF.pdf");
    }

    public void UserSelectHeaderTextFromTheFieldTypeDropdown(){
        fieldType_dropdown.click();
        headerText_option.click();
        sleep(2000);
    }

    public void EnterFieldNameForHeaderTextType(){
        fieldName_field.sendKeys("Add Header Details");
    }

    public void UserSelectNormalTextFromTheFieldTypeDropdown(){
        fieldType_dropdown.click();
        normalText_option.click();
        sleep(2000);
    }

    public void EnterFieldNameForNormalTextType(){
        fieldName_field.sendKeys("Customer Normal Text");
    }

    public void UserSelectPageSeparatorFromTheFieldTypeDropdown(){
        fieldType_dropdown.click();
        pageSeparator_option.click();
        sleep(2000);
    }

    public void EnterFieldNameForPageSeparatorType(){
        fieldName_field.sendKeys("Customer Page Separator");
    }

    public void UserSelectDataListFromTheFieldTypeDropdown(){
        fieldType_dropdown.click();
        dataList_option.click();
        sleep(2000);
    }

    public void EnterFieldNameForDataListType(){
        fieldName_field.sendKeys("Select Data List");
    }

    public void SelectListName(){

    }

    public void UserSelectOTPValidationFromTheFieldTypeDropdown(){
        fieldType_dropdown.click();
        OTPValidation_option.click();
        sleep(2000);
    }

    public void EnterFieldNameOTPValidationType(){
        fieldName_field.sendKeys("Verify Email OTP");
    }

    public void EnterEntity(){
        entity_dropdown.click();
        getDriver().findElement(By.xpath("//mat-option/span[text()=\" Contact \"]")).click();
    }

    public void SelectEntityField(){
        entityField_dropdown.click();
        getDriver().findElement(By.xpath("//mat-option/span[text()=\" Mobile \"]"));
    }

    public void sleep(long s){
        try{
            Thread.sleep(s);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
