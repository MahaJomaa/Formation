package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickme {

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
				WebElement Clickme;
				Clickme= driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
				Actions action = new Actions(driver);
				action.click(Clickme).perform();
				//verification
				WebElement message;
				message=driver.findElement(By.id("dynamicClickMessage"));
				String texte;
				texte=message.getText();
				Assert.assertEquals(texte, "You have done a dynamic click");
				System.out.println("Dynamic click done");
				driver.close();

	}

}
