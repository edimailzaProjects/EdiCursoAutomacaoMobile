package br.ds.edi.cursoautomacaomobile.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ds.edi.cursoautomacaomobile.core.BaseTest;
import br.ds.edi.cursoautomacaomobile.page.AlertasPage;
import br.ds.edi.cursoautomacaomobile.page.MenuPage;
import br.ds.edi.cursoautomacaomobile.page.ScroolPage;

public class ScroolTest extends BaseTest {
	
	MenuPage menu = new MenuPage();
	ScroolPage scrool = new ScroolPage();
	AlertasPage alertas = new AlertasPage();
	
	@Test
	public void deveRolarScrollPorTexto() {
		scrool.scrollByText("Opção bem escondida");
		menu.clicarPorTexto("Opção bem escondida");
		
		assertEquals("Você achou essa opção", alertas.obterQualquerTextoAlerta());
		esperar(2000);
		menu.clicarPorTexto("OK");
	}

}
