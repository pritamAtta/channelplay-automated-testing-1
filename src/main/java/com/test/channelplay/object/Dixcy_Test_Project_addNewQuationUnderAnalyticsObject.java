package com.test.channelplay.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.channelplay.utils.Constants;
import com.test.channelplay.utils.DriverBase;

public class Dixcy_Test_Project_addNewQuationUnderAnalyticsObject extends DriverBase{
	
	@FindBy(xpath="//input[@placeholder=\"Username\"]")
	private WebElement userName;
	
	@FindBy(xpath="//input[@placeholder=\"Password\"]")
	private WebElement passWord;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement loginButton;
	
	@FindBy(xpath="//ul[@class=\"page-sidebar-menu\"]/li[4]")
	private WebElement analyticsMenu;
	
	@FindBy(xpath = "//ul[@class=\"page-sidebar-menu\"]/li[4]/ul/li[2]")
	private WebElement quation;
	
	@FindBy(xpath = "//a[@onclick=\"createQuotations(0);\"]")
	private WebElement addQuationButton;
	
	
	
	@FindBy(xpath = "//input[@placeholder=\"Enter Sold to Name\"]")
	private WebElement sold_to_name_field;
	
	@FindBy(xpath = "//input[@placeholder=\"Enter Ship to Name\"]")
	private WebElement ship_to_name_field;
	
	
	@FindBy(xpath = "//b[text()=\"Sold to Address\"]/parent::label/following-sibling::div//input")
	private WebElement sold_to_address_field_one;
	
	@FindBy(xpath = "//b[text()=\"Ship to Address\"]/ancestor::div[2]/following-sibling::div[1]/div[1]//input")
	private WebElement sold_to_address_field_two;
	
	@FindBy(xpath = "//b[text()=\"Ship to Address\"]/ancestor::div[2]/following-sibling::div[2]/div[1]//input")
	private WebElement sold_to_address_field_three;
	
	
	@FindBy(xpath = "//b[text()=\"Ship to Address\"]/parent::label/following-sibling::div//input")
	private WebElement ship_to_address_field_one;
	
	@FindBy(xpath = "//b[text()=\"Ship to Address\"]/ancestor::div[2]/following-sibling::div[1]/div[2]//input")
	private WebElement ship_to_address_field_two;
	
	@FindBy(xpath = "//b[text()=\"Ship to Address\"]/ancestor::div[2]/following-sibling::div[2]/div[2]//input")
	private WebElement ship_to_address_field_three;
	
	
	@FindBy(xpath = "//b[text()=\"Shipping Condition\"]/parent::label/following-sibling::div/select")
	private WebElement shipping_condition_dropdown;
	
	@FindBy(xpath = "//b[text()=\"Project Type\"]/parent::label/following-sibling::div/select")
	private WebElement project_type_dropdown;
	
	@FindBy(xpath = "//b[text()=\"Supplying Plant\"]/parent::label/following-sibling::div/select")
	private WebElement supplying_plant_dropdown;
	
	@FindBy(xpath = "//b[text()=\"Site Distance from Supplying Plant (KM)\"]/parent::label/following-sibling::div//input")
	private WebElement site_distance_from_supplyingPlant_field;
	
	@FindBy(xpath = "//b[text()=\"Pump Required\"]/parent::label/following-sibling::div/select")
	private WebElement pumpRequired_dropdown;
	
	@FindBy(xpath = "//b[text()=\"Customer Name\"]/parent::label/following-sibling::div/input")
	private WebElement customerName_field;
	
	@FindBy(xpath = "//b[text()=\"Customer Contact Number\"]/parent::label/following-sibling::div/input")
	private WebElement customerContactNo;
	
	Constants constants = new Constants();
	
	public void Input_values_in_all_fields() {
		sold_to_name_field.sendKeys("Palam Group of Industry");
		ship_to_name_field.sendKeys("Panagarh Transport");
		
		sold_to_address_field_one.sendKeys("Bidhan Nagar");
		sold_to_address_field_two.sendKeys("Sector III");
		sold_to_address_field_three.sendKeys("Kolkata");
		
		ship_to_address_field_one.sendKeys("Udaynagar");
		ship_to_address_field_two.sendKeys("Sector 1");
		ship_to_address_field_three.sendKeys("Delhi");
		
		shipping_condition_dropdown.click();
		sleep(2000);
		getDriver().findElement(By.xpath("//b[text()=\"Shipping Condition\"]/parent::label/following-sibling::div/select/option[2]")).click();
		
		project_type_dropdown.click();
		sleep(2000);
		getDriver().findElement(By.xpath("//b[text()=\"Project Type\"]/parent::label/following-sibling::div/select/option[2]")).click();
		
		supplying_plant_dropdown.click();
		sleep(2000);
		getDriver().findElement(By.xpath("//b[text()=\"Supplying Plant\"]/parent::label/following-sibling::div/select/option[2]")).click();
		
		site_distance_from_supplyingPlant_field.sendKeys("200");
		
		pumpRequired_dropdown.click();
		sleep(2000);
		getDriver().findElement(By.xpath("//b[text()=\"Pump Required\"]/parent::label/following-sibling::div/select/option[2]")).click();
		
		customerName_field.sendKeys("Arindam Guha");
	}
	
	public Dixcy_Test_Project_addNewQuationUnderAnalyticsObject() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void login(String user_name, String pass_word) {
		userName.sendKeys(user_name);
		passWord.sendKeys(pass_word);
		loginButton.click();
		sleep(4000);
		getDriver().findElement(By.xpath(constants.project_xpath)).click();
		sleep(5000);
	}
	
	public void Select_analytics() {
		analyticsMenu.click();
		sleep(5000);
	}
	
	public void Select_quation() {
		quation.click();
		sleep(4000);
	}
	
	public void User_select_add_button() {
		addQuationButton.click();
		sleep(4000);
	}
	
	
	public void sleep(long s) {
		try {
			Thread.sleep(s);
		} catch(InterruptedException c) {
			c.printStackTrace();
		}
	}

}


