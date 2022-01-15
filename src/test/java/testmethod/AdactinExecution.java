package testmethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pagefactory.PageRepository ;

public class AdactinExecution extends Baseclass {
public static PageRepository pr;
	
	@Parameters("url")
	@BeforeClass
	public void beforeMethod(String url) throws InterruptedException {
		System.out.println("This is my Before Method");
		pr =new  PageRepository(driver);
		driver.get(url);
		Thread.sleep(2000);
//		
	}
	
	
	@Test
	public void loginWithValidCredentias() {
		System.out.println("Test Method");
		typeData(pr.getAl().getUsername(), "rajkamal");
		typeData(pr.getAl().getPassword(), "kamal1611");
		click(pr.getAl().getLoginBtn());
	
	}
	
	@Test
	public void loginWithInValidCredentias() {
		System.out.println("Test Method");
		typeData(pr.getAl().getUsername(), "rajkamal");
		typeData(pr.getAl().getPassword(), "");
		click(pr.getAl().getLoginBtn());
		
	}
	
	
}
