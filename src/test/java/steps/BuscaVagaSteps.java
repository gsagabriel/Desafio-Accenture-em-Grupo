package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class BuscaVagaSteps {
	
	public WebDriver driver;
	WebDriverWait wait;
	
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
		driver.findElement(By.xpath("//*[@id=\"job-search-hero-bar\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"job-search-hero-bar\"]")).sendKeys("Desenvolvedor");
	}

	@E ("clico no botão procurar")
	public void clico_no_botão_procurar() {
		driver.findElement(By.xpath("//*[@id=\"job-search-hero-bar\"]")).sendKeys(Keys.ENTER);
	}

	@Então("devo encontrar vaga para programadores")
	public void devo_encontrar_vaga_para_programadores() {
		wait.until(ExpectedConditions.textToBe(By.className("search-results-text"), "TODAS AS VAGAS"));		
		assertEquals ("TODAS AS VAGAS", driver.findElement(By.xpath("//*[@id=\"latest-nav\"]/h2/span[1]")).getText());
	}

}
