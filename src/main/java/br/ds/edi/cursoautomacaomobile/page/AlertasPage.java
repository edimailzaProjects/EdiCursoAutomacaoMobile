package br.ds.edi.cursoautomacaomobile.page;

import org.openqa.selenium.By;

import br.ds.edi.cursoautomacaomobile.core.BasePage;

public class AlertasPage extends BasePage {
	
	public void clicarAlertaConfirm() {
		clicarPorTexto("ALERTA CONFIRM");
	}
	
	public String obtertextoAlerta() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Confirma')]"));
	}
	
	public String obterTituloAlerta() {
		return obterTexto(By.id("android:id/alertTitle"));
	}
	
	public void confirmarAlerta() {
		clicarPorTexto("CONFIRMAR");
	}
	
	public void sairAlerta() {
		clicarPorTexto("SAIR");
	}
	
	public void clicarAlertaSimples() {
		clicarPorTexto("ALERTA SIMPLES");
	}
	
	public void clicarForaCaixa() {
		tapa(200, 200);
	}
	
	public String obterQualquerTextoAlerta() {
		return obterTexto(By.id("android:id/message"));
	}

}
