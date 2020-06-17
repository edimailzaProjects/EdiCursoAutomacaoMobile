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
		scrool.scrollByText("Op��o bem escondida");
		menu.clicarPorTexto("Op��o bem escondida");
		
		assertEquals("Voc� achou essa op��o", alertas.obterQualquerTextoAlerta());
		esperar(2000);
		menu.clicarPorTexto("OK");
	}

}
