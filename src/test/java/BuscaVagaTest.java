import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuscaVagaTest {

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
	public void cenario06() {
		
		// Busca o Site
		driver.get("https://accenture.com/");
		
		// Aguarda a opção ficar disponível para clique
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navigation-menu\"]/div[4]/div[1]/span")));
		
		// Abre o Menu e Aguarda para que a próxima ação ocorra
		driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[4]/div[1]/span")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Procure Por Vagas")));

		//Abre o menu de Busca por Vagas
		driver.findElement(By.linkText("Procure Por Vagas")).click();
		
		//Limpa o Campo
		driver.findElement(By.id("job-search-hero-bar")).clear();
		
		//Preenche o Campo de Pesquisa e busca
		driver.findElement(By.id("job-search-hero-bar")).sendKeys("Desenvolvedor");
		driver.findElement(By.id("job-search-hero-bar")).sendKeys(Keys.ENTER);
		
		// Aguarda a opção ficar disponível para clique
		wait.until(ExpectedConditions.textToBe(By.className("search-results-text"), "TODAS AS VAGAS"));		
		
		//Validação
		assertEquals ("TODAS AS VAGAS", driver.findElement(By.className("search-results-text")).getText());
				
	}

	@After
	public void close() {
// Fecha o Driver
		driver.close();
	}
}
