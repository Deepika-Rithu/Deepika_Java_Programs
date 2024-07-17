package Project1_Amazon_Testcases;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project1_Amazon_Pages.HomePage;
import Project1_Amazon_Pages.RegistrationPage;

public class Testcase1 
{
@Test
public void Registration()
	{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	HomePage h1=new HomePage(driver);
	h1.Account_List_HoverOver(driver);
	h1.NewCustomer_Starthere_link_click();
	RegistrationPage r1=new RegistrationPage(driver);
	r1.username_textfield_sendusername();
	r1.continue_button1_click();
	r1.name_textfield_sendname();
	r1.mobno_textfield_sendmobno();
	r1.pwd_textfield_sendpwd();
	r1.verifymobno_button_click();
	r1.otp_sendotp();
	r1.createaccount_button_click();
	Assert.assertEquals(r1.createaccount_button_display(), true,"Registration not successful");
	}
}
