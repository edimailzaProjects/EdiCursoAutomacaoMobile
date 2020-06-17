package br.ds.edi.cursoautomacaomobile.page;

import org.openqa.selenium.By;

import br.ds.edi.cursoautomacaomobile.core.BasePage;

public class AccordionPage extends BasePage {
	
	public void acessarAccordion() {
		clicarPorTexto("Accordion");
	}
	
	public void acessarOpcao1() {
		clicarPorTexto("Opção 1");
	}
	
	public boolean isOpcao1() {
		return existeElementoPorTexto("Esta é a descrição da opção 1");
	}
	
	public String obterValorDaOpcao1() {
		return obterTexto(By.xpath("//*[@text='Esta é a descrição da opção 1']"));
	}

}
