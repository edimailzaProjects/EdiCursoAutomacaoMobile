package br.ds.edi.cursoautomacaomobile.test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import br.ds.edi.cursoautomacaomobile.core.BaseTest;
import br.ds.edi.cursoautomacaomobile.page.AlertasPage;
import br.ds.edi.cursoautomacaomobile.page.MenuPage;

public class AlertasTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AlertasPage alertas = new AlertasPage();
	
	@Before
	public void setup() {
		//Acessar Menu de Alerta
		menu.acessarAletas();			
	}
	
	@Test
	public void deveConfirmarAlerta() {
		
		
		//Clicar em Alerta Confirm
		alertas.clicarAlertaConfirm();
		
		//Verificar os textos
		
		assertEquals("Info", alertas.obterTituloAlerta());
		assertEquals("Confirma a operação?", alertas.obtertextoAlerta());
		
		//Confirmar Alerta
		alertas.confirmarAlerta();
		
		//Verificar nova Mensagem
		esperar(2000);
		assertEquals("Confirmado", alertas.obtertextoAlerta());
		
		// Sair
		alertas.sairAlerta();
		
		//Verificar se saiu da caixa de alertas
		//assertFalse(alertas.existeElementoPorTexto("Confirma a operação?"));
	}
	
	@Test
	public void deveClicarForaAlerta() {
		
		//Clicar alerta simples
		alertas.clicarAlertaSimples();
		esperar(3000);
		
		//Clicar fora da caixa
		alertas.clicarForaCaixa();
		esperar(2000);
		
		//Verificar que a mensagem não existe mais
		assertFalse(menu.existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));
	}
}
