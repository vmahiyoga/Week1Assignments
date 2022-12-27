package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadAsgn2 {
	public static void main(String[] args) throws InterruptedException {
		// Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Maximize the window
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Click on Leads Link
		driver.findElement(By.linkText("Leads")).click();

		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();

		//Click on Email
		driver.findElement(By.linkText("Email")).click();

		//Enter phone number
		driver.findElement(By.name("emailAddress")).sendKeys("Test@testleaf.com");

		//Click find leads button
		driver.findElement(By.linkText("Find Leads")).click();

		//Capture Name of first resulting lead
		WebElement firstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext'])[1]"));
		String firstLeadName = firstLead.getText();
		System.out.println("First Lead: "+firstLeadName);

		//Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext'])[1]")).click();
		System.out.println("First Lead Clicked");

		//Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//Verify the title as Duplicate Lead
		String title = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println("Title: "+title);

		//Verify the title as 'Duplicate Lead'
	
		if(title.equals("Duplicate Lead"))
		{
			System.out.println("Title is correct!!");
		}

		else {
			System.out.println("Title is incorrect!!\nClose the browser!!");
			driver.quit();
		}
		
		//Click Create Lead
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String duplicatedLead = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		
		//Confirm the duplicated lead name is same as captured name
		if(duplicatedLead.equals(firstLeadName))
		{
			System.out.println("Lead names are same!!  Success.");
		}

		else
		{
			System.out.println("Lead names are different... Failure!!");
		}
		

		driver.quit();


	}

}



