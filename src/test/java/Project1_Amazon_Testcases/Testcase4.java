package Project1_Amazon_Testcases;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project1_Amazon_Pages.HomePage;
import Project1_Amazon_Pages.LoginPage;
import Project1_Amazon_Pages.ProfilePage;

public class Testcase4 
{
	@Test
public void Edit_Profile() throws InterruptedException
{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		HomePage h1=new HomePage(driver);
		h1.Account_List_HoverOver(driver);
		h1.Signin_button_click();
		LoginPage l1=new LoginPage(driver);
		l1.un();
		l1.continue_button1_click();
		l1.pwd_textfield();
		l1.signin_button_click();
		
		h1.Account_List_HoverOver(driver);
		h1.ManageProfiles_link_click();
		h1.ViewProfile_click();
		
		ProfilePage p1=new ProfilePage(driver);
		p1.Preferred_Department_select();
		
		p1.Preferred_Department_Add_Button_click();
		p1.Preferred_Department_Women_click();
		p1.Preferred_Department_Save_Button_click();
		Assert.assertEquals(p1.Preferred_Department_Women_selectedtext(), "Women","Preferred department not selected");
		Thread.sleep(3000);
		p1.Agegroup_select();
		Thread.sleep(3000);
		p1.Agegroup_EditButton_click();
		Thread.sleep(3000);
		p1.Agegroup_value_click();
		Thread.sleep(3000);
		p1.Agegroup_Save_Button_click();
		Assert.assertEquals(p1.Agegroup_value_selectedtext(), "30-34","Edited age value is not saved");
		}
}
