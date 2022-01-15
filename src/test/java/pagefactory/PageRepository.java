package pagefactory;

import org.openqa.selenium.WebDriver;

import baseclass.Baseclass;


public class PageRepository extends Baseclass {
	
	private AdactinLoginPage al;


	public AdactinLoginPage getAl() {
		if (al==null) {
			al = new AdactinLoginPage(driver);
		}
		return al;
	}
	
	public PageRepository(WebDriver fdriver) {
		this.driver=fdriver;
	}
	
	
	

}
