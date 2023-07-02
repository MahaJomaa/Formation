package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListeDéroulante {

	public static void main(String[] args) throws InterruptedException {
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
				driver.navigate().to("https://demoqa.com/select-menu");
				
				//déclaration et identification
				WebElement couleur; 
				couleur=driver.findElement(By.id("oldSelectMenu"));
				Select select = new Select(couleur);
				select.selectByValue("5");
				driver.close();
	}

}
