package Project1_Amazon_Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
WebDriver driver;   

@FindBy(id="nav-link-accountList-nav-line-1")
WebElement Account_Lists;

@FindBy(linkText="Start here.")
WebElement NewCustomer_Starthere_link;

@FindBy(linkText="Sign in")
WebElement Signin_button;

@FindBy(id="twotabsearchtextbox")
WebElement search_textfield;

@FindBy(xpath="//span[.='Manage Profiles']")
WebElement ManageProfiles_link;

@FindBy(linkText="View")
WebElement View_Profile;

@FindBy(id="nav-cart-count")
WebElement cart;

@FindBy(id="nav-orders")
WebElement Returns_Orders;

public void Account_List_HoverOver(WebDriver driver)
{
	Actions a1=new Actions(driver);
	a1.moveToElement(Account_Lists).perform();
}

public void NewCustomer_Starthere_link_click()
{
	NewCustomer_Starthere_link.click();
}


public void Signin_button_click()
{
	Signin_button.click();
}

public void search_textfield_search()
{
	search_textfield.sendKeys("shoe");
	search_textfield.sendKeys(Keys.ENTER);
}

public boolean search_textfield_display()
{
	return search_textfield.isDisplayed();
}

public void ManageProfiles_link_click()
{

	ManageProfiles_link.click();
}

public void ViewProfile_click()
{
	View_Profile.click();
}
public void carticon_click()
{
	cart.click();
}
public void Returns_Orders_click()
{
	Returns_Orders.click();
}
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


}
