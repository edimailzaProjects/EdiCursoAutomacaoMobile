package br.ds.edi.cursoautomacaomobile.page.seubarriga;

import org.openqa.selenium.By;

import br.ds.edi.cursoautomacaomobile.core.BasePage;

public class SBLoginPage extends BasePage {

	public void inserirEmail(String valor) {
		escrever(By.xpath("//android.widget.EditText[1]"), valor);
	}
	
	
	public void inserirSenha(String valor) {
		escrever(By.xpath("//android.widget.EditText[2]"), valor);
	}
	
	public void clicarEntrar() {
		clicarPorTexto("ENTRAR");
	}
	
	public boolean verificarConectadoSucesso() {
		return existeElementoPorTexto("HOME");
	}
}
