package week2day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a[@href = '#'])[2]")).click();
		driver.findElement(By.xpath("//input[@name = 'firstname']")).click();
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Firstname");
		driver.findElement(By.xpath("(//input[@type = 'text'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type = 'text'])[3]")).sendKeys("Lastname");
		driver.findElement(By.xpath("(//input[@class = 'inputtext _58mg _5dba _2ph-'])[3]")).click();
		driver.findElement(By.xpath("(//input[@class = 'inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id = 'password_step_input']")).click();
		driver.findElement(By.xpath("//input[@id = 'password_step_input']")).sendKeys("Ramsubu@9578");
		WebElement day = driver.findElement(By.id("day"));
		Select dob = new Select(day);
		dob.selectByIndex(25);
		WebElement month = driver.findElement(By.id("month"));
		Select mob = new Select(month);
		mob.selectByVisibleText("Oct");
	    WebElement year = driver.findElement(By.id("year"));
	    Select yob = new Select(year);
	    yob.selectByValue("2020");
	    driver.findElement(By.name("sex")).click();
		
		
		
		
		
		
	}

}
