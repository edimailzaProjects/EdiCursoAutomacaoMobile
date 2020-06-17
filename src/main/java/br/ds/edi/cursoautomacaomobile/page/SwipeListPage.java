package br.ds.edi.cursoautomacaomobile.page;

import static br.ds.edi.cursoautomacaomobile.core.DriverFactory.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;

import br.ds.edi.cursoautomacaomobile.core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeListPage extends BasePage {
	
	public void swipeeElement(MobileElement element, double inicio, double fim){
		TouchAction action = new TouchAction(getDriver());
		
        int y = element.getLocation().getY() + (element.getSize().getHeight() / 2);
        
        int startX = (int)(element.getSize().getWidth() * inicio);
        int endX = (int)(element.getSize().getWidth() * fim);
        

        action.press(PointOption.point(startX, y))
        .waitAction(WaitOptions
        		.waitOptions(Duration
        				.ofMillis(500)))
        .moveTo(PointOption.point(endX, y))
        .release()
        .perform();
	}
	
	public void swipeElementoRtL(String opcao) {
		swipeeElement(getDriver().findElementByXPath("//*[@text='"+opcao+"']/.."), 0.1, 0.9);
	}
	
	public void swipeElementoLtR(String opcao) {
		swipeeElement(getDriver().findElementByXPath("//*[@text='"+opcao+"']/.."), 0.9, 0.1);
	}
	
	public String obtertextoSwipe1() {
		return getDriver().findElement(By.xpath("//android.widget.TextView[0]")).getText();
	}

}
