package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class new_class {
	WebDriver driver;
	
	
	@Given("the user wants to use the app")
	public void the_user_wants_to_use_the_app() {
	    System.out.println("Welcome");
	    System.setProperty("webdriver.chrome.driver", "C:\\Priya\\Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		  driver.manage().window().maximize();
	}

	@When("the user wants to sign_up")
	public void the_user_wants_to_sign_up() {
	    System.out.println("Signup");
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();

	}

	@When("the login page is displayed the user wants to enter the name as {string}")
	public void the_login_page_is_displayed_the_user_wants_to_enter_the_name_as(String string) {
	    System.out.println(string);
	    driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
	}

	@Then("the user wants to enter the first name as {string}")
	public void the_user_wants_to_enter_the_first_name_as(String string) {
	    System.out.println(string);
	    driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(string);
 
	}

	@Then("the user wants to enter the second name as {string}")
	public void the_user_wants_to_enter_the_second_name_as(String string) {
	    System.out.println(string);
	    driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(string);
	}

	@Then("the user wants to enter the password as {string}")
	public void the_user_wants_to_enter_the_password_as(String string) {
	    System.out.println(string);
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
	}

	@Then("the user wants to confirm the password as {string}")
	public void the_user_wants_to_confirm_the_password_as(String string) {
	    System.out.println(string);
	    driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(string);
	}
	
	@Then("the user wants to click the gender as {string}")
	public void the_user_wants_to_click_the_gender_as(String string) {
	 System.out.println("gender");
	 driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
	}

	@Then("the user wants to enter the emailID as {string}")
	public void the_user_wants_to_enter_the_emailID_as(String string) {
	    System.out.println(string);
	    driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(string);

	}


	@Then("the user wants to enter the mobileNumber as {string}")
	public void the_user_wants_to_enter_the_mobileNumber_as(String string) {
	    System.out.println(string);
	    driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(string);
	}
	
	@Then("the user wants to click the image")
	public void the_user_wants_to_click_the_image() {
		 driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
	}

	@Then("the user wants to click the month as {string} in the field")
	public void the_user_wants_to_click_the_month_as_in_the_field(String string) {
		 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[8]")).click();
	}

	@Then("the user wants to click the year as {string} in the field")
	public void the_user_wants_to_click_the_year_as_in_the_field(String string) {
		 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[48]")).click();
	}

	@Then("the user wants to click the day as {string} in the field")
	public void the_user_wants_to_click_the_day_as_in_the_field(String string) {
		 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]/a")).click();
	}

	@Then("the user wants to enter the address as {string} in the field")
	public void the_user_wants_to_enter_the_address_as_in_the_field(String string) {
	    System.out.println(string);
	    driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(string);
	}

	@Then("the user wants to select the security question as {string} in the field")
	public void the_user_wants_to_select_the_security_question_as_in_the_field(String string) {
	    System.out.println(string);
	    driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]/option[3]")).click();
	}


	@Then("the user wants to enter the Answer as {string} field")
	public void the_user_wants_to_enter_the_Answer_as_field(String string) {
	    System.out.println(string);
	    driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(string);
	}

	@Then("the user wants to click the Register field")
	public void the_user_wants_to_click_the_Register_field() {
	    System.out.println("string");
	    driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();

	}

}
