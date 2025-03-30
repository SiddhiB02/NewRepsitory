package Newpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	WebDriver driver;
	@Given("Go to SignUp page")
	public void go_to_sign_up_page() {
		driver=new ChromeDriver();
	    driver.get("https://testffc.nimapinfotech.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"kt_login\"]/div/div[2]/kt-login/div[1]/a")).click();   
		//throw new io.cucumber.java.PendingException();
	}

	@When("^Click on name field then enter (.*)$")
	public void click_on_name_field_then_enter_name(String Name) {
		driver.findElement(By.id("mat-input-2")).sendKeys(Name);

	   // throw new io.cucumber.java.PendingException();
	}

	@And("Select country")
	public void select_country() {
     driver.findElement(By.cssSelector("div[id=\"mat-select-value-295\"]")).click();
		/*WebElement con=driver.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]/span/span"));
		 Select sel=new Select(con); 
		 sel.selectByVisibleText("India");*/
	   
	  //  throw new io.cucumber.java.PendingException();
	}

	@And("^enter mob no (.*)$")
	public void enter_mob_no_mobile_number(String MobileNumber) {
		driver.findElement(By.id("mat-input-4")).sendKeys(MobileNumber);	   
	  //  throw new io.cucumber.java.PendingException();
	}

	@And("^enter email Id (.*)$")
	public void enter_email_id_email_id(String emailId) {
		driver.findElement(By.id("mat-input-5")).sendKeys(emailId);		
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("^SignUp (.*)$")
	public void sign_up_status(String status) {
		driver.findElement(By.id("kt_login_signin_submit")).click();  
	   // throw new io.cucumber.java.PendingException();
	}
	public void pass() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.id("mat-input-7")).sendKeys("siddhi@12");
		driver.findElement(By.id("mat-input-8")).sendKeys("siddhi@12");
		
		driver.findElement(By.id("kt_login_signin_submit")).click();
		
	}
}
