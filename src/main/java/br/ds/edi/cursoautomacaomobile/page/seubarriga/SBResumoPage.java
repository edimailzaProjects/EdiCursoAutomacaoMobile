package br.ds.edi.cursoautomacaomobile.page.seubarriga;

import br.ds.edi.cursoautomacaomobile.core.BasePage;
import br.ds.edi.cursoautomacaomobile.page.SwipeListPage;

public class SBResumoPage extends BasePage {
	
	//Nao insira imports em pages!!! Aqui � s� economia de tempo
	//pois o c�digo da aula est� errado!!!
	
	SwipeListPage swipee = new SwipeListPage();
	
	//Movimentacao 3, calculo saldo
	public void excluirMovimentacao(String valor) {
		swipee.swipeElementoLtR(valor);
	}
}
