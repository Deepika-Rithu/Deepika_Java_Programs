package Project1_Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage 
{
	WebDriver driver;
	
	@FindBy(id="orderSummaryPrimaryActionBtn")
	WebElement usethisaddress_button;
	
	//@FindBy(xpath="(//span[.='Cash on Delivery/Pay on Delivery'])[2]")
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement Payment_CreditDebitCard;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement Payment_Netbanking;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
	WebElement Payment_OtherUPIApps;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement Payment_EMI;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[6]")
	WebElement Payment_CashOnDelivery;
	
	@FindBy(xpath="(//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent'])[1]")
	WebElement usethispayment_button;
	
	@FindBy(id="spc-gcpromoinput")
	WebElement couponcode_textfield;
	
	@FindBy(id="gcApplyButtonId-announce")
	WebElement couponcode_apply_button;
	
	@FindBy(id="payChangeButtonId")
	WebElement ChangePaymentMethod;
	
	@FindBy(id="submitOrderButtonId")
	WebElement placeorder_button;
	
	public void usethisaddress_button_click()
	{
		usethisaddress_button.click();
	}
	public void Payment_CreditDebitCard_select()
	{
		Payment_CreditDebitCard.click();
	}
	public void Payment_Netbanking_select()
	{
		Payment_Netbanking.click();
	}
	public void Payment_OtherUPIApps_select()
	{
		Payment_OtherUPIApps.click();
	}
	public void Payment_EMI_select()
	{
		Payment_EMI.click();
	}
	
	public void Payment_CashOnDelivery_select()
	{
		Payment_CashOnDelivery.click();
	}
	public void usethispayment_button_click()
	{
		usethispayment_button.click();
	}
	public boolean usethispayment_button_display()
	{
		return usethispayment_button.isDisplayed();
	}
	public void enter_couponcode()
	{
		couponcode_textfield.sendKeys("gwsdf^&53243@ggd");
	}
	public boolean couponcode_textfield_display()
	{
		return couponcode_textfield.isDisplayed();
	}
	public void couponcode_apply_button_click()
	{
		couponcode_apply_button.click();
	}
	public void ChangePaymentMethod_click()
	{
		ChangePaymentMethod.click();
	}
	public boolean placeorder_button_display()
	{
		return usethisaddress_button.isDisplayed();
	}
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
}
