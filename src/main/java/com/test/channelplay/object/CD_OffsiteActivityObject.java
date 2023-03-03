package com.test.channelplay.object;

import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CD_OffsiteActivityObject extends DriverBase {

    @FindBy(xpath = "//label[text()='Select Customer']/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement SelectCustomer_dropdown;

    @FindBy(xpath = "//label[text()='Select Opportunity']/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement SelectOpportunity_dropdown;

    @FindBy(xpath = "//label[text()='Title']/parent::div/following-sibling::div//input")
    private WebElement Title_field;

    @FindBy(xpath = "//label[text()='Description']/parent::div/following-sibling::div/mat-form-field")
    private WebElement Description_Field;

    @FindBy(xpath = "//label[text()='Update Opportunity Value']/parent::div/following-sibling::div")
    private WebElement Update_Opportunity_Value_Field;

    @FindBy(xpath = "//label[text()='Update Opportunity Status']/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement UpdateOpportunityStatus_dropdown;

    @FindBy(xpath = "//button[@aria-label=\"Open calendar\"]")
    private WebElement UpdateExpClosureDate_CalenderButton;

    @FindBy(xpath = "//div[@class=\"mat-calendar-body-cell-content mat-calendar-body-today\"]\n")
    private WebElement CurrentDate;

    @FindBy(xpath = "//mat-option[2]")
    private WebElement First_Option;

    @FindBy(xpath = "//label[text()='Update Win Probability']/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement UpdateWinProbability_dropdown;

    @FindBy(xpath = "//mat-option[11]")
    private WebElement WP90_Option;

    @FindBy(xpath = "//label[text()='Contacts']/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement Contact_dropdown;

    @FindBy(xpath = "//label[text()='testActivity']/parent::div/following-sibling::div//input")
    private WebElement TestActivity_field;

    @FindBy(xpath = "//mat-select[@formcontrolname=\"countryName\"]")
    private WebElement Country_Dropdown;

    @FindBy(xpath = "//span[text()=\" India \"]")
    private WebElement India_Option;

    @FindBy(xpath = "//mat-select[@formcontrolname=\"stateName\"]")
    private WebElement State_Dropdown;

    @FindBy(xpath = "//span[text()=\" Andhra Pradesh \"]")
    public WebElement AndhraPradesh_Option;

    @FindBy(xpath = "//mat-select[@formcontrolname=\"cityName\"]")
    private WebElement City_Dropdown;

    @FindBy(xpath = "//span[text()=\" Adilabad \"]")
    private WebElement Adilabad_Option;

    @FindBy(xpath = "//button[text()=\"Save\"]")
    private WebElement Save_button;

    CommonUtils commonUtils = new CommonUtils();
    Actions actions = new Actions(getDriver());

    public CD_OffsiteActivityObject() {
        PageFactory.initElements(getDriver(), this);
    }
}












