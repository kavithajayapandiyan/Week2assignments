package week2day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicate {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Afablez");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramasubbu");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Madasamy");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Thangam");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("BSC.IT");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Null");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Ramasubbu4756@gmail.com");
	    driver.findElement(By.name("submitButton")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.findElement(By.linkText("Duplicate Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).clear();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Innovative People");
	    driver.findElement(By.id("createLeadForm_firstName")).clear();
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ram");
	    driver.findElement(By.name("submitButton")).click();
	    String title2 = driver.getTitle();
	    System.out.println(title2);
	    
	}

}
