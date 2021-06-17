import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarreiraTest {

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
	public void cenario05() {
		
		//Recebe o Site
		driver.get("https://accenture.com/");
		
		// Aguarda o Menu de Navegação se tornar passível de clique
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navigation-menu\"]/div[4]/div[1]")));
		
		// Clica no menu Carreiras
		driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[4]/div[1]")).click();
		
		//Aguarda a opção para Clique
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Vagas em tecnologia")));
		
		// Clica no Item
		driver.findElement(By.linkText("Vagas em tecnologia")).click();
		
		// Valida o teste
		assertEquals("Carreiras em tecnologia",
				driver.findElement(By.cssSelector("h1")).getText());

	}

	@After
	public void close() {
// Fecha o Driver
		driver.close();
	}

}