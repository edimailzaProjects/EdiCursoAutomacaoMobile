package br.ds.edi.cursoautomacaomobile.page.seubarriga;

import br.ds.edi.cursoautomacaomobile.core.BasePage;
import br.ds.edi.cursoautomacaomobile.page.SwipeListPage;

public class SBResumoPage extends BasePage {
	
	//Nao insira imports em pages!!! Aqui é só economia de tempo
	//pois o código da aula está errado!!!
	
	SwipeListPage swipee = new SwipeListPage();
	
	//Movimentacao 3, calculo saldo
	public void excluirMovimentacao(String valor) {
		swipee.swipeElementoLtR(valor);
	}
}
