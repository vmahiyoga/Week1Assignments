package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginACMEAssgn3 {

	public static void main(String[] args) {
		//Load url "https://acme-test.uipath.com/login"
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/login");
		//maximize the window
		driver.manage().window().maximize();
		
		//Enter email
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		//Enter password
		driver.findElement(By.name("password")).sendKeys("leaf@12");
		
		//Click login button - clarification required in this xpath.  check with Princila
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		//Get the title of the page and print
		String title = driver.getTitle();
		System.out.println(title);
		
		//Click on logout
		driver.findElement(By.linkText("Log Out")).click();
		
		//close the browser
		driver.close();
	}

}
