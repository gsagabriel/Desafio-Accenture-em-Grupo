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
import io.cucumber.java.pt.Então;


public class CloudSteps {
	
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
	
	@E ("clico no menu Serviços")
	public void clico_no_menu_Serviços() {
		
		 driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[2]/div[1]/span")).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Accenture Strategy")));
	}
	
	@E ("clico no item do menu CloudTest")
	public void clico_no_item_do_menu_cloud() {
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("CloudTest")));
		driver.findElement(By.linkText("CloudTest")).click();
	}

	@Então("devo encontrar o título {string}")
	public void devo_encontrar_o_título(String string) {
		assertEquals ("Serviços de CloudTest", driver.findElement(By.xpath("//*[@id=\"full-width-text-container\"]/div/article/div/h1")).getText());
	}

	@After 
	public void depois() {
	driver.close();
						}
	
}
