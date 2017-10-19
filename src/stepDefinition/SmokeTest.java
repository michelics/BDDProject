package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
		
	WebDriver driver;
	
	@Given("^Open the Challenge Page$")
	public void Open_the_Contact_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\michelis\\eclipse-workspace\\DBBDD\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://eliasnogueira.com/arquivos_blog/selenium/desafio/4desafio/");
	}

	@When("^Fill the fields with valid value$")
	public void Fill_the_fields_with_valid_value() throws Throwable {
		driver.findElement(By.id("cep")).sendKeys("90610000");
		driver.findElement(By.id("rua")).sendKeys("Av. Ipiranga");
		driver.findElement(By.name("numero")).sendKeys("6681");
		driver.findElement(By.name("complemento")).sendKeys("Prédio 99 A, Sala 501");
		driver.findElement(By.id("bairro")).sendKeys("Partenon");
		driver.findElement(By.id("rua")).sendKeys("Av. Ipiranga");
		driver.findElement(By.id("cidade")).sendKeys("Porto Alegre");
		driver.findElement(By.id("estado")).sendKeys("RS");
	}

	@Then("^Clean the Page$")
	public void Page_should_show_Message_Sent() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"wrap\"]/div[2]/form/input")).click(); 
		tearDown();
	}
	
	@After
    public void tearDown() throws InterruptedException
    {
        driver.quit();
    }
	
}
