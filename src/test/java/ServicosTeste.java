import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServicosTeste {
	WebDriver driver;
	WebDriverWait wait;
			
	@Before
	public void setup() {
		
			// Configurando o Selenium.
	        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        // Inserindo Pausa.
	        wait = new WebDriverWait (driver, 10l);
	        
						}
	        
	@Test
	public void cenarioServico(){
		
		// Abre o Driver.
		driver.get("https://www.accenture.com/");   
					      
		 driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[2]/div[1]/span")).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Accenture Strategy")));
		 
		 assertEquals("Accenture Strategy", driver.findElement(By.linkText("Accenture Strategy")).getText());
		 assertEquals("Application Services", driver.findElement(By.linkText("Application Services")).getText());
		 assertEquals("Artificial Intelligence", driver.findElement(By.linkText("Artificial Intelligence")).getText());
		 assertEquals("Automation", driver.findElement(By.linkText("Automation")).getText());
		 assertEquals("Business Process Services", driver.findElement(By.linkText("Business Process Services")).getText());
		 assertEquals("Change Management", driver.findElement(By.linkText("Change Management")).getText());
		 assertEquals("CloudSteps", driver.findElement(By.linkText("CloudSteps")).getText());
		 assertEquals("Customer Experience", driver.findElement(By.linkText("Customer Experience")).getText());
		 assertEquals("Data & Analytics", driver.findElement(By.linkText("Data & Analytics")).getText());
		 assertEquals("Ecosystem Partners", driver.findElement(By.linkText("Ecosystem Partners")).getText());
		 assertEquals("Finance Consulting", driver.findElement(By.linkText("Finance Consulting")).getText());
		 assertEquals("Industry X", driver.findElement(By.linkText("Industry X")).getText());
		 assertEquals("Infrastructure", driver.findElement(By.linkText("Infrastructure")).getText());
		 assertEquals("Marketing", driver.findElement(By.linkText("Marketing")).getText());
		 assertEquals("Mergers & Acquisitions (M&A)", driver.findElement(By.linkText("Mergers & Acquisitions (M&A)")).getText());
		 assertEquals("Operating Models", driver.findElement(By.linkText("Operating Models")).getText());
		 assertEquals("Security", driver.findElement(By.linkText("Security")).getText());
		 assertEquals("Supply Chain Management", driver.findElement(By.linkText("Supply Chain Management")).getText());
		 assertEquals("Sustainability", driver.findElement(By.linkText("Sustainability")).getText());
		 assertEquals("Technology Consulting", driver.findElement(By.linkText("Technology Consulting")).getText());
		 assertEquals("Technology Innovation", driver.findElement(By.linkText("Technology Innovation")).getText());
		 assertEquals("Zero Based Budgeting (ZBB)", driver.findElement(By.linkText("Zero Based Budgeting (ZBB)")).getText());
		 
		 			
	}

			@After
	public void close() 	{
		// Fecha o Driver
		driver.close();
	}						      

}
