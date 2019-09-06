package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lognewcls {
	WebDriver driver;
	
	
	@Given("to check the login")
	public void to_check_the_login() {
	   System.out.println("Exciting");
	   System.setProperty("webdriver.chrome.driver", "C:\\Priya\\Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		  driver.manage().window().maximize();
	}

	@When("the user wants to use app click login in the field")
	public void the_user_wants_to_use_app_click_login_in_the_field() {
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@Then("the user wants to enter the name as {string} in the field")
	public void the_user_wants_to_enter_the_name_as_in_the_field(String string) {
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
	}

	@Then("the user wants to enter the password as {string} in the field")
	public void the_user_wants_to_enter_the_password_as_in_the_field(String string) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);

	}

	@Then("click the login in the field")
	public void click_the_login_in_the_field() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}



}
