package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class ServicosSteps {

	// Variáveis Globais
	public WebDriver driver;
	WebDriverWait wait;

	@E ("clico no menu Serviços")
	public void clico_no_menu_Serviços() {
		
		 driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[2]/div[1]/span")).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Accenture Strategy")));
	}

	@Então("devo ver os Serviços abaixo")
	public void devo_ver_os_servicos_abaixo() {
		
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

}
