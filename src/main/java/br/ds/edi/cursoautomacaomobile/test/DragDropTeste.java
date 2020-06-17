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
			"� uma lista", 
			"Drag em Drop!", 
			"Fa�a um clique longo,", 
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
	
		//Verificar estado intermedi�rio
		
		//Arrastar "fa�a um clique longo" para "� uma lista"
	}

}
