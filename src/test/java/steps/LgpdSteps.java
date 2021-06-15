package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;

public class LgpdSteps {

	// Variáveis Globais
	public WebDriver driver;
	WebDriverWait wait;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
        
	}

	@Dado("que estou no site da Accenture")
	public void que_estou_no_site_da_accenture() {
		driver.get("https://www.accenture.com/br-pt");
	}

	@E ("aceito os Termos LGPD")
	public void aceito_os_termos_lgpd() {
		 // Inserindo Pausa.
		wait = new WebDriverWait (driver, 10l);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"onetrust-pc-btn-handler\"]")));
		driver.findElement(By.xpath("//*[@id=\"onetrust-pc-btn-handler\"]")).click();
	}

	@Entao("deve-se fechar a caixa de informações")
	public void deve_se_fechar_a_caixa_de_informações() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='onetrust-pc-sdk']/div[3]/div/button")));
		driver.findElement(By.xpath("//div[@id='onetrust-pc-sdk']/div[3]/div/button")).click();
		assertEquals("Procuram-se líderes", driver.findElement(By.xpath("//*[@id=\"1\"]//*/p/span")).getText());
			}
	
	@Então("clico em configurações de cookie")
	public void clico_em_configurações_de_cookie() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"optanon-minimize-button\"]")));
		driver.findElement(By.xpath("//*[@id=\"optanon-minimize-button\"]")).click();
	}
	
	@Então("devo ver o item de sua privacidade")
	public void devo_ver_o_item_de_sua_privacidade() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"privacy-text\"]")));
			assertEquals("Sua privacidade", driver.findElement(By.xpath("//*[@id=\"privacy-text\"]")).getText());
	}

	@Então("devo ver Cookies estritamente necessárias")
	public void devo_ver_cookies_estritamente_necessárias() {
		   assertEquals("Cookies estritamente necessárias", driver.findElement(By.xpath("//*[@id=\"ot-header-id-1\"]")).getText());
	}
	
	@Então("devo ver Cookies Analíticos de Primeira Parte")
	public void devo_ver_cookies_analíticos_de_primeira_parte() {
		assertEquals("Cookies Analíticos de Primeira Parte", driver.findElement(By.xpath("//*[@id=\"ot-header-id-2\"]")).getText());
	}
	
	@Então("devo ver Cookies de Desempenho e Cookies Funcionais")
	public void devo_ver_cookies_de_desempenho_e_cookies_funcionais() {
		assertEquals("Cookies de Desempenho e Cookies Funcionais", driver.findElement(By.xpath("//*[@id=\"ot-header-id-3\"]")).getText());
	}
	
	@Então("devo ver Cookies de Publicidade e Redes Sociais")
	public void devo_ver_cookies_de_publicidade_e_redes_sociais() {
			assertEquals("Cookies de Publicidade e Redes Sociais", driver.findElement(By.xpath("//*[@id=\"ot-header-id-4\"]")).getText());
	}
	
	
	@After 
	public void depois() {
	driver.close();
						}

}