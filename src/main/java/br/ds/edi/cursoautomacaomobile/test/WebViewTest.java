package br.ds.edi.cursoautomacaomobile.test;

import org.junit.Test;

import br.ds.edi.cursoautomacaomobile.core.BaseTest;
import br.ds.edi.cursoautomacaomobile.page.MenuPage;
import br.ds.edi.cursoautomacaomobile.page.WebViewPage;

public class WebViewTest extends BaseTest {
	
	MenuPage menu = new MenuPage();
	WebViewPage webVieww = new WebViewPage();
	
	@Test
	public void deveFazerLogin() {
		
		
		menu.acessarSeuBarrigaHibrido();
		esperar(5000);
		
		webVieww.entrarContextoWeb();
		
//		webVieww.inserirEmail("edi@massa.um");
//		webVieww.inserirSenha("123456");
//		webVieww.clicarEntrar();
//		
		
		
	}
	
//	@After
//	public void sairContexto() {
//		webVieww.sairContextoWeb();
//	}


}
