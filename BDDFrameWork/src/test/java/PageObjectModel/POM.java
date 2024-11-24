
package PageObjectModel;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseFile.BaseClass;

public class POM extends BaseClass {

	public POM(WebDriver driver) {
		this.driver = driver;
		this.jse = (JavascriptExecutor) this.driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "input-firstname")
	WebElement firstName;

	@FindBy(id = "input-lastname")
	WebElement lastName;

	@FindBy(id = "input-email")
	WebElement email;

	@FindBy(id = "input-password")
	WebElement password;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement priPolicy;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement clkContinueBtn;

	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	WebElement verify;

	@FindBy(linkText = "Continue")
	WebElement clkContBtn;

	@FindBy(linkText = "Logout")
	WebElement clkLogoutBtn;

	public void setFirstName(String fn) {
		firstName.sendKeys(fn);
	}

	public void setLastName(String ln) {
		lastName.sendKeys(ln);
	}

	public void setEmail(String em) {

		email.sendKeys(em);
	}

	public void setPassword(String pswd) {
		password.sendKeys(pswd);
	}

	public void clkPriPolicy() {

		jse.executeScript("arguments[0].click()", priPolicy);
	}

	public void clkContBtn() {

		jse.executeScript("arguments[0].click()", clkContinueBtn);
	}

	public void verifyMessage(String exp) {
		String act = verify.getText();
		assertEquals(act, exp);
	}

	public void clkContBtnFinal() {
		jse.executeScript("arguments[0].click()", clkContBtn);
	}

	public void clkLogOutBtn() {

		jse.executeScript("arguments[0].click()", clkLogoutBtn);
	}
}