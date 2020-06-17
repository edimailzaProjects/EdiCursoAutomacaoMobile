package br.ds.edi.cursoautomacaomobile.page;

import static br.ds.edi.cursoautomacaomobile.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.ds.edi.cursoautomacaomobile.core.BasePage;
import br.ds.edi.cursoautomacaomobile.core.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class FormularioPage extends BasePage{
	
	public void escreverNome(String nome) {
		escrever(MobileBy.AccessibilityId("nome"), nome);
	}
	
	public String obterNome() {
		return obterTexto(MobileBy.AccessibilityId("nome"));
	}
	
	public void selecionarCombo(String nome) {
		selecionarCombo(MobileBy.AccessibilityId("console"), "Nintendo Switch");
	}
	
	public String obterOpcaoCombo() {
		return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
	}
	
	public boolean isCheckMarcado() {
		return isCheckMarcado(By.className("android.widget.CheckBox"));
	}
	
	public boolean isSwitchMarcado() {
		return isCheckMarcado(MobileBy.AccessibilityId("switch"));
	}
	
	public void clicarCheckBox() {
		clicar(By.className("android.widget.CheckBox"));;
	}
	
	public void clicarSwitch() {
		clicar(MobileBy.AccessibilityId("switch"));
	}
	
	public void salvar(String nome) {
		clicarPorTexto(nome);
	}
	
	public void salvarDemorado(String nome) {
		clicarPorTexto(nome);
	}
	
	public void clicarOk(String nome) {
		clicarPorTexto(nome);
	}
	
	public String obterItensCadastrados(String nome) {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, '"+ nome +"')]"));
	}
	
	public void clicarSeekBar(double posicao) {	
		int delta =55;
		MobileElement seek = getDriver().findElement(By.className("android.widget.SeekBar"));
		
		int y = seek.getLocation().y + (seek.getSize().height /2);
		System.out.println(y);
		
		int xInicial = seek.getLocation().x + delta;
		int x = (int)(xInicial + ((seek.getSize().width - 2*delta) * posicao));
		System.out.println(x);
		
		new TouchAction(getDriver()).press(PointOption.point(x, y)).perform();
		tapa(x,y);
		
//		MobileElement seek_bar=DriverFactory.getDriver().findElement(By.className("android.widget.SeekBar"));
//		
//		int start=seek_bar.getLocation().getX();
//		int end=seek_bar.getSize().getWidth();
//		int y=seek_bar.getLocation().getY();
//		
//	    TouchAction action= new TouchAction(DriverFactory.getDriver());
//	    int moveTo=(int)(end*posicao);
//	    action.longPress(PointOption.point(start,y)).moveTo(PointOption.point(moveTo,y)).release().perform();
//		
//		new TouchAction(getDriver()).longPress(ElementOption.element(getDriver().findElement(By.xpath("//*[@text='"+origem+"']")))).moveTo(ElementOption.element(getDriver().findElement(By.xpath("//*[@text='"+destino+"']")))).release().perform();
		
//		MobileElement seek_bar = getDriver().findElement(MobileBy.AccessibilityId("slid"));
//		seek_bar.sendKeys(posicao);
		
//		MobileElement seekBar = getDriver().findElement(MobileBy.AccessibilityId("slid"));
//	
//		int startX = seekBar.getLocation().getX();
//		System.out.println(startX);
//
//		    int endX = seekBar.getSize().getWidth();
//		    System.out.println(endX);
//		
//		    int yAxis = seekBar.getLocation().getY();
//		    
//		    int moveToXDirectionAt = (int)(posicao + startX);
//		    System.out.println("Moving seek bar at " + moveToXDirectionAt+" In X direction.");
//
//		    //TouchAction act = new TouchAction(getDriver());
//		    //act.press(PointOption.point(startX,yAxis)).waitAction().moveTo(PointOption.point(moveToXDirectionAt,yAxis)).release().perform();
//		    
//		    tap(startX,moveToXDirectionAt);
	
	}

}
