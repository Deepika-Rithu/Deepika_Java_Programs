package Project1_Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchResultPage 
{
	WebDriver driver;
	
@FindBy(linkText="Girls' Sports & Outdoor Shoes")
WebElement Category;

@FindBy(linkText="Girls' Running Shoes")
WebElement Option_under_selected_category;

@FindBy(id="p_36/range-slider_slider-item")
//input[@aria-valuetext='₹750']
WebElement PriceSlider;

@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[21]")
WebElement Material;

@FindBy(id="s-result-sort-select")
WebElement Sort_by;

@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
WebElement first_product;


public void Category_Selection()
{
	Category.click();
}
public boolean Option_under_selected_category_display()
{
	return Option_under_selected_category.isDisplayed();
}

public void Material_Selection()
{
	Material.click();
}
public String Material_Selection_gettext()
{
	return Material.getText();
}
public void Sort_by_price()
{
	Select s1=new Select(Sort_by);
	s1.selectByValue("price-asc-rank");
}
public String Sort_by_price_getdropdowntext()
{
	Select s1=new Select(Sort_by);
	s1.selectByValue("price-asc-rank");
	WebElement selectedOption = s1.getFirstSelectedOption();
	return selectedOption.getText();
}
public void Sort_by_rating()
{
	Select s1=new Select(Sort_by);
	s1.selectByValue("review-rank");
}
public String Sort_by_rating_getdropdowntext()
{
	Select s1=new Select(Sort_by);
	s1.selectByValue("review-rank");
	WebElement selectedOption = s1.getFirstSelectedOption();
	return selectedOption.getText();
}
public String Sort_by_relevance_getdropdowntext()
{
	Select s1=new Select(Sort_by);
	s1.selectByValue("relevanceblender");
	WebElement selectedOption = s1.getFirstSelectedOption();
	return selectedOption.getText();
}
public void Sort_by_relevance()
{
	Select s1=new Select(Sort_by);
	s1.selectByValue("relevanceblender");
}
public void firstproduct_click()
{
	first_product.click();
	
}

public SearchResultPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


}
