package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;



public class AdactinLoginPage extends Baseclass{

	
	// @FindBy, @FindBys, @FindAll
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@id=\"login\"]")
	private WebElement loginBtn;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
//	public AdactinLoginPage() {
//		PageFactory.initElements(driver, this);
//	}
	
	public AdactinLoginPage(WebDriver fdriver) {
		this.driver = fdriver;
		PageFactory.initElements(driver, this);
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	// && - operator - @FindBys this works only when both the conditions met
//	
//	@FindBys({
//		@FindBy(id="username"),
//		@FindBy(name="username")
//	})
//	private WebElement usernameBys;
//	
//	// || - operator - @FindAll this works either one conditions met
//		
//	@FindAll({
//		@FindBy(id="username"),
//		@FindBy(name="username")
//	})
//	private WebElement usernameAll;
	

