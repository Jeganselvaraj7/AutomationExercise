package testcase;


import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;




public class TC_SmokeTest {

WebDriver driver;
	

		
	
	@Test
	public void t_01_cscart_search() throws InterruptedException, AWTException, IOException {
		
	
	//Entering page
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jegans\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	//Product Search
	WebElement search=driver.findElement(By.xpath("//input[@name='search']"));
	search.sendKeys("Apple cinema 30");
	Thread.sleep(1000);
	
	
	WebElement clickbutton=driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
	clickbutton.click();
	Thread.sleep(1000);
	
	//Scroll down
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,400)", "");
	Thread.sleep(1000);
	
	//Add to cart
	driver.findElement(By.xpath("//body/div[@id='product-search']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/label[1]")).click();
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,400)", "");
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/label[1]/input[1]")).click();
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/select[1]")).sendKeys("Blue (+$3.60)");
	
	driver.findElement(By.xpath("//textarea[@id='input-option209']")).sendKeys("For Office purpose");
	
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	js2.executeScript("window.scrollBy(0,400)", "");
	
	driver.findElement(By.xpath("//button[@id='button-upload222']")).click();
	Thread.sleep(1000);
	
	//File Upload using AutoIT
	new ProcessBuilder("C:\\AutoIT\\Open.exe","","Open").start();
	
	
	//Alert 
	Thread.sleep(3000);
	Alert simpleAlert=driver.switchTo().alert();
	System.out.println(simpleAlert.getText());
	simpleAlert.accept();
	
	JavascriptExecutor js3 = (JavascriptExecutor) driver;
	js3.executeScript("window.scrollBy(0,400)", "");
	
	//Cart
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[10]/button[1]")).click();
	
	JavascriptExecutor js4 = (JavascriptExecutor) driver;
	js4.executeScript("window.scrollBy(0,-1000)", "");
	
	//clicking the cart/checkout
	driver.findElement(By.xpath("//header/div[1]/div[1]/div[3]/div[1]/button[1]")).click();
	
	Thread.sleep(3000);
	
	driver.close();
	
	
	
	}
}
	

	
	
	
	
	
	
	
	
	


