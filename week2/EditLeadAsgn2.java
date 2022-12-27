package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadAsgn2 {
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

		//Enter First name
		driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']/following::input[@name='firstName']")).sendKeys("Hari");
		Thread.sleep(10000);
		
		//Click find leads button
		driver.findElement(By.linkText("Find Leads")).click();

		//Capture Name of first resulting lead
		WebElement firstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext'])[1]"));
		String firstLeadName = firstLead.getText();
		System.out.println("First Lead: "+firstLeadName);

		//Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext'])[1]")).click();
		System.out.println("First Lead Clicked");
		Thread.sleep(10000);

		//Verify the title as View Lead
		String title = driver.findElement(By.xpath("//div[@class='x-panel-header sectionHeaderTitle']")).getText();
		System.out.println("Title: "+title);

		//Verify the title as 'View Lead'
	
		if(title.equals("View Lead"))
		{
			System.out.println("Title is correct!!");
		}

		else {
			System.out.println("Title is incorrect!!\nClose the browser!!");
			driver.quit();
		}
		
		//Click Edit
		driver.findElement(By.linkText("Edit")).click();
		//Update the Company Name of the Lead
		WebElement companyName = driver.findElement(By.xpath("//input[@name='companyName' and @class='inputBox']"));
		companyName.clear();
		companyName.sendKeys("TCS");
		Thread.sleep(10000);
		
		//Click Update
		driver.findElement(By.xpath("//input[@class='smallSubmit' and @name='submitButton' and @value='Update']")).click();
		
		
		//Confirm the updated company name is displayed
		String updatedCompany = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(updatedCompany);
		Thread.sleep(10000);
		if(updatedCompany.equals("TCS"))
		{
			System.out.println("Company name updated... Success!!");
		}

		else
		{
			System.out.println("Company name not updated... Failure!!");
		}
		

		driver.quit();


	}

}



