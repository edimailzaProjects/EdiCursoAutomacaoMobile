package br.ds.edi.cursoautomacaomobile.page.seubarriga;

import org.openqa.selenium.By;

import br.ds.edi.cursoautomacaomobile.core.BasePage;

public class SBMovimentacaoPage extends BasePage {
	
	public void clicarSalvar() {
		clicarPorTexto("SALVAR");
	}
	
	public void inseirDescricao(String valor) {
		escrever(By.xpath("//android.widget.EditText[1]"), valor);
		
	}
	
	public void inseirInteressado(String valor) {
		escrever(By.xpath("//android.widget.EditText[2]"), valor);
	}
	
	public void inseirValor(String valor) {
		escrever(By.xpath("//android.widget.EditText[3]"), valor);
	}
	
	public void selecionarConta(String valor) {
		selecionarCombo(By.xpath("//android.widget.Spinner[2]"), valor);
	}
	
	public boolean verificarCampoObrigatório(String valor) {
		return existeElementoPorTexto(valor);
	}

}
