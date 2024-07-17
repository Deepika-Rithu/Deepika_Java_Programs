package Project1_Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage
{
	WebDriver driver;

	@FindBy(name="proceedToRetailCheckout")
	WebElement ProceedToBuy;
	
	@FindBy(id="sw-gtc")
	WebElement GoToCart;
	
	@FindBy(xpath="//div[@class='a-row sc-cart-header sc-compact-bottom']")
	WebElement ShoppingCart_header;
	
	@FindBy(name="quantity")
	WebElement quantity;
	
	@FindBy(xpath="(//input[@value='Delete'])[2]")
	WebElement delete_second_product;
	
	public void ProceedToBuy()
	{
		ProceedToBuy.click();
	}
	public void GoToCart()
	{
		GoToCart.click();
	}
	public void quantity_selection()
	{
		Select s1=new Select(quantity);
		s1.selectByValue("2");
	}
	public String quantity_selection_getdropdowntext()
	{
		Select s1=new Select(quantity);
		s1.selectByValue("2");
		WebElement selectedOption = s1.getFirstSelectedOption();
		return selectedOption.getText();
	}
	public void delete_second_product()
	{
		delete_second_product.click();
	}
	public boolean ShoppingCart_Display()
	{
		return ShoppingCart_header.isDisplayed();
	}
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
