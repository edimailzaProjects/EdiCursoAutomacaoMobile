package br.ds.edi.cursoautomacaomobile.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.ds.edi.cursoautomacaomobile.core.BaseTest;
import br.ds.edi.cursoautomacaomobile.page.MenuPage;
import br.ds.edi.cursoautomacaomobile.page.ScroolPage;
import br.ds.edi.cursoautomacaomobile.page.SwipeListPage;

public class SwipeElementTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SwipeListPage swipee = new SwipeListPage();
	private ScroolPage scrool = new ScroolPage();
	
	@Test
	public void devemexerEmSwipeList() {
		
		scrool.scrollByText("Swipe List");
		esperar(3000);
		menu.acessarSwipeList();
		swipee.swipeElementoLtR("Opção 1");
		esperar(3000);
		menu.clicarPorTexto("(-)");
		esperar(3000);
		assertTrue(menu.existeElementoPorTexto("Opção 1 (-)"));
		
	}

}
