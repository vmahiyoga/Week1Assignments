package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundRadioAsgn4 {
	public static void main(String[] args) throws InterruptedException {
		//Load url "https://www.leafground.com/radio.xhtml"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/radio.xhtml");
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click your favourite browser
		driver.findElement(By.xpath("//label[text()='Edge']")).click();

		//Find the default select radio button
		String selected = driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following::input[@checked='checked']/following::label")).getText();
		System.out.println("Selected Radio button is: "+selected);
		
		//Check the age is selected
		boolean enabled = driver.findElement(By.xpath("//input[@name='j_idt87:age' and @value='1-20 Years']")).isSelected();
		System.out.println(enabled);
		
		if(!enabled)
			driver.findElement(By.xpath("//label[text()='1-20 Years']")).click();
		
		driver.quit();
		
	}
}

