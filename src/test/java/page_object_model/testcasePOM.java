package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcasePOM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		pageclass pobject=new pageclass(driver);
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		pobject.clicklink();
		String username=null;
		pobject.typeuname(username);
		String password=null;
		pobject.typepassword(password);
		pobject.clickonloginlyn();
		System.out.println("Title of the page is "+driver.getTitle());
	}

}
