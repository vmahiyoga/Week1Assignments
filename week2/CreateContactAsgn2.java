package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactAsgn2 {

	public static void main(String[] args) {

		// Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Maximize the window
		driver.manage().window().maximize();

		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();

		//Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();

		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Maheshwari");

		//Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("Vijayarajan");

		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Maheshwari");

		//Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("V");
		
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("DEG");
		
		//Enter Description Field Using any Locator of your choice 
		driver.findElement(By.xpath("//textarea[@name = 'description']")).sendKeys("Delivery Excellence Group");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.xpath("//input[@id = 'createContactForm_primaryEmail']")).sendKeys("vmahiyoga@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stateDD = new Select(state);
		stateDD.selectByVisibleText("New York");
		
		//Click on Create Contact
		driver.findElement(By.className("smallSubmit")).click();
		
		//Click on Edit Button
		driver.findElement(By.linkText("Edit")).click();
		
		//Clear the Description Field using .clear
		driver.findElement(By.xpath("//textarea[@name = 'description']")).clear();
		
		// Fill ImportantNote Field with Any text
		driver.findElement(By.name("importantNote")).sendKeys("Delivery Excellence");
		
		//Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@value = 'Update']")).click();
		
		//Get the Title of Resulting Page
		String title = driver.getTitle();
		System.out.println(title);
		
		//Close the web page
		driver.close();
	}

}
