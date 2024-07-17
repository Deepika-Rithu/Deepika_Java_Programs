package Project1_Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrdersPage
{
WebDriver driver;
	
	@FindBy(id="time-filter")
	WebElement Time_Filter;
	
	@FindBy(id="a-autoid-4")
	WebElement product_review;
	
	@FindBy(xpath="(//button[@class='ryp__star__button'])[5]")
	WebElement fivestar_rating;
	
	@FindBy(xpath="(//span[.='Clear'])[2]")
	WebElement submitted_rating;
	
	public void filter_time()
	{
		Select s1=new Select(Time_Filter);
		s1.selectByValue("year-2024");
	}
	public void product_review_click()
	{
		product_review.click();
	}
	public void fivestar_click()
	{
		fivestar_rating.click();
	}
	public boolean rating_submitted_displayed()
	{
		return submitted_rating.isDisplayed();
	}
	public OrdersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
