package testNG.ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Parallel_Test1 {
    WebDriver driver;
    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");

    } @Test
    void homePageTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement icon = driver.findElement(By.id("APjFqb"));
        icon.sendKeys("ArashPeerMohammad");
        WebElement sName = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
        sName.click();
        Thread.sleep(5000);

    }
    @AfterMethod
   public void tearDown()
    {
        if(this.driver != null){
            this.driver.quit();
        }
    }
}
