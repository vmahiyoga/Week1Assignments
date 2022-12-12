package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLeaftaps {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//create object to launch ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Find the webelement of Username textbox by id
		WebElement eleUsername = driver.findElement(By.id("username"));
		//To type the username in the username text box
		eleUsername.sendKeys("Demosalesmanager");
		
		//Find the webelement of Password textbox by id
		WebElement elePassword = driver.findElement(By.id("password"));
		//To type the username in the username text box
		elePassword.sendKeys("crmsfa");
		
		//Find the webelement of Login button 
		WebElement eleLogin = driver.findElement(By.className("decorativeSubmit"));
		eleLogin.click();
		
	}

}
