package br.ds.edi.cursoautomacaomobile.page;

import static br.ds.edi.cursoautomacaomobile.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import br.ds.edi.cursoautomacaomobile.core.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class CliquesPage extends BasePage {
	
	public void cliqueLongo() {
		new TouchAction<>(getDriver())
		.longPress(ElementOption.element(getDriver()
				.findElement(By
						.xpath("//*[@text='Clique Longo']"))))
		.perform();
	}
	
	public String obtertextoCampo() {
		return getDriver().findElement(By.xpath("//android.widget.TextView[2]")).getText();
	}
	

}
