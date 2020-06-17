package br.ds.edi.cursoautomacaomobile.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ds.edi.cursoautomacaomobile.core.BaseTest;
import br.ds.edi.cursoautomacaomobile.core.DriverFactory;
import br.ds.edi.cursoautomacaomobile.page.FormularioPage;
import br.ds.edi.cursoautomacaomobile.page.MenuPage;
import io.appium.java_client.MobileBy;

public class FormularioTeste extends BaseTest{
	
	private MenuPage menu = new MenuPage();
	private FormularioPage formulario = new FormularioPage();
	
	@Before
	public void inicializarAppium() throws MalformedURLException {
		menu.acessarFormulario();
	}
	
	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {
		formulario.escreverNome("Hello World!");
		
	    assertEquals("Hello World!", formulario.obterNome());
	}
	
	@Test
	public void deveInteragirCombo() throws MalformedURLException {
		formulario.selecionarCombo( "Nintendo Switch");
		
	    String resultadoObtido =  formulario.obterOpcaoCombo();
	    assertEquals("Nintendo Switch", resultadoObtido);
	}

	
	@Test
	public void deveInteragirSwichCheckBox() throws MalformedURLException {
	     assertFalse(formulario.isCheckMarcado());
	     assertTrue(formulario.isSwitchMarcado());
	     
	     formulario.clicarCheckBox();
	     formulario.clicarSwitch();
	     
	     assertTrue(formulario.isCheckMarcado());
	     assertFalse(formulario.isSwitchMarcado());
	}
	
	@Test
	public void deveRealizarCadastro() throws MalformedURLException{
		formulario.escreverNome("Desafio Edi");
		formulario.clicarCheckBox();
		formulario.clicarSwitch();
		formulario.selecionarCombo("Nintendo Switch");
		formulario.salvar("SALVAR");
	    
	    String nome =  formulario.obterItensCadastrados("Nome: Desafio Edi");
	    assertEquals("Nome: Desafio Edi", nome);
	    
	    String combo =  formulario.obterItensCadastrados("Console: switch");
	    assertEquals("Console: switch", combo);

	    String switc = formulario.obterItensCadastrados("Switch"); 
	    assertTrue(switc.endsWith("Off"));
	    
	    String check = formulario.obterItensCadastrados("Checkbox"); 
	    assertTrue(check.endsWith("Marcado"));
	}
	
	@Test
	public void deveRealizarCadastroDemorado() throws MalformedURLException{
		formulario.escreverNome("Aula de Esperas");
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		formulario.salvarDemorado("SALVAR DEMORADO");
		
		//esperar(3000);
	    
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text = 'Nome: Aula de Esperas']")));
	    
	    String nome =  formulario.obterItensCadastrados("Nome: Aula de Esperas");
	    assertEquals("Nome: Aula de Esperas", nome);
	}
	
	@Test
	public void deveAlterarData() {
		
		formulario.clicarPorTexto("01/01/2000");
		formulario.clicarPorTexto("20");
		formulario.clicarOk("OK");
		
		esperar(3000);
		
		String nome =  formulario.obterItensCadastrados("20/2/2000");
	    assertEquals("20/2/2000", nome);
	}
	
	@Test
	public void deveAlterarHora() {
		formulario.clicarPorTexto("06:00");
		formulario.clicar(MobileBy.AccessibilityId("12"));
		esperar(1000);
		formulario.clicar(MobileBy.AccessibilityId("30"));
		formulario.clicarOk("OK");
		
		esperar(3000);
		
		String nome =  formulario.obterItensCadastrados("12:30");
	    assertEquals("12:30", nome);
	}
	
	@Test
	public void deveInteragirComSeekbar() {
		esperar(3000);
		
		//clicar no seekbar
		formulario.clicarSeekBar(0.4);
		
		esperar(3000);
		
		//salvar
		formulario.salvar("SALVAR");
		
		//obter o valor
		
	}
	
}
