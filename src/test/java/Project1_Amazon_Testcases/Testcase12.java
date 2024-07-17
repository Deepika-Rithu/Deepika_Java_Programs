package Project1_Amazon_Testcases;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project1_Amazon_Pages.CheckoutPage;
import Project1_Amazon_Pages.HomePage;
import Project1_Amazon_Pages.LoginPage;
import Project1_Amazon_Pages.ProductPage;
import Project1_Amazon_Pages.SearchResultPage;
import Project1_Amazon_Pages.ShoppingCartPage;

public class Testcase12 
{
	@Test
	public void CheckEachPaymentMethod()
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
			s1.firstproduct_click();
			Set<String> s2=driver.getWindowHandles();
			Iterator<String> pcid=s2.iterator();
			pcid.next();
			String childid=pcid.next();
			driver.switchTo().window(childid);
			ProductPage pp=new ProductPage(driver);
			pp.add_to_cart();
			ShoppingCartPage sc=new ShoppingCartPage(driver);
			sc.ProceedToBuy();
			CheckoutPage cp=new CheckoutPage(driver);
			cp.usethisaddress_button_click();
			cp.Payment_CreditDebitCard_select();
			cp.Payment_Netbanking_select();
			cp.Payment_OtherUPIApps_select();
			cp.Payment_EMI_select();
			cp.Payment_CashOnDelivery_select();
			Assert.assertEquals(cp.usethispayment_button_display(), true);
	}
	
}
