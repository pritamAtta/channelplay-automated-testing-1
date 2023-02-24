package com.test.channelplay.object;

import com.test.channelplay.utils.DriverBase;
import com.test.channelplay.utils.GetProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v84.memory.Memory;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class forgot_Password extends DriverBase {

    @FindBy(xpath = "//div/a[@id=\"kt_login_forgot\"]")
    WebElement forgot_pass_link;

    @FindBy(xpath = "//div/h3[text()=\"Reset Password\"]")
    WebElement reset_pass_text;

    @FindBy(xpath = "//div[@class=\"mat-form-field-infix\"]/input[@formcontrolname=\"email\"]")
    WebElement email_field;

    @FindBy(xpath = "//button[text()=\"Submit\"]")
    WebElement submit_button;

    @FindBy(xpath = "//div/button/span[@class=\"mat-button-wrapper\" and text()=\"Okay\"]")
    WebElement confirm_popup_message;

    @FindBy(xpath = "//div/table[@class=\"table-striped jambo_table\"]/tbody/tr/td[contains(text(), 'Reset Your 1Channel Password')]")
    WebElement mail_verify;

    @FindBy(xpath = "//div[@class=\"tab-pane fade m-b-20 show active\"]/iframe[@id=\"html_msg_body\"]")
    WebElement iframe_element;

    @FindBy(xpath = "//a[text()='Reset Password' and @target='_other']")
    WebElement reset_pass_link_email_verify;

    @FindBy(xpath = "//div[@class=\"mat-form-field-infix\"]/input[@id=\"mat-input-0\"]")
    WebElement reset_pass_username;

    @FindBy(xpath = "//div[@class=\"mat-form-field-wrapper\"]/div/div[@class=\"mat-form-field-infix\"]/input[@formcontrolname=\"password\"]")
    WebElement password_field;

    @FindBy(xpath = "//div[@class=\"mat-form-field-infix\"]/input[@placeholder=\"Confirm Password\"]")
    WebElement confirm_password_field;

    @FindBy(xpath = "//button[text()=\"Sign In\"]")
    WebElement signIn_button_newPass;

    @FindBy(xpath = "//input[@id='mat-input-0']")
    WebElement login_usrname_field;

    @FindBy(xpath = "//input[@id='mat-input-1']")
    WebElement login_passwd_field;

    @FindBy(id = "kt_login_signin_submit")
    WebElement login_button;


    Actions action = new Actions(getDriver());

    public forgot_Password() {
        PageFactory.initElements(getDriver(), this);
    }

    public void Click_on_forgot_password_link() {
        forgot_pass_link.click();
    }

    public boolean Validate_forgot_pass_title() {
        boolean reset_pass_title = reset_pass_text.isDisplayed();
        return reset_pass_title;
    }

    public void User_enters_email_id_at_reset_password_page() {
        email_field.sendKeys(GetProperty.value("username"));
    }

    public void Click_on_submit_button() {
        submit_button.click();
    }

    public void Click_on_okay_link_over_pop_up_message() {
        confirm_popup_message.click();
        sleep(5000);
    }

    public void Navigate_to_verify_email_link() {
        mail_verify.click();
    }

    public void Click_on_the_reset_password_link_received_over_mail() {
        getDriver().switchTo().frame(iframe_element);
        sleep(3000);
        reset_pass_link_email_verify.click();
        sleep(3000);
        getDriver().switchTo().defaultContent();
    }

    public void Enter_new_password_under_confirm_password_and_click_on_SignIn_button() {
        String parent = getDriver().getWindowHandle();

        System.out.println("parent window: " + parent);

        Set<String> allWinhandles = getDriver().getWindowHandles();
        List<String> tabs = new ArrayList<String>(allWinhandles);

        getDriver().switchTo().window(tabs.get(1));

        System.out.println(getDriver().getCurrentUrl());
        sleep(3000);
        password_field.sendKeys(GetProperty.value("forgot_pass_new"));
        confirm_password_field.sendKeys(GetProperty.value("forgot_pass_new"));
        sleep(3000);
        signIn_button_newPass.click();
        sleep(3000);
    }

    public void Validate_reset_pass_userName() {
        String reset_pass_userName = reset_pass_username.getAttribute("value");
        Assert.assertEquals(reset_pass_userName, GetProperty.value("username"));
/*        if (reset_pass_username.isDisplayed()) {
            System.out.println(reset_pass_username);
        }*/
    }

    public void Enter_user_email_and_new_password_at_login_page_and_click_on_signin_button() {
        sleep(3000);
        getDriver().navigate().to(GetProperty.value("appUrl"));
        login_usrname_field.sendKeys(GetProperty.value("username"));
        login_passwd_field.sendKeys(GetProperty.value("forgot_pass_new"));
        login_button.click();
        sleep(6000);
    }


    public void sleep(long s) {
        try {
            Thread.sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
