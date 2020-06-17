package br.ds.edi.cursoautomacaomobile.page.seubarriga;

import br.ds.edi.cursoautomacaomobile.core.BasePage;

public class SBMenuPage extends BasePage {
	
	public void acessarHome() {
		clicarPorTexto("HOME");
	}
	
	public void acessarContas() {
		clicarPorTexto("CONTAS");
	}
	
	public boolean verificarContaCriadaSucesso() {
		return existeElementoPorTexto("Conta adicionada com sucesso");
	}
	
	public void acessarMovimentacao() {
		clicarPorTexto("MOV...");
	}
	
	public void acessarResumo() {
		clicarPorTexto("RESUMO");
	}

}
