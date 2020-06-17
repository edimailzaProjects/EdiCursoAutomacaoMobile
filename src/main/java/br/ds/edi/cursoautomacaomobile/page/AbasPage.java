package br.ds.edi.cursoautomacaomobile.page;

import br.ds.edi.cursoautomacaomobile.core.BasePage;

public class AbasPage extends BasePage {
	
	public void acessarAbas(){
		clicarPorTexto("Abas");
	}

	public void clicarAbaUm(){
		clicarPorTexto("ABA 1");
	}
	
	public boolean isAbaUm() {
		return existeElementoPorTexto("Este � o conte�do da Aba 1");
	}
	
	public void clicarAbaDois(){
		clicarPorTexto("ABA 2");
	}
	
	public boolean isAbaDois() {
		return existeElementoPorTexto("Este � o conte�do da Aba 2");
	}
	
}
