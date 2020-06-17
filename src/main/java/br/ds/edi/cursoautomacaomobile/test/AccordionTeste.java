package br.ds.edi.cursoautomacaomobile.test;

import org.junit.Assert;
import org.junit.Test;

import br.ds.edi.cursoautomacaomobile.core.BaseTest;
import br.ds.edi.cursoautomacaomobile.page.AccordionPage;
import br.ds.edi.cursoautomacaomobile.page.MenuPage;

public class AccordionTeste extends BaseTest {
	
	MenuPage menu = new MenuPage();
	AccordionPage accordion = new AccordionPage();
	
	@Test
	public void deveInteragirAccordion() {
		
		//Deve acessar Accordion
		accordion.acessarAccordion();
		
		//Deve clicar Opcao 1
		accordion.acessarOpcao1();
		esperar(2000);
		
		//Verificar texto da Opção 1
		//Assert.assertTrue(accordion.isOpcao1());
		Assert.assertEquals("Esta é a descrição da opção 1",accordion.obterValorDaOpcao1());
	}

}
