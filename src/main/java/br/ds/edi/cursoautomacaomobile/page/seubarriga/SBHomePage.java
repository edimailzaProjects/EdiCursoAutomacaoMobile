package br.ds.edi.cursoautomacaomobile.page.seubarriga;

import org.openqa.selenium.By;

import br.ds.edi.cursoautomacaomobile.core.BasePage;

public class SBHomePage extends BasePage {
	
	public String obterSaldoConta(String valor) {
		return obterTexto(By.xpath("//*[@text='"+valor+"']/following-sibling::android.widget.TextView"));
	}

}
