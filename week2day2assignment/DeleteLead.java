package week2day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen270']")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("987654321");
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		driver.findElement(By.xpath("//a[text() = '10834']")).click();
		driver.findElement(By.xpath("//a[@class = 'subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		driver.findElement(By.xpath("//span[text()='Advanced']/following::input")).click();
		driver.findElement(By.xpath("//span[text()='Advanced']/following::input")).sendKeys("10834");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(text);
		
		
		
		
		
		
		
	}
	
}
