package Project1_Amazon_Testcases;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project1_Amazon_Pages.HomePage;
import Project1_Amazon_Pages.ProductPage;
import Project1_Amazon_Pages.SearchResultPage;
import Project1_Amazon_Pages.ShoppingCartPage;

public class Testcase15
{
	@Test
	public void CartPage_WithoutLogin()
	{
			ChromeDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in");
			HomePage h1=new HomePage(driver);
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
			sc.GoToCart();
			Assert.assertEquals(sc.ShoppingCart_Display(),true);
	}
}
