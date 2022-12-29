package week2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundButtonAsgn4 {

	public static void main(String[] args) throws InterruptedException {
		//Load url "https://www.leafground.com/button.xhtml"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/button.xhtml");
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click button and confirm title
		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only mr-2 mb-2']")).click();
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		if(title.equals("Dashboard"))
			System.out.println("Title is Dashboard");
		else
			System.out.println("Incorrect title!!");
		Thread.sleep(2000);
		//Navigate back to Home
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Confirm if the button is disabled.
		boolean enabled = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
		System.out.println("Is the button enabled: "+enabled);
		Thread.sleep(2000);
		
		//Find the position of the Submit button
		Point location = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c' and text()='Submit']")).getLocation();
		System.out.println("Location: "+location);
		Thread.sleep(2000);
		
		//Find the save button color
		String cssValue = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c' and text()='Save']")).getCssValue("color");
		System.out.println("Color of the Save Button: "+cssValue);
		Thread.sleep(2000);
		
		//Find height and width of the Submit button
		Dimension size = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c' and text()='Submit'])[2]")).getSize();
		System.out.println("Size of the Submit Button: "+size);
		Thread.sleep(2000);
		
		//Mouse over and confirm the color changed
		WebElement successColor = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c' and text()='Success'])[1]"));
		String color1 = successColor.getCssValue("background-color");
		System.out.println("Initial Color: "+color1);
		Thread.sleep(2000);
		
		Actions builder = new Actions(driver);
		builder.moveToElement(successColor).perform();
		String color2 = successColor.getCssValue("background-color");
		System.out.println("Color after Mouse over: "+color2);
		Thread.sleep(2000);


		//Find the number of rounded buttons
		List<WebElement> roundButtons = driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
		System.out.println("Number of rounded buttons: "+roundButtons.size());
		Thread.sleep(2000);
		
		driver.quit();
	}

}
