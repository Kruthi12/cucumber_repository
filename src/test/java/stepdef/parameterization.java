package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class parameterization {
	WebDriver driver=null;
	@Given("^user opens the application$")
	public void user_opens_the_application() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.manage().window().maximize();
	}

	@When("^user click on signin link$")
	public void user_click_on_signin_link() {
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) {
	    driver.findElement(By.name("userName")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.name("Login")).click();
	}

	@Then("^message displayed login successful$")
	public void message_displayed_login_successful() {
	    driver.close();
	    System.out.println("Login successful");
	}
}