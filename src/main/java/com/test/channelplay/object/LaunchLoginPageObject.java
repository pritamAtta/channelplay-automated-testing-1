package com.test.channelplay.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.test.channelplay.utils.CommonUtils;
import com.test.channelplay.utils.Constants;
import com.test.channelplay.utils.DriverBase;

public class LaunchLoginPageObject extends DriverBase{
	
	@FindBy(xpath="//input[@placeholder=\"Username\"]")
	private WebElement userName;
	
	@FindBy(xpath="//input[@placeholder=\"Password\"]")
	private WebElement passWord;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement loginButton;
	
	@FindBy(xpath="//label[text()=\"The username or password you entered is incorrect. \"]")
	private WebElement validationMessage;
	
	public LaunchLoginPageObject() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void User_enter_user_name(String username) {
		userName.sendKeys(username);
	}
	
	public void Enter_password(String password) {
		passWord.sendKeys(password);
	}
	
	public void Select_login_button() {
		loginButton.click();
		sleep(3000);
	}
	
	public void User_will_be_on_project_list_screen() {
		Assert.assertTrue(getDriver().findElement(By.xpath("//li[@class=\"dropdown user\"]")).isDisplayed());
	}
	
	public void User_select_wrong_user_name_and_password() {
		userName.sendKeys("pritam@1channel.ai");
		passWord.sendKeys("12345");
	}
	
	public void Validation_message_will_show() {
		Assert.assertTrue(validationMessage.isDisplayed());
	}
	
	public static void sleep(long s) {
		try {
			Thread.sleep(s);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
