package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpFaceBookAssgn1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//create object to launch ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		//Load the URL
		driver.get("https://en-gb.facebook.com/");

		//Maximize the window
		driver.manage().window().maximize();

		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


		//Click on Create New Account button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		//Enter the first name
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Maheshwari");
		
		//Enter the last name
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Vijayarajan");
		
		//Enter the mobile number
		WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobile.sendKeys("9597531166");
		
		//Enterthe password
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("January#23");
		
		//Handle all the three drop downs
		//Select day
		WebElement day = driver.findElement(By.id("day"));
		Select dayDD = new Select(day);
		dayDD.selectByVisibleText("17");
		
		//Select month
		WebElement month = driver.findElement(By.id("month"));
		Select monthDD = new Select(month);
		monthDD.selectByVisibleText("Aug");
		
		//Select Year
		WebElement year = driver.findElement(By.id("year"));
		Select yearDD = new Select(year);
		yearDD.selectByVisibleText("1989");
		
		//Select Gender
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
	}

}
