import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginClass {

WebDriver driver=null;

@Given("Browser open")
public void browser_open() {
	System.setProperty("driver.chrome.driver", "./src/test/resources/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://qaen.hr2eazy.com/");

}

@When("user enters {string} in username and {string} in password")
public void user_enters_in_username_and_in_password(String username, String password) {
driver.findElement(By.id("txtLanId")).sendKeys(username);
driver.findElement(By.id("txtPassword")).sendKeys(password);
}

@And("user hits login")
public void user_hits_login() {
    driver.findElement(By.id("btnSubmit")).click();
}

@Then("user navigated to home page")
public void user_navigated_to_home_page() {
}
}
