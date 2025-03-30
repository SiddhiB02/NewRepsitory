package Newpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login1 {
	WebDriver driver;
	@Given("Display SignIn page")
	public void display_sign_in_page() {
		driver=new ChromeDriver();
	    driver.get("https://testffc.nimapinfotech.com/");
		driver.manage().window().maximize();
	   // throw new io.cucumber.java.PendingException();
	}

	@When("^click on EmailIdMobNo field then enter (.*)$")
	public void click_on_email_id_mob_no_field_then_enter_email_id_mob_no(String emailIdMobNo) {
		driver.findElement(By.cssSelector("input[placeholder=\"Email Id / Mobile No\"]")).sendKeys(emailIdMobNo);
		 
	  //  throw new io.cucumber.java.PendingException();
	}

	@And("^Click on password and enter (.*)$")
	public void click_on_password_and_enter_password(String password ) {
		driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys(password);
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("^SignIn (.*)$")
	public void sign_in_status(String status) {
		driver.findElement(By.id("kt_login_signin_submit")).click();

	   // throw new io.cucumber.java.PendingException();
	}


}
