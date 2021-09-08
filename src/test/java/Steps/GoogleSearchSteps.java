package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {
    WebDriver driver=null;
    @Given("^browser is open$")
    public void browser_is_open() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        String projectPath=System.getProperty("user.dir");
        System.out.println("Project path is:"+projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe.");
        driver = new ChromeDriver();

        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //driver.manage().window().maximize();
    }
    @And("^user is on google search page$")
    public void user_is_on_google_search_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.navigate().to("https://www.google.com/");
    }

    @When("^user enters a text in search box$")
    public void user_enters_a_text_in_search_box() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.name("q")).sendKeys("AutomationStepbyStep");
    }

    @And("^hits enter$")
    public void hits_enter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
    @Then("^user is navigated to search results$")
    public void user_is_navigated_to_search_results() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.getPageSource().contains("Online Courses");
        driver.close();
        driver.quit();
    }



}
