package NoteMaster;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginPage {
	
	WebDriver driver ;
	@BeforeClass(alwaysRun=true)
	public void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://notes-makers.vercel.app/");
		driver.manage().window().maximize();

	}


	@Test(priority=1, groups="smoke")
	public void LoginwithValidCredentials() throws InterruptedException {
		
		String Title = driver.findElement(By.cssSelector("p[class='text-[20px] font-bold']")).getText();
		System.out.println(Title);
		
		driver.findElement(By.xpath("//body//div//nav//button[1]")).click();
		
		WebElement Email =driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("shubhamyetonde865@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Pass@12345");
		
		WebElement LoginButton = driver.findElement(By.xpath("//div[contains(@class,'mt-6')]//strong[contains(@class,'flex items-center justify-center')][normalize-space()='Login']"));
		LoginButton.click();
		
	}
	
	@Test(priority=2, groups="smoke")
	public void LoginwithinValidEmail() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//body//div//nav//button[1]")).click();
		
		WebElement Email =driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("shubhamyetondegmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Pass@12345");
		
		WebElement LoginButton = driver.findElement(By.xpath("//div[contains(@class,'mt-6')]//strong[contains(@class,'flex items-center justify-center')][normalize-space()='Login']"));
		LoginButton.click();
		
	}
	
	@Test(priority=3, groups="sainty")
	public void LoginwithinvalidPassword() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//body//div//nav//button[1]")).click();
		
		WebElement Email =driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("shubhamyetonde865@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("pass234");
		
		WebElement LoginButton = driver.findElement(By.xpath("//div[contains(@class,'mt-6')]//strong[contains(@class,'flex items-center justify-center')][normalize-space()='Login']"));
		LoginButton.click();
		
	}
	
	@Test(priority=3, groups="sainty")
	public void LoginwithinvalidEmail() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//body//div//nav//button[1]")).click();
		
		WebElement Email =driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("shubhamgmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Pass@12345");
		
		WebElement LoginButton = driver.findElement(By.xpath("//div[contains(@class,'mt-6')]//strong[contains(@class,'flex items-center justify-center')][normalize-space()='Login']"));
		LoginButton.click();
		
	}
	
	@Test(priority=5, groups="smoke")
	public void LoginwithEmptyCredentials() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//body//div//nav//button[1]")).click();
		
		WebElement Email =driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("");
		
		WebElement LoginButton = driver.findElement(By.xpath("//div[contains(@class,'mt-6')]//strong[contains(@class,'flex items-center justify-center')][normalize-space()='Login']"));
		LoginButton.click();
		
	}
	
		@AfterClass(alwaysRun=true)
		public void tearDown() throws InterruptedException {
			Thread.sleep(3000);
		    driver.quit();
		
	}
		
		
}
	