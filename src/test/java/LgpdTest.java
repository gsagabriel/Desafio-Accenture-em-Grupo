import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LgpdTest {
	
	// Variáveis Globais
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
		public void cenario01() {		
			
			// Abre o Driver
			driver.get("https://www.accenture.com/");   
						
		    // Pausa para identificar o Botão em caso de Alguma instabilidade
			        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"onetrust-pc-btn-handler\"]")));
	    
			// Identifica e abre o botão de LGPD 
			driver.findElement(By.xpath("//*[@id=\"onetrust-pc-btn-handler\"]")).click();  	
			
			// Pausa para identificar o Botão em caso de Alguma instabilidade			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='onetrust-pc-sdk']/div[3]/div/button")));
	    
		    // Identifica e Aceita os termos. 			
			driver.findElement(By.xpath("//div[@id='onetrust-pc-sdk']/div[3]/div/button")).click();
			
			// Validar se a Modal fechou
			assertEquals ("Procuram-se líderes", driver.findElement(By.xpath("//*[@id=\"1\"]//*/p/span")).getText());
							}
		
		@Test
		public void cenario02(){
			
			// Abre o Driver.
			driver.get("https://www.accenture.com/");   
						
		    // Pausa para identificar o Botão em caso de Alguma instabilidade
			        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"onetrust-pc-btn-handler\"]")));
	    
			// Identifica e abre o botão de LGPD 
			driver.findElement(By.xpath("//*[@id=\"onetrust-pc-btn-handler\"]")).click();  	
			
			// Pausa para identificar o Botão em caso de Alguma instabilidade			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='onetrust-pc-sdk']/div[3]/div/button")));
	    
		    // Identifica e Aceita os termos. 			
			driver.findElement(By.xpath("//div[@id='onetrust-pc-sdk']/div[3]/div/button")).click();

			// Pausa para Validação e Abertura do Modal
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"optanon-minimize-button\"]")));
			driver.findElement(By.xpath("//*[@id=\"optanon-minimize-button\"]")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"privacy-text\"]")));
			
			// Validações do Modal
			assertEquals("Sua privacidade", driver.findElement(By.xpath("//*[@id=\"privacy-text\"]")).getText());
			assertEquals("Cookies estritamente necessárias", driver.findElement(By.xpath("//*[@id=\"ot-header-id-1\"]")).getText());
			assertEquals("Cookies Analíticos de Primeira Parte", driver.findElement(By.xpath("//*[@id=\"ot-header-id-2\"]")).getText());
			assertEquals("Cookies de Desempenho e Cookies Funcionais", driver.findElement(By.xpath("//*[@id=\"ot-header-id-3\"]")).getText());
			assertEquals("Cookies de Publicidade e Redes Sociais", driver.findElement(By.xpath("//*[@id=\"ot-header-id-4\"]")).getText());			
		}

				@After
		public void close() 	{
			// Fecha o Driver
			driver.close();
		}						      

								}
