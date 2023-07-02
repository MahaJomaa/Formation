package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// chemin chromedriver
				System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
				//ouverture chrome
				WebDriver driver;
				driver= new ChromeDriver();
				//maximase window
				driver.manage().window().maximize();
				//ouverture url
				driver.navigate().to("https://demoqa.com/droppable");
				Thread.sleep(5000);
				//déclaration et identification
				WebElement Dragme;
				WebElement Drophere;
				Dragme=driver.findElement(By.id("draggable"));
				Drophere=driver.findElement(By.id("droppable"));
				//Action
				Actions action= new Actions (driver);
				action.dragAndDrop(Dragme, Drophere).perform();
				//Vérification
				WebElement message;
				String texte;
				texte=Drophere.getText();
				Assert.assertEquals("Dropped!", texte);
				System.out.println("test ok");
				driver.close();
				
				

	}

}
