package NoteMaster;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUp {
	
	WebDriver driver ;
	
	@BeforeMethod(alwaysRun=true)
	public void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://notes-makers.vercel.app/");
		driver.manage().window().maximize();


	}
	
	@Test(priority=1, groups="smoke")
	public void SignUpwithValidCredentials() throws InterruptedException {
		
		String Title = driver.findElement(By.cssSelector("p[class='text-[20px] font-bold']")).getText();
		System.out.println(Title);
		
		WebElement clickSignUPButton = driver.findElement(By.xpath("//div[@class='flex justify-center items-center gap-4']//strong[@class='flex items-center justify-center'][normalize-space()='Sign Up']"));
		clickSignUPButton.click();
		
		WebElement firstName = driver.findElement(By.id("name"));
		firstName.sendKeys("Shubham");
		
		WebElement Email = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
		Email.sendKeys("shubhamyetonde865@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Pass@12345");
		
		WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
		ConfirmPassword.sendKeys("Pass@12345");
		
		WebElement SignUPButton = driver.findElement(By.xpath("(//strong[contains(@class,'flex items-center justify-center')][normalize-space()='Sign Up'])[2]"));
		SignUPButton.click();
		
		
		
	}
	
	
	@Test(priority=2, groups="smoke")
	public void SignUPinvalidEmail() throws InterruptedException {
		
		WebElement clickSignUPButton = driver.findElement(By.xpath("//div[@class='flex justify-center items-center gap-4']//strong[@class='flex items-center justify-center'][normalize-space()='Sign Up']"));
		clickSignUPButton.click();
		
		WebElement firstName = driver.findElement(By.id("name"));
		firstName.sendKeys("Shubham");
		
		WebElement Email = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
		Email.sendKeys("shubhamygmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Pass@12345");
		
		WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
		ConfirmPassword.sendKeys("Pass@12345");
		
		WebElement SignUPButton = driver.findElement(By.xpath("(//strong[contains(@class,'flex items-center justify-center')][normalize-space()='Sign Up'])[2]"));
		SignUPButton.click();
		
		
		
	}
	
	@Test(priority=3, groups="smoke")
	public void SignUpwithemptyCredentails() throws InterruptedException {
		
		WebElement clickSignUPButton = driver.findElement(By.xpath("//div[@class='flex justify-center items-center gap-4']//strong[@class='flex items-center justify-center'][normalize-space()='Sign Up']"));
		clickSignUPButton.click();
		
		WebElement firstName = driver.findElement(By.id("name"));
		firstName.sendKeys("");
		
		WebElement Email = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
		Email.sendKeys("");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("");
		
		WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
		ConfirmPassword.sendKeys("");
		
		WebElement SignUPButton = driver.findElement(By.xpath("(//strong[contains(@class,'flex items-center justify-center')][normalize-space()='Sign Up'])[2]"));
		SignUPButton.click();
		
	}
	
	@Test(priority=4, groups="smoke")
	public void SignUpwithinvaidCredentials() throws InterruptedException {
		
		String Title = driver.findElement(By.cssSelector("p[class='text-[20px] font-bold']")).getText();
		System.out.println(Title);
		
		WebElement clickSignUPButton = driver.findElement(By.xpath("//div[@class='flex justify-center items-center gap-4']//strong[@class='flex items-center justify-center'][normalize-space()='Sign Up']"));
		clickSignUPButton.click();
		
		WebElement firstName = driver.findElement(By.id("name"));
		firstName.sendKeys("S");
		
		WebElement Email = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
		Email.sendKeys("shubhamygmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("ass123");
		
		WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
		ConfirmPassword.sendKeys("ass@123");
		
		WebElement SignUPButton = driver.findElement(By.xpath("(//strong[contains(@class,'flex items-center justify-center')][normalize-space()='Sign Up'])[2]"));
		SignUPButton.click();
		
		
		
	}
	
	
	@Test(priority=5, groups="smoke")
	public void SignUpwithNameFieldNumericValue() throws InterruptedException {
		
		String Title = driver.findElement(By.cssSelector("p[class='text-[20px] font-bold']")).getText();
		System.out.println(Title);
		
		WebElement clickSignUPButton = driver.findElement(By.xpath("//div[@class='flex justify-center items-center gap-4']//strong[@class='flex items-center justify-center'][normalize-space()='Sign Up']"));
		clickSignUPButton.click();
		
		WebElement firstName = driver.findElement(By.id("name"));
		firstName.sendKeys("6596658");
		
		WebElement Email = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
		Email.sendKeys("shubhamyetonde@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Pass1235");
		
		WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
		ConfirmPassword.sendKeys("Pass@1235");
		
		WebElement SignUPButton = driver.findElement(By.xpath("(//strong[contains(@class,'flex items-center justify-center')][normalize-space()='Sign Up'])[2]"));
		SignUPButton.click();
		
		
		
	}
	
		@AfterMethod(alwaysRun=true)
		public void tearDown() throws InterruptedException {
			  Thread.sleep(5000);
		    driver.quit();
		  
		
	}
		
}
