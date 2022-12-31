package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundCheckboxAsgn4 {
	public static void main(String[] args) throws InterruptedException {
		//Load url "https://www.leafground.com/checkbox.xhtml"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/checkbox.xhtml");
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Select Checkbox with notification
		WebElement ajax = driver.findElement(By.xpath("//span[@class='ui-chkbox-label' and text()='Ajax']"));
		ajax.click();
		Thread.sleep(2000);
		
		WebElement checked = driver.findElement(By.xpath("//span[@class='ui-growl-title' and text()='Checked']"));
		if(checked.isDisplayed())
		{
			System.out.println("Checked Notification is shown");
		}
		else
		{
			System.out.println("Checked Notification is not captured by the script");
		}
		
		//Choose your favourite language
		driver.findElement(By.xpath("//h5[text()='Choose your favorite language(s)']/following::tbody/tr/td/label[text()='Python']")).click();
		Thread.sleep(2000);
		
		//Toggle switch
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		Thread.sleep(2000);
		
		//Verify if check box is disabled
		
		WebElement checkbox = driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']/following::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']"));
		boolean enabled = checkbox.isEnabled();
		System.out.println(enabled);
		if(!enabled)
			System.out.println("Checkbox is disabled");
		else
			System.out.println("checkbox is enabled");
		
		//Select Multiple
		driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
		driver.findElement(By.className("layout-main-content")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
}
