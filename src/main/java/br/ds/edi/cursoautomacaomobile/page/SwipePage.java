package br.ds.edi.cursoautomacaomobile.page;

import static br.ds.edi.cursoautomacaomobile.core.DriverFactory.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import br.ds.edi.cursoautomacaomobile.core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SwipePage extends BasePage {

	public void swipeeLeftToRight(){
		TouchAction swipeL = new TouchAction(getDriver())
                .press(PointOption.point(250, 1200))
                .waitAction(WaitOptions
                		.waitOptions(Duration
                				.ofMillis(500)))
                .moveTo(PointOption.point(1000, 1200))
                .release();
		swipeL.perform();
	}
	
	public void swipeeRightToLeft(){
		TouchAction swipeR = new TouchAction(getDriver())
                .press(PointOption.point(1000, 450))
                .waitAction(WaitOptions
                		.waitOptions(Duration
                				.ofMillis(500)))
                .moveTo(PointOption.point(100, 450))
                .release();
		swipeR.perform();
	}
	
	public String obtertextoSwipe1() {
		return getDriver().findElement(By.xpath("//android.widget.TextView[2]")).getText();
	}
	
	
	


}
