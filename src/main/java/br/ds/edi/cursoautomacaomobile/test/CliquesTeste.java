package br.ds.edi.cursoautomacaomobile.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ds.edi.cursoautomacaomobile.core.BaseTest;
import br.ds.edi.cursoautomacaomobile.page.CliquesPage;
import br.ds.edi.cursoautomacaomobile.page.MenuPage;

public class CliquesTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private CliquesPage cliques = new CliquesPage();
	
	
	@Before
	public void setup() {
		//Acessar Menu
		menu.acessarCliques();
	}
	
	@Test
	public void deveRealizarCliqueLongo() {
		//Clique Longo
		cliques.cliqueLongo();
		
		//Verificar texto
		assertEquals("Clique Longo", cliques.obtertextoCampo());
	}
	
	@Test
	public void deveRealizarCliqueDuplo() {

		//Clique Duplo
		menu.clicarPorTexto("Clique duplo");
		menu.clicarPorTexto("Clique duplo");
		
		//Verificar texto
		assertEquals("Duplo Clique", cliques.obtertextoCampo());
	}

}
