package Project1_Amazon_Testcases;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project1_Amazon_Pages.HomePage;
import Project1_Amazon_Pages.LoginPage;
import Project1_Amazon_Pages.OrdersPage;

public class Testcase14 
{
	@Test
	public void Product_Rating()
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
			h1.Returns_Orders_click();
			OrdersPage op=new OrdersPage(driver);
			op.filter_time();
			op.product_review_click();
			op.fivestar_click();
			Assert.assertEquals(op.rating_submitted_displayed(),true);
	}
}
