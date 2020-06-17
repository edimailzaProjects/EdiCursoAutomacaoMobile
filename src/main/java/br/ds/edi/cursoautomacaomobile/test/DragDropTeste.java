package br.ds.edi.cursoautomacaomobile.test;

import org.junit.Assert;
import org.junit.Test;

import br.ds.edi.cursoautomacaomobile.core.BaseTest;
import br.ds.edi.cursoautomacaomobile.page.DragDropPage;
import br.ds.edi.cursoautomacaomobile.page.MenuPage;
import br.ds.edi.cursoautomacaomobile.page.ScroolPage;

public class DragDropTeste extends BaseTest {
	
	MenuPage menu = new MenuPage();
	ScroolPage scrool = new ScroolPage();
	DragDropPage dd = new DragDropPage();
	
	private String[] estadoInicial = new String[] {
			"Esta", 
			"é uma lista", 
			"Drag em Drop!", 
			"Faça um clique longo,", 
			"e arraste para", 
			"qualquer local desejado."};
	
	@Test
	public void deveEfetuarDragDrop() {
		
		//Acessar menu
		scrool.scrollByText("Drag and drop");
		
		//Acessar Drag and Drop
		menu.acessarDragDrop();
		
		//verificarEstadoInicial
		esperar(3000);
		
		Assert.assertArrayEquals(estadoInicial, dd.obterListagem());
		
		//Arrastar "Esta" para "arasta e para"
	
		//Verificar estado intermediário
		
		//Arrastar "faça um clique longo" para "é uma lista"
	}

}
