package br.ds.edi.cursoautomacaomobile.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.ds.edi.cursoautomacaomobile.core.BaseTest;
import br.ds.edi.cursoautomacaomobile.page.MenuPage;
import br.ds.edi.cursoautomacaomobile.page.SwipePage;

public class SwipeTeste extends BaseTest {
	
	MenuPage menu = new MenuPage();
	SwipePage swipee = new SwipePage();
	
	@Test
	public void deveRealizarSwipe() {
		
		menu.acessarSwipe();
		
		//Validar tela de swipe acessada com sucesso
		esperar(3000);
		assertEquals("a esquerda", swipee.obtertextoSwipe1());
		esperar(3000);
		
		//Swipe da direita para a esquerda
		swipee.swipeeRightToLeft();
		
		//Vizualizar mensagem 'e vejo se'
		assertEquals("você consegue", swipee.obtertextoSwipe1());
		
		//clicar botão direita
		menu.clicarPorTexto("›");
		
		//verificar o texto chegar ate o fim
		esperar(2000);
		assertTrue(menu.existeElementoPorTexto("Chegar até o fim!"));
		
		//swipe da esquerda para a direita
		swipee.swipeeLeftToRight();
		
		//clicar botao da esqueda 
		menu.clicarPorTexto("‹");
		esperar(2000);
		
		//verificar texto
		assertEquals("a esquerda", swipee.obtertextoSwipe1());
		
	}

}
