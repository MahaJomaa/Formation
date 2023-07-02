package TestCases;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// chemin chromedriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouverture chrome
		WebDriver driver;
		driver= new ChromeDriver();
		//maximase window
		driver.manage().window().maximize();
		//ouverture url
		driver.navigate().to("https://demoqa.com/buttons");
		Thread.sleep(5000);
		//déclaration et identification
		WebElement Doubletn ;
		Doubletn = driver.findElement(By.id("doubleClickBtn"));
		//Action Double click
		 Actions action = new Actions(driver);
		 action.doubleClick(Doubletn).perform();
		 //Vérification
		 WebElement message;
		 message=driver.findElement(By.id("doubleClickMessage"));
		 String texte;
		 texte=message.getText();
		 Assert.assertEquals(texte, "You have done a double click");
		 System.out.println("double click done");
		 driver.close();
		
		
		

	}

}
