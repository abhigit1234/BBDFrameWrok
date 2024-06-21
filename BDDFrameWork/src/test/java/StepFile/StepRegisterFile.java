package StepFile;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import BaseFile.BaseClass;
import PageObjectModel.POM;
import Utilities.ReadConfig;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepRegisterFile extends BaseClass{
	
	@Before
	public void setup() {
		
		rc = new ReadConfig();
		switch (rc.browser()) {
		case "chrome":driver = new ChromeDriver();break;
		case "edge":driver = new EdgeDriver();break;
		case "firefox":driver = new FirefoxDriver();break;
		default:driver=null;break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@After
	public void tesr(Scenario s) {
		if(s.isFailed()) {
		byte[] arr =		((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		s.attach(arr, "image/png", s.getName());
		
		}
		driver.close();
	}
	
	@Given("launch browser")
	public void launch_browser() {
		pom = new POM(driver);
	}

	@When("user enters url as {string}")
	public void user_enters_url_as(String url) {
		driver.get(url);
	}
	
	@Then("user enters firstname as {string} {string} {string} {string}")
	public void user_enters_firstname_as(String fn, String ln, String email, String pswd) {
		pom.setFirstName(fn);
		pom.setLastName(ln);
		pom.setEmail(rc.email());
		pom.setPassword(pswd);	
	}
	
	@Then("user enter fields as")
	public void user_enter_fields_as(DataTable d) {
		List<Map<String,String>> map1 = 	d.asMaps();
		
		pom.setFirstName(map1.get(0).get("firstname"));
		pom.setLastName(map1.get(0).get("lastname"));
		pom.setEmail(rc.email());
		pom.setPassword(map1.get(0).get("password"));
	}		


		@Then("user enter fields into")
		public void user_enter_fields_into(DataTable d) {
			
		Map<String,String> map2 = 	d.asMap();
		pom.setFirstName(map2.get("firstname"));
		pom.setLastName(map2.get("lastname"));
		pom.setEmail(rc.email());
		pom.setPassword(map2.get("password"));	
	
		
		}		
		
	

	
	@Then("user enter firstname as {string}")
	public void user_enter_firstname_as(String fname) {
		pom.setFirstName(fname);
	}

	@Then("user enter lastname as {string}")
	public void user_enter_lastname_as(String lname) {
		pom.setLastName(lname);
	}

	@Then("user enter email")
	public void user_enter_email(){
		pom.setEmail(rc.email());
	}
	

	@Then("user enter password as {string}")
	public void user_enter_password_as(String pswd) {
		pom.setPassword(pswd);
	}

	@Then("user clicks on slide bar to agree")
	public void user_clicks_on_slide_bar_to_agree() {
		pom.clkPriPolicy();
	}

	@Then("user clicks on continue button")
	public void user_clicks_on_continue_button()throws Exception {
		pom.clkContBtn();
		
	}

	@Then("verify message as {string}")
	public void verify_message_as(String exp)throws Exception {
		pom.verifyMessage(exp);
		
	}

	
	
	@Then("User clicks on continue")
	public void user_clicks_on_continue() {	
		pom.clkContBtnFinal();
	}

	@Then("user clicks on logout button")
	public void user_clicks_on_logout_button() {
		pom.clkLogOutBtn();
	}


}
