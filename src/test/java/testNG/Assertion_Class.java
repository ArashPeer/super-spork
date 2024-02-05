package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertion_Class {
    WebDriver driver;
    @BeforeClass
    void setup()
    {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
       driver = new ChromeDriver();
       driver.get("https://www.google.com");
    }
    @Test(priority = 1)
    void logoTest()
    {
       WebElement logo = driver.findElement(By.xpath("//img[@alt='Google']"));
       Assert.assertTrue(logo.isDisplayed(), "logo is dispalyed on the page");
//       Assert.assertFalse(logo.isDisplayed(),"logo is not displayed on the page");

    }
    @Test(priority = 2)
    void homePageTitle()
    {
      String title = driver.getTitle();
      Assert.assertEquals(title, "Google");
        System.out.println(title);
    }
    @AfterClass
    void tearDown()
    {
        driver.quit();
    }

}
