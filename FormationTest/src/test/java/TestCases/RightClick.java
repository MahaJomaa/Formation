package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// chemin ChromeDriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouverture chrome
		WebDriver driver;
		driver = new ChromeDriver();
		//maximaze
		driver.manage().window().maximize();
		//ouverture url
		driver.navigate().to("https://demoqa.com/buttons");
		Thread.sleep(5000);
		//déclaration et identification
		WebElement Righttn;
		Righttn= driver.findElement(By.id("rightClickBtn"));
		Actions action = new Actions(driver);
		action.contextClick(Righttn).perform();
		//verification
		WebElement message;
		message=driver.findElement(By.id("rightClickMessage"));
		String texte;
		texte=message.getText();
		Assert.assertEquals(texte, "You have done a right click");
		System.out.println("Right click done");
		driver.close();
		
		
		
		

	}

}
