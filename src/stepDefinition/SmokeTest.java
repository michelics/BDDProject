package stepDefinition;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
		
	WebDriver driver;
	
	@Given("^Open the Contact Page$")
	public void Open_the_Contact_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\michelis\\eclipse-workspace\\DBBDD\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.dbserver.com.br/contato.html");
	}

	@When("^Fill the fields with valid value$")
	public void Fill_the_fields_with_valid_value() throws Throwable {
		driver.findElement(By.name("name")).sendKeys("test");
		driver.findElement(By.name("email")).sendKeys("test");
		driver.findElement(By.id("textAssunto")).sendKeys("test");
		driver.findElement(By.id("message")).sendKeys("test");
	}

	@Then("^Page should show Message Sent$")
	public void Page_should_show_Message_Sent() throws Throwable {
		tearDown();
	}
	
	@After
    public void tearDown() throws InterruptedException
    {
        driver.quit();
    }
	
}
