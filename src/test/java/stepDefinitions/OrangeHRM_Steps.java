package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class OrangeHRM_Steps {

   WebDriver driver;

    @Given("I Firstly Launch Chrome Browser")
    public void i_Firstly_Launch_Chrome_Browser() {
        //System.setProperty("webdriver.gecko.driver", "C:/Selenium/geckodriver-v0.24.0-win64/geckodriver.exe");
        //driver= new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C://Drivers//Chrome Driver Version 80/chromedriver.exe");
        driver= new ChromeDriver();

    }

    @When("I Open Orange HRM Site's Home Page URL in Chrome Browser")
    public void i_Open_Orange_HRM_Site_s_Home_Page_URL_in_Chrome_Browser() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        Thread.sleep(20);
    }

    @Then("I Verify The Presence Of Orange HRM Site's Logo On Login Page")
    public void i_Verify_The_Presence_Of_Orange_HRM_Site_s_Logo_On_Login_Page() {
       boolean status =  driver.findElement(By.xpath("//div[@id='divLogo']//img")).isDisplayed();
        Assert.assertEquals(true, status);
    }

    @And("Close Browser")
    public void close_Browser() {
        driver.quit();
    }


}
