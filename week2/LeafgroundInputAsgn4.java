package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundInputAsgn4 {

	public static void main(String[] args) throws InterruptedException {
		
		//Load url "https://www.leafground.com/input.xhtml"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/input.xhtml");
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Get the title of the page and print
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		
		//Type your name
		driver.findElement(By.xpath("(//h5[text()='Type your name']/following::input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[1]")).sendKeys("Maheshwari Vijayarajan");
		Thread.sleep(5000);
		
		//Append country to this city
		WebElement cityElement = driver.findElement(By.xpath("(//h5[text()='Type your name']/following::input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city ui-state-filled'])[1]"));
		String city = cityElement.getText();
		city=city+" India";
		cityElement.sendKeys(city);
		Thread.sleep(5000);
		
		//Verify if text box is disabled
		boolean disabled = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		System.out.println("IsEnabled: "+disabled);
		if(disabled==false)
			System.out.println("Textbox is disabled");
		else
			System.out.println("Textbox is enabled");
		Thread.sleep(5000);
		
		//Clear the typed text
		driver.findElement(By.xpath("//h5[text()='Clear the typed text.']/following::input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled']")).clear();
		Thread.sleep(5000);
		
		//Retrieve the typed text.
		String text = driver.findElement(By.xpath("//h5[text()='Retrieve the typed text.']/following::input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled']")).getAttribute("value");
		System.out.println(text);
		Thread.sleep(5000);
		
		//Type email and tab
		WebElement emailElement = driver.findElement(By.xpath("//h5[text()='Type email and Tab. Confirm control moved to next element.']/following::input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']"));
		emailElement.sendKeys("vmahiyoga@gmail.com",Keys.TAB);
		Thread.sleep(5000);
		
		//Type about yourself
		driver.findElement(By.tagName("textarea")).sendKeys("Be Positive in 2023");
		Thread.sleep(5000);
		
		//Just press enter and confirm error message
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys("",Keys.ENTER);
		WebElement msgElement = driver.findElement(By.xpath("//span[text()='Age is mandatory']"));
		String errorMsg = msgElement.getText();
		if(errorMsg.equals("Age is mandatory"))
			System.out.println("Error message is validated");
		else
			System.out.println("Error message is not displayed / incorrect");
		Thread.sleep(5000);
		
		driver.quit();

	}

}
