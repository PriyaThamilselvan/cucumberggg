package pack4;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class cls4 {
	WebDriver driver;
	

	@Given("the user has to click the Search feature")
	public void the_user_has_to_click_the_Search_feature() {
		System.out.println("Exciting");
		   System.setProperty("webdriver.chrome.driver", "C:\\Priya\\Drivers\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.get("http://10.232.237.143:443/TestMeApp/");
			  driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();

	}


	@Then("the user has to enter as {string} in the field")
	public void the_user_has_to_enter_as_in_the_field(String string) {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
	}

	@Then("the user has to click the Find Details button")
	public void the_user_has_to_click_the_Find_Details_button() {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("the user has to click Add To Cart")
	public void the_user_has_to_click_Add_To_Cart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@Then("the user has to click the cart button")
	public void the_user_has_to_click_the_cart_button() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	}
	
	@Then("the user has to check whether the login is displayed")
	public void the_user_has_to_check_whether_the_login_is_displayed() {
	   Assert.assertEquals("Login", driver.getTitle());
	   System.out.println("Successful");
	}
	
	
}
