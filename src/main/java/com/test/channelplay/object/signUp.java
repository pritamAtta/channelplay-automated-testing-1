package com.test.channelplay.object;

import com.test.channelplay.utils.DriverBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class signUp extends DriverBase {

    @FindBy(xpath = "//div/a[text()=\"Sign Up\"]")
    WebElement signUp_link;

    @FindBy(xpath = "//input[@formcontrolname=\"firstName\"]")
    WebElement firstname_field;

    @FindBy(xpath = "//input[@formcontrolname=\"lastName\"]")
    WebElement lastname_field;

    @FindBy(xpath = "//input[@formcontrolname=\"email\"]")
    WebElement work_email_field;

    @FindBy(xpath = "//div[@class=\"mat-checkbox-inner-container\"]")
    WebElement termsCheck_checkbox;

    @FindBy(xpath = "//div/button[text()=\"Sign Up\"]")
    WebElement signUp_button;

    public signUp() {
        PageFactory.initElements(getDriver(),this);
    }

    public void Click_on_sign_up_at_login_page() {
        sleep(5000);
        signUp_link.click();
        sleep(5000);
    }

    public void User_enters_firstname() {
        firstname_field.sendKeys("CRM");
    }

    public void User_enters_lastname() {
        lastname_field.sendKeys("Test");
    }

    public void User_enters_email_address() {
        work_email_field.sendKeys("assistive0427@gmail.com");
    }

    public void Click_on_terms_conditions_checkbox(){
        termsCheck_checkbox.click();
    }

    public void Click_on_sign_up_button() {
        signUp_button.click();
    }

    public void sleep(long s){
        try{
            Thread.sleep(s);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
