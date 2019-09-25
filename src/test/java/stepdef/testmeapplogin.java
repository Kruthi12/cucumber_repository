package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testmeapplogin {
	WebDriver driver=null;
	@Given("^the login page is opened$")
	public void the_login_page_is_opened() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^User enters lalitha as username$")
	public void user_enters_lalitha_as_username() {
		
	    driver.findElement(By.name("userName")).sendKeys("lalitha");
	}

	@When("^User enters password(\\d+) as password$")
	public void user_enters_password_as_password(int arg1) {
	    driver.findElement(By.id("password")).sendKeys("password123");
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}

	@Then("^User will find testmeapp homepage$")
	public void user_will_find_testmeapp_homepage() {
	    driver.findElement(By.name("Login")).click();
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	    System.out.println("The title of the page is "+driver.getTitle());
	    //driver.findElement(By.linkText("SignOut")).click();
	}

}