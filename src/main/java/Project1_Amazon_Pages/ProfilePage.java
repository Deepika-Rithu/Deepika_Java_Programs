package Project1_Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage
{
WebDriver driver;

@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[1]")
WebElement Preferred_Department;

@FindBy(xpath="(//button[@class='attribute-action'])[1]") 
WebElement Preferred_Department_Add_Button;

@FindBy(xpath="//button[.='Women']")
WebElement Preferred_Department_Women; 

@FindBy(xpath="(//span[.='Save'])[1]")
WebElement Preferred_Department_Save_Button;

@FindBy(xpath="//div[.='Age group']")
WebElement Agegroup;

@FindBy(xpath="(//button[@class='attribute-action'])[3]")
WebElement Agegroup_EditButton;

@FindBy(xpath="//button[.='30-34']")
WebElement Agegroup_value; 

@FindBy(xpath="(//span[.='Save'])[1]")	
WebElement Agegroup_Save_Button;

@FindBy(xpath="(//button[@class='attribute-action'])[1]")
WebElement EditButton;


public void Preferred_Department_select()
{
	Preferred_Department.click();
}
public void Preferred_Department_Add_Button_click()
{
	Preferred_Department_Add_Button.click();
}
public void Preferred_Department_Women_click()
{
	Preferred_Department_Women.click();
}
public String Preferred_Department_Women_selectedtext()
{
	 return Preferred_Department_Women.getText();
}
public void Preferred_Department_Save_Button_click()
{
	Preferred_Department_Save_Button.click();
}

public void Agegroup_select()
{
	Agegroup.click();
}
public void Agegroup_EditButton_click()
{
	Agegroup_EditButton.click();
}
public void Agegroup_value_click()
{
	Agegroup_value.click();
	
}
public String Agegroup_value_selectedtext()
{
	 return Agegroup_value.getText();
	
}

public void Agegroup_Save_Button_click()
{
	Agegroup_Save_Button.click();
}


public ProfilePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
}
