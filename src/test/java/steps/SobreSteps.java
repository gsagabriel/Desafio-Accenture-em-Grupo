package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class SobreSteps {
	
	// Variáveis Globais
	public WebDriver driver;
	WebDriverWait wait;
	
	@E ("clico no menu sobre a accenture")
	public void clico_no_menu_sobre_a_accenture() {
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navigation-menu\"]/div[5]/div[1]/span")));
		driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[5]/div[1]/span")).click();
	}

	@E ("clico no item do menu sobre a accenture")
	public void clico_no_item_do_menu_sobre_a_accenture() {
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sobre a Accenture")));
		driver.findElement(By.linkText("Sobre a Accenture")).click();
	}

	@Então("devo ver o destaque em {texto}")
	public void devo_ver_o_destaque_em(String texto) {
		assertEquals ("Nosso propósito:", driver.findElement(By.className("sectionTitle")).getText());
	}

}
