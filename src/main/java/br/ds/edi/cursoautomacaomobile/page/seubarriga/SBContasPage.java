package br.ds.edi.cursoautomacaomobile.page.seubarriga;

import static br.ds.edi.cursoautomacaomobile.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.ds.edi.cursoautomacaomobile.core.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class SBContasPage extends BasePage {
	
	public void clicarSalvar() {
		clicarPorTexto("SALVAR");
	}

	public void inserirNomeConta(String valor) {
		escrever(By.className("android.widget.EditText"), valor);
		
	}
	
	public void escolherConta(String valor) {
		clicarPorTexto(valor);
	}
	
	public void clicarExcluir() {
		clicarPorTexto("EXCLUIR");
	}
	
	public void cliqueLongoConta(String valor) {
		new TouchAction(getDriver())
		.longPress(ElementOption.element(getDriver()
				.findElement(By
						.xpath("//*[@text='"+valor+"']"))))
		.perform();
	}
	

}
