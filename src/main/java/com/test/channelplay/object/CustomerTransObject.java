package com.test.channelplay.object;

import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class CustomerTransObject extends DriverBase {

    @FindBy(xpath = "//input[@formcontrolname=\"email\"]")
    private WebElement username_field;

    @FindBy(xpath = "//input[@formcontrolname=\"password\"]")
    private WebElement password_field;

    @FindBy(xpath = "//button[text()=\"Sign In\"]")
    private WebElement submit_button;

    @FindBy(xpath = "//span[text()=\" CRM \"]")
    private WebElement CRM_menu;

    @FindBy(xpath = "//div[@id='kt_header_menu']/ul/li[2]/div/ul/li/a/span[2]")
    private WebElement Customer_menu;

    @FindBy(xpath = "//span[text()='Add']")
    private WebElement Add_button;

    @FindBy(xpath = "//label[text()=\"Customer Name\"]/parent::div/following-sibling::div//input")
    private WebElement CustomerName_field;

    @FindBy(xpath = "//label[text()=\"Customer Type\"]/parent::div/following-sibling::div/mat-form-field/div")
    private WebElement CustomerType_dropdown;

    @FindBy(xpath = "//mat-option[2]")
    private WebElement First_Option;

    @FindBy(xpath = "//mat-option[3]")
    private WebElement Second_Option;

    @FindBy(xpath = "//label[text()=\"Address\"]/parent::div/following-sibling::div//textarea")
    private WebElement Address_Field;

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

    @FindBy(xpath = "//label[text()=\"Photo\"]/parent::div/following-sibling::div//input")
    private WebElement Photo_upload;

    @FindBy(xpath = "//label[text()=\"Phone\" ]/parent::div/following-sibling::div//input")
    private WebElement Phone_Field;

    @FindBy(xpath = "//label[text()=\"Time zone\"]/parent::div//following-sibling::div/mat-form-field/div")
    private WebElement TimeZone_Dropdown;

    @FindBy(xpath = "//button[@aria-label=\"Open calendar\"]")
    private WebElement Calender_button;

    @FindBy(xpath = "//div[@class=\"mat-calendar-body-cell-content mat-calendar-body-today\"]\n")
    private WebElement CurrentDate;

    @FindBy(xpath = "//div[text()=' 15 ']")
    private WebElement EditCurrentDate;


    @FindBy(xpath = "//label[text()=\"Customer Email\"]/parent::div/following-sibling::div//input")
    private WebElement Email_Field;

    @FindBy(xpath = "//label[text()=\"Ducument\"]/parent::div/following-sibling::div//input")
    private WebElement Document_upload;

    @FindBy(xpath = "//label[text()=\"Video\"]/parent::div/following-sibling::div//input")
    private WebElement Video_upload;

    @FindBy(xpath = "//label[text()=\"Gender\"]/parent::div//following-sibling::div/mat-form-field/div")
    private WebElement Gender_Dropdown;

    @FindBy(xpath = "//button[text()=\"Save\"]")
    private WebElement Save_button;

    @FindBy(xpath = "//input[@placeholder=\"Search\"]")
    private WebElement Search_bar;

    @FindBy(xpath = "//button[text()='Save and Add New']")
    private WebElement SaveAndAddNew_button;

    @FindBy(xpath = "//h4[text()='Add New Customer']/ancestor::div[2]//button[text()='Cancel']")
    private WebElement Cancel_button;

    @FindBy(xpath = "//img[@title=\"Edit\"]")
    private WebElement Edit_button;


    //Global Code
    CommonUtils commonUtils = new CommonUtils();
    Actions actions = new Actions(getDriver());
    public String customerName;
    public String dataPicker;

    public CustomerTransObject() {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginCRM(String username, String password) {
        username_field.sendKeys(username);
        password_field.sendKeys(password);
        submit_button.click();
        sleep(10000);

    }

    public void Customer() {
        sleep(3000);
        CRM_menu.click();
        sleep(2000);
        Customer_menu.click();
        sleep(5000);
    }

    public void UserClickOnAddButton() {

        Add_button.click();
        sleep(3000);
    }

    public void addCus() {
        dataPicker = commonUtils.generateRandomString(5);
        customerName = "user " + dataPicker;
        CustomerName_field.sendKeys(customerName);
    }

    public void setCustomerType_dropdown() {
        CustomerType_dropdown.click();
        First_Option.click();

    }

    public void setAddress_Field() {
        Address_Field.sendKeys("Kolkata new bazaar");
        sleep(2000);
    }

    public void setCountry_Dropdown() {
        Country_Dropdown.click();
        sleep(3000);

    }

    public void setIndia_Option() {
        India_Option.click();


    }

    public void setState_Dropdown() {
        State_Dropdown.click();
    }

    public void setAndhraPradesh_Option() {
        AndhraPradesh_Option.click();


    }

    public void setCity_Dropdown() {
        City_Dropdown.click();
    }

    public void setAdilabad_Option() {
        Adilabad_Option.click();
        sleep(3000);
    }

    public void setPhoto_upload() {
        String rootPath = System.getProperty("user.dir");
        System.out.println(rootPath + "....................>");
        sleep(3000);
        Photo_upload.sendKeys(rootPath + "/Files/1640076584197.jpg");
        sleep(3000);
    }

    public void setPhone_Field() {
        Phone_Field.sendKeys("9875678767");
        sleep(1000);
    }

    public void setTimeZone_Dropdown() {
        TimeZone_Dropdown.click();
        sleep(1000);
        First_Option.click();
        sleep(1000);
        WebElement freeSpace = getDriver().findElement(By.xpath("//label[text()=\"Date\"]"));
        actions.moveToElement(freeSpace).click().perform();

    }

    public void setCalender_button() {
        sleep(2000);
        Calender_button.click();
        sleep(1000);
        CurrentDate.click();
        sleep(2000);
    }

    public void setEmail_Field() {
        Email_Field.sendKeys("testuser@test.com");
        sleep(1000);
    }

    public void setDocument_upload() {
        String rootPath = System.getProperty("user.dir");
        System.out.println(rootPath + "....................>");
        Document_upload.sendKeys(rootPath + "/Files/samplePDF.pdf");
        sleep(3000);
    }

    public void setVideo_upload() {
        String rootPath = System.getProperty("user.dir");
        System.out.println(rootPath + "....................>");
        Video_upload.sendKeys(rootPath + "/Files/dummymp4.mp4");
        sleep(5000);
    }

    public void setGender_Dropdown() {
        Gender_Dropdown.click();
        sleep(1000);
        First_Option.click();
        sleep(2000);
    }

    public void setSave_button() {
        Save_button.click();
        sleep(7000);

    }

    public void setSearch_bar() {
        sleep(2000);
        Search_bar.click();
        Search_bar.sendKeys(customerName);
        sleep(6000);
        String isCustomerName_xpath = ("//div[text()='" + customerName + "']");
        WebElement isCustomerName = getDriver().findElement(By.xpath(isCustomerName_xpath));
        String isStatusActive_xpath = ("//div[text()='" + customerName + "']//following-sibling::div[5]//button[text()='Active']");
        WebElement isStatusActive = getDriver().findElement(By.xpath(isStatusActive_xpath));
        Assert.assertTrue(isCustomerName.isDisplayed() && isStatusActive.isDisplayed());


    }

    //Scenario: Customer add with Save and Add new button
    public void setSaveAndAddNew_button() {

        sleep(3000);
        SaveAndAddNew_button.click();
        sleep(6000);
    }

    public void setCancel_button() {
        actions.moveToElement(Cancel_button).build().perform();
        Cancel_button.click();
        sleep(1000);
        getDriver().navigate().refresh();
        sleep(6000);
    }

    //Scenario: Edit Customer with all fields
    public void setEdit_button() {
        Edit_button.click();
        sleep(10000);
        CustomerName_field.clear();
        Address_Field.clear();
        Phone_Field.clear();
        Email_Field.clear();
        sleep(2000);

        WebElement PageArea = getDriver().findElement(By.xpath("//h4[text()='Edit Customer']/ancestor::div[2]"));
        List<WebElement> files = PageArea.findElements(By.xpath("//img[@class=\"close-svg\"]"));
        for (int a = 1; a<=files.size(); a++){
            WebElement ClearDocuments_button = getDriver().findElement(By.xpath("//img[@class=\"close-svg\"]"));
            ClearDocuments_button.click();
            sleep(1000);
        }


    }

    public void setChangeCustomerType() {
        CustomerType_dropdown.click();
        Second_Option.click();
    }

    public void UAECountryOption() {
        Country_Dropdown.click();
        sleep(1000);
        WebElement UAE_CountryOption = getDriver().findElement(By.xpath("//span[text()=\" United Arab Emirates \"]"));
        UAE_CountryOption.click();
    }

    public void StateOptionDubai() {
        State_Dropdown.click();
        sleep(1000);
        WebElement Dubai_StateOption = getDriver().findElement(By.xpath("//span[text()=\" Dubai \"]"));
        sleep(1000);
        Dubai_StateOption.click();
    }

    public void DubaiCityOption() {
        City_Dropdown.click();
        sleep(1000);
        WebElement Dubai_CityOption = getDriver().findElement(By.xpath("//span[text()=\" Dubai \"]"));
        Dubai_CityOption.click();
    }

    public void EditTimeZone_Dropdown() {
        TimeZone_Dropdown.click();
        sleep(1000);
        Second_Option.click();
        sleep(1000);
        WebElement freeSpace = getDriver().findElement(By.xpath("//label[text()=\"Date\"]"));
        actions.moveToElement(freeSpace).click().perform();
    }

    public void setEditGender_Dropdown() {
        Gender_Dropdown.click();
        sleep(1000);
        Second_Option.click();
        sleep(2000);
    }
    public void setEditCalender_button() {
        sleep(2000);
        Calender_button.click();
        sleep(1000);
        EditCurrentDate.click();
        sleep(2000);
    }


    public void sleep(long s) {
        try {
            Thread.sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}







