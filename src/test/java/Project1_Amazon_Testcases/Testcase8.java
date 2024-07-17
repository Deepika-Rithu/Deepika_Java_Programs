package Project1_Amazon_Testcases;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project1_Amazon_Pages.HomePage;
import Project1_Amazon_Pages.LoginPage;
import Project1_Amazon_Pages.SearchResultPage;

public class Testcase8 
{
	@Test
	public void Sort_Product_Byprice_Byrelevance_Byrating() throws InterruptedException 
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
			h1.search_textfield_search();
			SearchResultPage s1=new SearchResultPage(driver);
			s1.Sort_by_price();
			Assert.assertEquals(s1.Sort_by_price_getdropdowntext(), "Price: Low to High", "Dropdown value is not as expected");
			Thread.sleep(2000);
			s1.Sort_by_rating();
			Assert.assertEquals(s1.Sort_by_rating_getdropdowntext(), "Avg. Customer Review", "Dropdown value is not as expected");
			Thread.sleep(2000);
			s1.Sort_by_relevance();
			Assert.assertEquals(s1.Sort_by_relevance_getdropdowntext(), "Featured", "Dropdown value is not as expected");
	}
}
