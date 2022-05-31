/*
package Steps;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps_POM {

    WebDriver driver = null;
    LoginPage login;
   @Given("browser is open")
    public void browser_is_open() {
        System.out.println(" I am inside browser is open");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
               driver.manage().window().maximize();
    }
    @And("^user is on login page$")
    public void user_is_on_login_page()  {
        driver.navigate().to("https://example.testproject.io/web/");
        System.out.println(" I am inside browser now");
    }
    @When("^user enters (.+) and (.+)$")
    public void user_enters_and(String username, String password)  {
        login = new LoginPage (driver);
        login.enterUsername(username);
        login.enterPassword(password);
    }
    @And("^user clicks on login$")
    public void user_clicks_on_login()  {
        login.clickLogin();
    }

    @Then("^user is navigated to the home page$")
    public void user_is_navigated_to_the_home_page() {
        Assert.assertTrue(login.checkLogOutIsDisplayed());
        driver.close();
    }
}
*/
