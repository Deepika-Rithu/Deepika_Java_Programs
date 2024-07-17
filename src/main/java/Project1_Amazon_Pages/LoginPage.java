package Project1_Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	WebDriver driver;
	
	@FindBy(id="ap_email_login")
	WebElement username_textfield;
	
	@FindBy(id="continue")
	WebElement continue_button1;
	
	@FindBy(id="ap_password")
	WebElement pwd_textfield;
	
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	public void un()
	{
		username_textfield.sendKeys("9965463818");
	}
	public void continue_button1_click()
	{
		continue_button1.click();
	}
	public void pwd_textfield()
	{
		                                                                                           pwd_textfield.sendKeys("Deepika@27");
	}
	public void incorrect_pwd_textfield()
	{
		                                                                                           pwd_textfield.sendKeys("Deepika@123");
	}
	public void signin_button_click()
	{
		signin_button.click();
	}

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}

