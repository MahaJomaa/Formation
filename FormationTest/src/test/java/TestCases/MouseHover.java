package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// chemin chromedriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouverture chrome
		WebDriver driver;
		driver= new ChromeDriver();
		//maximase window
		driver.manage().window().maximize();
		//ouverture url
		driver.navigate().to("https://demoqa.com/menu");
		Thread.sleep(5000);
		//déclaration et identification
		WebElement Mainitem2;
		Mainitem2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		WebElement Subsublist;
		Subsublist=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
		//action
		Actions action = new Actions(driver);
		action.moveToElement(Mainitem2).perform();
		action.moveToElement(Subsublist).perform();
		
		
	}

}
