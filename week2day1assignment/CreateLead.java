package week2day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kumar");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selvi");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("KavithaRamsubbu");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Null");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Kavitha2797@gmail.com");
	    driver.findElement(By.name("submitButton")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    
	    
	    
	    
		
		
		
	}

}
