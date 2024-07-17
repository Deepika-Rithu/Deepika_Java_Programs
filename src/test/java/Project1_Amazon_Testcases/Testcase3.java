package Project1_Amazon_Testcases;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project1_Amazon_Pages.HomePage;
import Project1_Amazon_Pages.LoginPage;

public class Testcase3
{
	@Test
	public void Login_Failure()
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
		l1.incorrect_pwd_textfield();
		l1.signin_button_click();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
	}
}
