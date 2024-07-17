package Project1_Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage
{
	WebDriver driver;
	@FindBy(xpath="(//span[@class='a-price-whole'])[1]")
	WebElement Price;
	@FindBy(id="averageCustomerReviews_feature_div")
	WebElement Review;
	@FindBy(xpath="//h2[@class='softlines']")
	WebElement Description;
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement wishlist_button;
	@FindBy(id="add-to-cart-button")
	WebElement addtocart_button;
	
	public boolean price_display()
	{
		return Price.isDisplayed();
	}
	public boolean review_display()
	{
		return Review.isDisplayed();
	}
	public boolean description_display()
	{
		return Description.isDisplayed();
	}
	public void add_to_wishlist()
	{
		wishlist_button.click();
	}
	public void add_to_cart()
	{
		addtocart_button.click();
	}
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
