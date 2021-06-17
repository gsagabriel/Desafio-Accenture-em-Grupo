package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class BuscaVagaSteps {
	
	public WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        // Inserindo Pausa.
        wait = new WebDriverWait (driver, 10l);
		
	}

	@Dado("que estou no site da Accenture")
	public void que_estou_no_site_da_accenture() {
		driver.get("https://www.accenture.com/br-pt");
	}
	
	@E ("clico no menu Carreiras")
	public void clico_no_menu_carreiras() {
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navigation-menu\"]/div[4]/div[1]")));
		    driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[4]/div[1]")).click();
		
	}
		
	@E ("clico em procure vagas")
	public void clico_em_procure_vagas() {
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navigation-menu\"]/div[4]/div[1]/span")));

		driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[4]/div[1]/span")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Procure Por Vagas")));
		driver.findElement(By.linkText("Procure Por Vagas")).click();
	}

	@E ("digito no campo busca “desenvolvedor”")
	public void digito_no_campo_busca_desenvolvedor() {
		driver.findElement(By.id("job-search-hero-bar")).clear();
		driver.findElement(By.id("job-search-hero-bar")).sendKeys("Desenvolvedor");
	}

	@E ("clico no botão procurar")
	public void clico_no_botão_procurar() {
		driver.findElement(By.id("job-search-hero-bar")).sendKeys(Keys.ENTER);
	}

	@Então("devo encontrar vaga para programadores")
	public void devo_encontrar_vaga_para_programadores() {
		wait.until(ExpectedConditions.textToBe(By.className("search-results-text"), "TODAS AS VAGAS"));		
		assertEquals ("TODAS AS VAGAS", driver.findElement(By.className("search-results-text")).getText());
	}
	
	@After 
	public void depois() {
	driver.close();
						}

}
