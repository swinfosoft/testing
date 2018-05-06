package com.techmentro;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demotest {
	

WebDriver driver;
	
    
	
	@BeforeTest
    public void setup(){
	 System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
    driver= new FirefoxDriver();
    //System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
	//driver = new ChromeDriver();
		
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test(priority=1)
    public void TestCase1(){
	driver.get("http://www.lashopz.com/pie-register-login");
	}
	
	
	@Test(priority=2)
	public void TestCase2(){
	AssertJUnit.assertEquals(driver.getTitle(), "Pie Register � Login | DevShala Online Shopping");
	driver.manage().window().maximize();
	}
	
	@Test(priority=3)
	public void TestCase3() throws InterruptedException{
	driver.findElement(By.className("close-popup")).click();
	Thread.sleep(5000);
	}
	
	@Test(priority=4)
	public void TestCase4() throws InterruptedException{
	driver.findElement(By.id("wp-submit")).click();
	
	}

	@Test(priority=5)
	public void TestCase5() throws InterruptedException{
	driver.findElement(By.id("user_login")).sendKeys("kush");
	driver.findElement(By.id("user_pass")).sendKeys("hello123");
	driver.findElement(By.id("wp-submit")).click();
	}
	
	@Test(priority=6)
	public void TestCase6() throws InterruptedException{
	driver.findElement(By.id("user_login")).sendKeys("ksh");
	driver.findElement(By.id("user_pass")).sendKeys("hello@123");
	driver.findElement(By.id("wp-submit")).click();
	}
	
	@Test(priority=7)
	public void TestCase7() throws InterruptedException{
	driver.findElement(By.id("user_login")).sendKeys("kush");
	driver.findElement(By.id("user_pass")).sendKeys("hello@123");
	driver.findElement(By.id("wp-submit")).click();
	}

	@Test(priority=8)
	public void TestCase8() throws InterruptedException{
	driver.findElement(By.xpath("//*[@id='menu-item-4']/a")).click();
	
	}
     	
	

}
