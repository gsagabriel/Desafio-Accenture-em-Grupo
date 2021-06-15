import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cloud {
	WebDriver driver;
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
	public void cenarioServico() {

		// Abre o Driver.
		driver.get("https://www.accenture.com/");

		driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[2]/div[1]/span")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Cloud")));
		driver.findElement(By.linkText("Cloud")).click();
		assertEquals ("Serviços de Cloud", driver.findElement(By.xpath("//*[@id=\"full-width-text-container\"]/div/article/div/h1")).getText());
	}

	@After
	public void close() {
// Fecha o Driver
		driver.close();
	}

}
