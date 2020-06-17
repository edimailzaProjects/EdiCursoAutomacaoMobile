package br.ds.edi.cursoautomacaomobile.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ds.edi.cursoautomacaomobile.core.BaseTest;
import br.ds.edi.cursoautomacaomobile.page.MenuPage;
import br.ds.edi.cursoautomacaomobile.page.seubarriga.SBContasPage;
import br.ds.edi.cursoautomacaomobile.page.seubarriga.SBHomePage;
import br.ds.edi.cursoautomacaomobile.page.seubarriga.SBLoginPage;
import br.ds.edi.cursoautomacaomobile.page.seubarriga.SBMenuPage;
import br.ds.edi.cursoautomacaomobile.page.seubarriga.SBMovimentacaoPage;
import br.ds.edi.cursoautomacaomobile.page.seubarriga.SBResumoPage;

public class SBTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private SBLoginPage login = new SBLoginPage();
	private SBMenuPage sbMenuPage = new SBMenuPage();
	private SBContasPage sbcontasPage = new SBContasPage();
	private SBMovimentacaoPage sbMovimentacaoPage = new SBMovimentacaoPage();
	private SBHomePage sbHomePage = new SBHomePage();
	private SBResumoPage sbResumoPage = new SBResumoPage();

	@Before
	public void setup() {
		menu.acessarSeuBarrigaNativo();
		esperar(3000);
		login.inserirEmail("edi@massa.um");
		esperar(3000);
		login.inserirSenha("123456");
		esperar(3000);
		login.clicarEntrar();
		esperar(3000);
	}

	@Test
	public void conectarSucesso() {
		Boolean acessouHome = login.verificarConectadoSucesso();
		Assert.assertTrue("Home", acessouHome);
	}

	@Test
	public void adcionarExcluirContaSucesso() {
		sbMenuPage.acessarContas();
		esperar(3000);
		sbcontasPage.inserirNomeConta("Conta Teste");
		esperar(2000);
		sbcontasPage.clicarSalvar();
		esperar(3000);

		Boolean criouConta = login.verificarConectadoSucesso();
		Assert.assertTrue("Conta adicionada com sucesso", criouConta);

		esperar(2000);

		sbcontasPage.cliqueLongoConta("Conta Teste");
		esperar(1000);
		sbcontasPage.clicarExcluir();

		Boolean excluiuConta = login.verificarConectadoSucesso();
		Assert.assertTrue("Conta exclu�da com sucesso", excluiuConta);
	}

	@Test
	public void valirdarInclusao() {
		sbMenuPage.acessarMovimentacao();
		esperar(3000);

		sbMovimentacaoPage.clicarSalvar();

		Boolean exibiuMensagemC1Obrigatorio = sbMovimentacaoPage
				.verificarCampoObrigat�rio("Descri��o � um campo obrigat�rio");
		assertTrue("Descri��o � um campo obrigat�rio", exibiuMensagemC1Obrigatorio);

		sbMovimentacaoPage.inseirDescricao("Descri��o");
		sbMovimentacaoPage.clicarSalvar();

		Boolean exibiuMensagemC2Obrigatorio = sbMovimentacaoPage
				.verificarCampoObrigat�rio("Interessado � um campo obrigat�rio");
		assertTrue("Interessado � um campo obrigat�rio", exibiuMensagemC2Obrigatorio);

		sbMovimentacaoPage.inseirInteressado("Interessado");
		sbMovimentacaoPage.clicarSalvar();
		esperar(3000);

		Boolean exibiuMensagemC3Obrigatorio = sbMovimentacaoPage
				.verificarCampoObrigat�rio("Valor � um campo obrigat�rio");
		assertTrue("Valor � um campo obrigat�rio", exibiuMensagemC3Obrigatorio);
		esperar(3000);

		sbMovimentacaoPage.inseirValor("100");
		sbMovimentacaoPage.clicarSalvar();

		Boolean exibiuMensagemC4Obrigatorio = sbMovimentacaoPage
				.verificarCampoObrigat�rio("Conta � um campo obrigat�rio");
		assertTrue("Conta � um campo obrigat�rio", exibiuMensagemC4Obrigatorio);
		esperar(3000);

		sbMovimentacaoPage.selecionarConta("Teste");
		sbMovimentacaoPage.clicarSalvar();

		Boolean exibiuMensagemC5Obrigatorio = sbMovimentacaoPage
				.verificarCampoObrigat�rio("Movimenta��o cadastrada com sucesso");
		assertTrue("Movimenta��o cadastrada com sucesso", exibiuMensagemC5Obrigatorio);
		esperar(3000);
	}
	
	@Test
	public void deveAtualizarSaldoAoIncluirMOvimentacao() {
		
		//clicar no reset antes de iniciar o teste
		
		//Verificar Saldo atual R$534.00
		
		String contaParaSaldo = sbHomePage.obterSaldoConta("Conta para saldo");
		assertEquals("534.00",contaParaSaldo);
		
		//ir para resumo
		sbMenuPage.acessarResumo();
		esperar(3000);
		
		//Excluir movimentacao 3
		sbResumoPage.excluirMovimentacao("Movimentacao 3, calculo saldo");
		esperar(3000);
		sbResumoPage.clicarPorTexto("Del");
		
		//Validar a mensagem Movimentacao removida com sucesso
		Boolean exibiuRemovidaComSucesso = sbMovimentacaoPage
				.verificarCampoObrigat�rio("Movimenta��o removida com sucesso!");
		assertTrue("exibiuRemovidaComSucesso",exibiuRemovidaComSucesso);
		
		//voltar home
		esperar(2000);
		sbResumoPage.clicarPorTexto("HOME");
		
		//atualizar saldo
		String contaParaSaldoNegativo = sbHomePage.obterSaldoConta("Conta para saldo");
		assertEquals("-1000.00",contaParaSaldoNegativo);
		//saldo atual + 100
		
	}

}
