package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\driver\\chromedriver.exe");//another project also can access the web driver
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement login_btn = driver.findElement(By.xpath("//*[@class='login']"));
		login_btn.click();
		
		WebElement create_email = driver.findElement(By.xpath("//*[@id='email_create']"));
		create_email.sendKeys("bav3722@gmail.com");
		System.out.println("Entering the email");
		Thread.sleep(1000);
		
		WebElement create_click = driver.findElement(By.xpath("//*[@id='SubmitCreate']"));
		create_click.click();
		System.out.println("create_account");
		
		Thread.sleep(8000);
		
		WebElement radio1 = driver.findElement(By.xpath("(//*[@name='id_gender'])[1]"));
		
		radio1.click();
		
		
		driver.findElement(By.xpath("//*[@name='customer_firstname']")).sendKeys("Sasi");
		driver.findElement(By.xpath("//*[@name='customer_lastname']")).sendKeys("kumar");
		driver.findElement(By.xpath("//*[@name='passwd']")).sendKeys("babu@1234");
		Thread.sleep(2000);
		 
	     Select Days =new Select(driver.findElement(By.id("days")));
	     Thread.sleep(2000);
	     Days.selectByValue("2");
	     Thread.sleep(1000);
	     
	     Select months = new Select(driver.findElement(By.id("months")));
	     Thread.sleep(2000);
	     months.selectByValue("11");
	     Thread.sleep(1000);
	     
	     Select years = new Select(driver.findElement(By.id("years")));
	     Thread.sleep(2000);
	     years.selectByValue("1989");
	     Thread.sleep(1000);
	     
	     driver.findElement(By.xpath("//*[@name='company']")).sendKeys("TATA");
	     driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("63 vinyager koil street");
	     driver.findElement(By.xpath("//*[@name='address2']")).sendKeys("63 vinyager koil street");
	     driver.findElement(By.xpath("//*[@name='city']")).sendKeys("chennai");
	     
	     Select state = new Select(driver.findElement(By.id("id_state")));
	     Thread.sleep(2000);
	     state.selectByValue("11");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@name='postcode']")).sendKeys("96701");
	     driver.findElement(By.xpath("//*[@name='phone_mobile']")).sendKeys("8904161358");
	     driver.findElement(By.xpath("//*[@name='alias']")).sendKeys("chennai");
	     
	     WebElement Register = driver.findElement(By.xpath("//*[@name='submitAccount']"));
	     Register.click();
		 System.out.println("Register");
		
	     //Thread.sleep(6000);
		
		//driver.close();

	}

}
