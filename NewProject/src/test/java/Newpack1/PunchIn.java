package Newpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PunchIn {
	WebDriver driver;
	@Given("I am logged into the system")
	public void i_am_logged_into_the_system() throws InterruptedException {
		driver=new ChromeDriver();
	    driver.get("https://testffc.nimapinfotech.com/");
	    driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[placeholder=\"Email Id / Mobile No\"]")).sendKeys("siddhibhingarde123@gmail.com"); 
		driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("siddhi@12");
		driver.findElement(By.id("kt_login_signin_submit")).click();
		Thread.sleep(8000);
	}

	@When("I Click on punch button")
	public void i_click_on_punch_button() {
	    driver.findElement(By.xpath("/html/body/kt-base/div[2]/div/div/kt-header/div/kt-topbar/div/kt-user-punch/div/div[2]/button/span[1]")).click();
	    driver.switchTo().alert().accept();
	}

	@Then("I should see toast button")
	public void i_should_see_toast_button() {
	    
	}


}
