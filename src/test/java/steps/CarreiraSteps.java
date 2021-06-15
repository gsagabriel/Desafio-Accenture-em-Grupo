package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class CarreiraSteps {

	public WebDriver driver;
	WebDriverWait wait;
	
		@Dado("clico no menu Carreiras")
	public void clico_no_menu_carreiras() {
			
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navigation-menu\"]/div[4]/div[1]")));
		    driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[4]/div[1]")).click();
		
	}

	@E ("clico no item do menu Vagas em Tecnologia")
	public void clico_no_item_do_menu_vagas_em_tecnologia() {
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Vagas em tecnologia")));
		driver.findElement(By.linkText("Vagas em tecnologia")).click();
	}
	
	@Então("devo ver o destque em Carreiras em Tecnologia")
	public void devo_ver_o_destque_em_carreiras_em_tecnologia() {
		assertEquals ("Carreiras em tecnologia", driver.findElement(By.xpath("//*[@id=\"aoi-hero\"]/div/div/div[1]/div/article/div/h1")).getText());
	}
	
}
