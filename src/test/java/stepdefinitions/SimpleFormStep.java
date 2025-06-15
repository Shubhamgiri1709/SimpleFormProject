package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleFormStep {
	WebDriver driver;

    @Given("I open the simple form page")
    public void openSimpleForm() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://v1.training-support.net/selenium/simple-form");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @When("I enter {string} in the first name field")
    public void enterFirstName(String firstName) {
        driver.findElement(By.id("firstName")).sendKeys(firstName);
    }

    @When("I enter {string} in the last name field")
    public void enterLastName(String lastName) {
        driver.findElement(By.id("lastName")).sendKeys(lastName);
    }

    @When("I enter {string} in the email field")
    public void enterEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    @When("I enter {string} in the contact number field")
    public void enterContact(String contact) {
        driver.findElement(By.id("number")).sendKeys(contact);
    }
    
    @When("I enter {string} in the meassage field")
    public void i_enter_in_the_meassage_field(String string) {
    	driver.findElement(By.xpath("//div[@class='field']//textarea")).sendKeys(string);
    }

    @When("I click the submit button")
    public void clickSubmit() {
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }

    @Then("I should see the form submitted successfully")
    public void verifySubmission() {
        Alert alert = driver.switchTo().alert();
        assert alert.getText().contains("Thank you");
        alert.accept();
        driver.quit();
    }
}
