package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;


public class CloudSteps {
	
	public WebDriver driver;
	WebDriverWait wait;
	
	@Dado("clico no item do menu Cloud")
	public void clico_no_item_do_menu_cloud() {
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Cloud")));
		driver.findElement(By.linkText("Cloud")).click();
	}

	@Então("devo encontrar o título {string}")
	public void devo_encontrar_o_título(String string) {
		assertEquals ("Serviços de Cloud", driver.findElement(By.xpath("//*[@id=\"full-width-text-container\"]/div/article/div/h1")).getText());
	}

}
