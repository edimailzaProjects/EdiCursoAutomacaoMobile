package br.ds.edi.cursoautomacaomobile.test;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.ds.edi.cursoautomacaomobile.core.BaseTest;
import br.ds.edi.cursoautomacaomobile.page.AbasPage;
import br.ds.edi.cursoautomacaomobile.page.MenuPage;


public class AbasTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AbasPage abas = new AbasPage();
	
	@Test
	public void deveInteragirCombo() {
		
		//Acessar menu Abas
		menu.acessarAbas();
		
		//Verificar que está na Aba 1
		
		assertTrue(abas.isAbaUm());
		
		//Acessar Aba 2
		abas.clicarAbaDois();
		
		// Verificar que está na Aba 2
		assertTrue(abas.isAbaDois());
	}

}
