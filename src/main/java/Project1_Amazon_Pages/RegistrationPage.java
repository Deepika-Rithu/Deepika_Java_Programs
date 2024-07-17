package Project1_Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage
{
	WebDriver driver;
@FindBy(id="ap_email_login")
WebElement username_textfield;

@FindBy(id="continue")
WebElement continue_button1;

@FindBy(id="intention-submit-button-announce")
WebElement proceed_to_create_account_button;

@FindBy(id="ap_phone_number")
WebElement mobno_textfield;

@FindBy(id="ap_customer_name")
WebElement name_textfield;

@FindBy(id="ap_password")
WebElement pwd_textfield;

@FindBy(id="continue")
WebElement verifymobno_button;

@FindBy(id="auth-pv-enter-code")
WebElement otp;

@FindBy(id="auth-verify-button")
public WebElement createaccount_button;

public void username_textfield_sendusername()
{
	username_textfield.sendKeys("deepivicky2722@gmail.com");

}

public void continue_button1_click()
{
	continue_button1.click();

}
public void proceed_to_create_account_button_click()
{
	proceed_to_create_account_button.click();

}
public void mobno_textfield_sendmobno()
{
	mobno_textfield.sendKeys("8220235790");

}
public void name_textfield_sendname()
{
	name_textfield.sendKeys("Deepika");

}
public void pwd_textfield_sendpwd()
{
	pwd_textfield.sendKeys("Deepika@27");

}
public void verifymobno_button_click()
{
	verifymobno_button.click();

}
public void otp_sendotp()
{
	otp.sendKeys("123456");

}
public void createaccount_button_click()
{
	createaccount_button.click();

}
public boolean createaccount_button_display()
{
	return createaccount_button.isDisplayed();
}
public RegistrationPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
