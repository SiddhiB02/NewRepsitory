package Newpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCustomer {
	WebDriver driver;
	@Given("first login to system and go to MyCustomer page")
	public void first_login_to_system_and_go_to_my_customer_page() throws InterruptedException {
		driver=new ChromeDriver();
	    driver.get("https://testffc.nimapinfotech.com/");
	    driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[placeholder=\"Email Id / Mobile No\"]")).sendKeys("siddhibhingarde123@gmail.com"); 
		driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("siddhi@12");
		driver.findElement(By.id("kt_login_signin_submit")).click();
		Thread.sleep(3000);
	}

	@When("Click on new customer button and Fill up all feilds and save")
	public void click_on_new_customer_button_and_fill_up_all_feilds_and_save() throws InterruptedException {		
	    driver.findElement(By.xpath("/html/body/kt-base/div[2]/div/kt-aside-left/div/div/ng-scrollbar/div/div/div/div/div/ul/li[2]/a/span")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/kt-base/div[2]/div/div/div/div/ng-component/kt-customers-list/mat-drawer-container/mat-drawer-content/kt-portlet/div/kt-portlet-header/div[4]/button[1]/span[1]")).click();
	    
	    driver.findElement(By.cssSelector("input[data-placeholder=\"Lead/Customer Name\"]")).sendKeys("Smita");
	    driver.findElement(By.cssSelector("input[data-placeholder=\"Mobile Number\"]")).sendKeys("9876543234");
	    driver.findElement(By.cssSelector("button[mattooltip=\"Save changes\"]")).click();
	}

	@Then("customer added successfully")
	public void customer_added_successfully() {
	    
	}
}
