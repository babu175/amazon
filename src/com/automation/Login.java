package com.automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args)throws InterruptedException, IOException  {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement login_btn = driver.findElement(By.xpath("//*[@class='login']"));
		login_btn.click();
		WebElement email = driver.findElement(By.xpath("//*[@name='email']"));
		email.sendKeys("bav3722@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@name='passwd']"));
		password.sendKeys("babu@1234");
		WebElement signin = driver.findElement(By.xpath("//*[@name='SubmitLogin']"));
		signin.click();
		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		tshirt.click();
		WebElement t_shirt = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
		t_shirt.click();
		
driver.switchTo().frame(0);
		WebElement qty = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		qty.click();
		qty.click();
	   // driver.findElement(By.id("quantity_wanted")).sendKeys("2");
		
	    //Thread.sleep(2000);
		WebElement size = driver.findElement(By.xpath("//*[@name='group_1']"));
		Select s1 = new Select(size);
		s1.selectByVisibleText("L"); 
		WebElement addcart = driver.findElement(By.xpath("//*[@name='Submit']"));
		addcart.click();
		Thread.sleep(3000);
		WebElement process_booking = driver.findElement(By.xpath("//*[@title='Proceed to checkout']"));
		process_booking.click();
		WebElement process_booking1 = driver.findElement(By.xpath("(//*[@title='Proceed to checkout'])[2]"));
		process_booking1.click();
		WebElement process_booking2 = driver.findElement(By.xpath("//*[@name='processAddress']"));
		process_booking2.click();
		WebElement checkbox = driver.findElement(By.xpath("//*[@name='cgv']"));
		checkbox.click();
		WebElement process_booking3 = driver.findElement(By.xpath("//*[@name='processCarrier']"));
		process_booking3.click();
		WebElement process_booking4 = driver.findElement(By.xpath("//*[@title='Pay by bank wire']"));
		process_booking4.click();
		WebElement confirm = driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
		confirm.click();
        
		TakesScreenshot tk=(TakesScreenshot) driver;
		File source= tk.getScreenshotAs(OutputType.FILE);
		File desination=new File("C:\\Users\\BABU\\eclipse-workspace\\com.automation\\snap\\png");
		FileUtils.copyFile(source,desination);

	}

}
