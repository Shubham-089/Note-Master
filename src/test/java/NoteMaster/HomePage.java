package NoteMaster;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePage {
	
	
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
		
		driver.findElement(By.xpath("//body//div//nav//button[1]")).click();
		
		WebElement Email =driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("shubhamyetonde865@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Pass@12345");
		
		WebElement LoginButton = driver.findElement(By.xpath("//div[contains(@class,'mt-6')]//strong[contains(@class,'flex items-center justify-center')][normalize-space()='Login']"));
		LoginButton.click();
		
	}
	
	@Test(priority=2, groups="smoke")
	public void SelectNoteMaster() throws InterruptedException {
		LoginwithValidCredentials();
	
		driver.findElement(By.xpath("(//p[contains(@class,'text-[20px] font-bold')])[1]")).click();
		
		
		WebElement ClickCreateNotebook = driver.findElement(By.xpath("(//strong[normalize-space()='Create NoteBook'])[1]"));
		ClickCreateNotebook.click();
		
	
		
		 WebElement Title = driver.findElement(By.xpath("(//input[@id='title'])[1]"));
		 Title.sendKeys("Horror Movies");
		 
	
		 driver.findElement(By.xpath("(//strong[normalize-space()='Submit'])[1]")).click();
		 
		 // Either click on the Close BUtton
		// driver.findElement(By.xpath("(//strong[normalize-space()='Close'])[1]")).click();
		 
	}
	
	@Test(priority=2, groups="smoke")
	public void WriteNotes() throws InterruptedException {
		LoginwithValidCredentials();
		
		driver.findElement(By.xpath("(//p[@class='text-[20px] font-bold'])[1]")).click();
		
		
		WebElement ClickCreateNotebook = driver.findElement(By.xpath("//body/div/div/main/div/button[1]"));
		ClickCreateNotebook.click();
		
		
		
		 WebElement Title = driver.findElement(By.xpath("(//input[@placeholder='Notes Title'])[1]"));
		 Title.sendKeys("Horror Movies");
		 
		 
		 driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']//p")).sendKeys("Hii Shubham");
		 
		 driver.findElement(By.xpath("(//strong[normalize-space()='Save Changes'])[1]")).click(); 
		 
	}
	
	
	@AfterClass(alwaysRun=true)
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
	   // driver.quit();
	
    }
	
}