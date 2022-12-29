package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundSelectAsgn4 {
	public static void main(String[] args) throws InterruptedException {
		//Load url "https://www.leafground.com/select.xhtml"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/select.xhtml");
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Select favourite automation tool
		WebElement tool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select toolDD = new Select(tool);
		//toolDD.selectByIndex(1);
		toolDD.selectByVisibleText("Selenium");
		Thread.sleep(2000);

		//Select Country
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all' and @data-label='India']")).click();
		Thread.sleep(2000);

		//Select City
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all' and @data-label='Chennai']")).click();
		Thread.sleep(2000);

		//Select Course
		//driver.findElement(By.xpath("//ul[@class='ui-autocomplete-multiple-container ui-autocomplete-dd-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-left']")).click();
		//driver.findElement(By.xpath("//li[@data-item-value='Selenium WebDriver']")).click();
		//Thread.sleep(2000);

		//Select Language Randomly
		driver.findElement(By.id("j_idt87:lang_label")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();
		Thread.sleep(2000);

		//Select 'Two'
		driver.findElement(By.id("j_idt87:value_label")).click();
		driver.findElement(By.xpath("//li[@data-label='Two']")).click();
		Thread.sleep(2000);

		driver.quit();

	}

}
