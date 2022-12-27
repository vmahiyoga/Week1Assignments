package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadAsgn2 {

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

		//Click on Phone
		driver.findElement(By.linkText("Phone")).click();

		//Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");

		//Click find leads button
		driver.findElement(By.linkText("Find Leads")).click();

		//Capture lead id of first resulting lead
		WebElement firstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-row   ']/table[1]/tbody[1]/tr[1]/td[1])[1]"));
		String firstLeadId = firstLead.getText();
		System.out.println("First Lead: "+firstLeadId);

		//Click First Resulting lead
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();

		//Click Delete
		driver.findElement(By.linkText("Delete")).click();
		System.out.println("Deleted");

		//Click find leads button
		driver.findElement(By.linkText("Find Leads")).click();


		//Send the Deleted Lead id as input and search for lead
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(firstLeadId);
		System.out.println("Deleted Lead id entered");

		//Click find leads button
		Thread.sleep(10000);
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(10000);
		System.out.println("Click find leads");
		

		//Confirm successful deletion and print user message
		WebElement userMessageElement = driver.findElement(By.xpath("//div[text()='No records to display']"));
		System.out.println(userMessageElement.getText());
		if(userMessageElement.getText().equals("No records to display"))
		{
			System.out.println("Successful Deletion!!");
		}

		else {
			System.out.println("Failure!!");
		}


		driver.close();


	}

}
