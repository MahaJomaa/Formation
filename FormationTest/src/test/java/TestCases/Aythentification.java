package TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aythentification {

	public static void main(String[] args) throws InterruptedException {
		// Identification (chemin) ChromeDriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouverture Chrome
		WebDriver driver;
		driver = new ChromeDriver();
		//Maximase window
		driver.manage().window().maximize();
		//delete cookies
		driver.manage().deleteAllCookies();
		//ouvrir URL
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	
		//Identification des éléments
		WebElement username;
		username=driver.findElement(By.name("username"));
		WebElement password;
		password=driver.findElement(By.name("password"));
		WebElement Login;
		Login=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		//action
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		Login.click();
		Thread.sleep(5000);
		
		WebElement profil;
		profil=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
		String texte ;
		texte=profil.getText();
		Assert.assertEquals(texte , "MUHAMMAD ANWAR");
		System.out.println("test OK");
		driver.close();
		
		
		
	
		
		
		
		

	}

}
