package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateur {

	public static void main(String[] args) {
		//identification (chemin) ChromeDriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe" );
		//ouverture Chrome
		WebDriver driver;
		driver = new ChromeDriver();
		//maximaze window
		driver.manage().window().maximize();
		//delete cookies
		driver.manage().deleteAllCookies();
		
		//ouvrir URL
		//driver.get("https://www.google.fr/");
		driver.navigate().to("https://www.google.fr/");
		
		//declaration des variables
		WebElement tt;
		
		//identification des variables
		tt = driver.findElement(By.name("q"));
		
		//action
		tt.sendKeys("Tunisie");
		
		
		//close chrome
		//driver.close();
		
		
		

	}

}
