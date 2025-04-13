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

public class To_do_list {
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
	
	@Test(priority=1, groups="smoke")
	public void TodoListCreate() throws InterruptedException {
		
		
		WebElement clickProfileName = driver.findElement(By.xpath("(//div[@class='fixed inset-0 bg-black bg-opacity-50 z-10'])[1]"));
		clickProfileName .click();
		
		
		WebElement ClickTodoList = driver.findElement(By.xpath("(//li[normalize-space()='To-Do List'])[1]"));
		ClickTodoList.click();
		
		WebElement Email = driver.findElement(By.xpath("(//input[@placeholder='Write Todo'])[1]"));
		Email.sendKeys("Hiiii To-do-List");
		
		WebElement priorityDropdown = driver.findElement(By.id("priority")); 
		Select select = new Select(priorityDropdown);
		select.selectByVisibleText("Low");
		
		
		WebElement dueDateInput = driver.findElement(By.id("dueDate"));
		dueDateInput.clear();
		dueDateInput.sendKeys("13-04-2025");
		
		WebElement AddTodo= driver.findElement(By.xpath("(//strong[normalize-space()='Add'])[1]"));
		AddTodo.click();
		
		
	}

	@AfterClass(alwaysRun=true)
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
	   // driver.quit();
	
		
    }

}
