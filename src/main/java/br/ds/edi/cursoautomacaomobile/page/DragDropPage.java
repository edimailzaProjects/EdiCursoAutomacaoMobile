package br.ds.edi.cursoautomacaomobile.page;

import static br.ds.edi.cursoautomacaomobile.core.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;

import br.ds.edi.cursoautomacaomobile.core.BasePage;
import io.appium.java_client.MobileElement;

public class DragDropPage extends BasePage {

	public void arrastar(String origem, String destino) {
		
		MobileElement inicio = getDriver().findElementByXPath("//*[@text='"+origem+"']");
		MobileElement fim = getDriver().findElementByXPath("//*[@text='"+destino+"']");
				
//		TouchAction<> dragNDrop = new TouchAction(getDriver())
//                .longPress(PointOption.point(new Point(inicio)))
//                .waitAction(WaitOptions
//                		.waitOptions(Duration
//                				.ofMillis(500)))
//                .moveTo(PointOption.point((new Point(fim))
//                .release();
//		dragNDrop.perform();
	}

	public String[] obterListagem() {
		List<MobileElement> elements = getDriver()
				.findElements(By.className("android.widget.TextView"));

		/*
		 * 1 - monte o array; 2 - O tamanho dele será exatamente o tamaho da lista que
		 * acabou de coletar; 3 - Crie o laço de repetição para coletar os elementos
		 * retornados da lista;
		 */
		
		String[] retorno = new String[elements.size()];
		for (int i = 0; i < elements.size(); i++) {
			retorno[i] = elements.get(i).getText();
			System.out.print("\"" + retorno[i] + "\", ");
		}
		return retorno;
	}

}
