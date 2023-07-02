package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CompteFb {

	public static void main(String[] args) throws InterruptedException {
		// chemin chromedriver
				System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
				//ouverture chrome
				WebDriver driver;
				driver= new ChromeDriver();
				//maximase window
				driver.manage().window().maximize();
				//ouverture url
				driver.navigate().to("https://www.facebook.com/");
				//implicity wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//déclaration et identification
				WebElement NouveauCompte;
				NouveauCompte=driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
				Actions action = new Actions(driver);
				action.click(NouveauCompte).perform();
				WebElement Prénom;
				Prénom=driver.findElement(By.xpath("//input[@placeholder='Prénom']"));
				Prénom.sendKeys("Maha");
				Thread.sleep(5000);
				WebElement Nom ;
				Nom=driver.findElement(By.xpath("//input[@name='lastname']"));
				Nom.sendKeys("Jomaa");
				Thread.sleep(5000);
				WebElement Numéro;
				Numéro=driver.findElement(By.xpath("//input[@name='reg_email__']"));
				Numéro.sendKeys("54662219");
				WebElement MotDePasse;
				MotDePasse=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
				MotDePasse.sendKeys("test1234");
				WebElement Jour;
				Jour=driver.findElement(By.id("day"));
				Select select = new Select(Jour);
				select.selectByValue("3");
				WebElement Mois;
				Mois=driver.findElement(By.id("month"));
				Select select1 = new Select(Mois);
				select1.selectByValue("3");
				WebElement Year;
				Year=driver.findElement(By.id("year"));
				Select select2 = new Select(Year);
				select2 .selectByValue("2021");
				WebElement Femme;
				Femme=driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
				action.click(Femme).perform();
				WebElement Inscrire;
				Inscrire=driver.findElement(By.xpath("//button[@name='websubmit']"));
				action.click(Inscrire);
				
				
				
				
				

	}

}
