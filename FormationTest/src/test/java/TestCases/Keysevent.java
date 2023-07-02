package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keysevent {

	public static void main(String[] args) {
		// chemin chromedriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouverture chrome
		WebDriver driver;
		driver= new ChromeDriver();
		//maximase window
		driver.manage().window().maximize();
		//implicity wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//ouverture url
		driver.navigate().to("https://demoqa.com/text-box");
		
		//déclaration et identification
		WebElement CurrentAdress;
		WebElement PermanentAdress;
		CurrentAdress=driver.findElement(By.id("Current Address"));
		PermanentAdress=driver.findElement(By.id("permanentAddress"));
		//Action
		Actions action=new Actions(driver);
		
		CurrentAdress.sendKeys("Avenue de la république");
		action.keyDown(CurrentAdress,Keys.CONTROL).sendKeys("A").sendKeys("C").keyUp(PermanentAdress, Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	}

}
