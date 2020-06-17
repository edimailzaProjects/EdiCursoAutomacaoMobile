package br.ds.edi.cursoautomacaomobile.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.ds.edi.cursoautomacaomobile.core.BaseTest;
import br.ds.edi.cursoautomacaomobile.page.MenuPage;
import br.ds.edi.cursoautomacaomobile.page.SplashPage;

public class SplashTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SplashPage splash = new SplashPage();
	
	@Test
	public void deveAguardarSplashSumir() {
		
		//Acessar Menu Splash
		menu.acessarSplash();
		
		//Verificar que o Splash está sendo exibido
		splash.isTelaSplashVisivel();
		
		//Aguardar saída do Splash
		splash.aguardarSplashSumir();
		
		//verificar que o formuláqio está aparecendo
		assertTrue(splash.existeElementoPorTexto("Formulário"));
	}

}
