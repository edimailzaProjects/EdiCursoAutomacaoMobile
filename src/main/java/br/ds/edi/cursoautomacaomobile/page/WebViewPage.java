package br.ds.edi.cursoautomacaomobile.page;

import static br.ds.edi.cursoautomacaomobile.core.DriverFactory.getDriver;

import java.util.Set;

import org.openqa.selenium.By;

import br.ds.edi.cursoautomacaomobile.core.BasePage;

public class WebViewPage extends BasePage {
	
	public void entrarContextoWeb() {
		Set<String> contextHandles = getDriver().getContextHandles();
		for(String valor : contextHandles) {
			System.out.println(valor);
		}
		getDriver().context((String) contextHandles.toArray()[0]);
	
	}
	
	public void sairContextoWeb() {

		getDriver().context((String) getDriver().getContextHandles().toArray()[0]);
	
	}
	
	public void inserirEmail(String valor) {
		getDriver()
		.findElement(By.xpath("//*[@id=\"email\"]"))
		.sendKeys(valor);
	}
	
	public void inserirSenha(String valor) {
		getDriver()
		.findElement(By.id("senha"))
		.sendKeys(valor);
	}
	
	public void clicarEntrar() {
		getDriver()
		.findElement(By.xpath("/html/body/div[2]/form/button"))
		.click();
	}
	
}
