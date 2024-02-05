package testNG.ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest_2 {
    WebDriver driver;
    @Test
    void loginTest () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();

        String username = "admin";
        String pwd = "admin";
        String url = "https://"+username+":"+pwd+"@the-internet.herokuapp.com/basic_auth";
        Assert.assertEquals(username, "admin");
        System.out.println();
        driver.get(url);
    }

    @AfterMethod
    void tearDown()
    {
       driver.quit();
    }

}
