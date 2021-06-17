import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SobreTest {

	public WebDriver driver;
	WebDriverWait wait;

	@Before
	public void setup() {

		// Configurando o Selenium.
		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Inserindo Pausa.
		wait = new WebDriverWait(driver, 10l);
	}
		
		@Test
		public void cenario07() {
			
			// Busca o Site
			driver.get("https://accenture.com/");
			
			// Aguarda a opção ficar disponível para clique
			wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navigation-menu\"]/div[5]/div[1]/span")));
			
			// Abre o Menu e Aguarda para que a próxima ação ocorra
			driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[5]/div[1]/span")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sobre a Accenture")));

			//Abre o menu Sobre a Accenture
			driver.findElement(By.linkText("Sobre a Accenture")).click();
			
			//Validação
			assertEquals ("Nosso propósito:", driver.findElement(By.className("sectionTitle")).getText());
					
		}

		@After
		public void close() {
	// Fecha o Driver
			driver.close();
		}
}
