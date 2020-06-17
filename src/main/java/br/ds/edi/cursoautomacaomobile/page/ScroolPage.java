package br.ds.edi.cursoautomacaomobile.page;

import static br.ds.edi.cursoautomacaomobile.core.DriverFactory.getDriver;

import java.time.Duration;

import br.ds.edi.cursoautomacaomobile.core.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ScroolPage extends BasePage {
	
	public void scrollByText(String menuText) {

        try {
        	getDriver()
        	.findElement(MobileBy
            		 .AndroidUIAutomator(
            				 "new UiScrollable(new UiSelector()"
            				 + ".scrollable(true)"
            				 + ".instance(0))"
            				 + ".scrollIntoView(new UiSelector()"
            				 + ".textMatches(\"" + menuText + "\")"
            				 		+ ".instance(0));")); 
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
	
	public void scrollByID(String Id, int index) {

        try {

        	getDriver()
        	.findElement(MobileBy
        			.AndroidUIAutomator(
        					"new UiScrollable(new UiSelector()"
        					+ ".scrollable(true)"
        					+ ".instance(0))"
        					+ ".scrollIntoView(new UiSelector()"
        					+ ".resourceId(\""+Id+"\")"
        							+ ".instance("+index+"));")); 

        } catch (Exception e) {
           e.printStackTrace();
        }
    }
	
	public void scrollToBottom() {

	      int  x = getDriver().manage().window().getSize().width / 2;
	      int start_y = (int) (getDriver().manage().window().getSize().height * 0.2);
	      int end_y = (int) (getDriver().manage().window().getSize().height * 0.8);
	        TouchAction dragNDrop = new TouchAction(getDriver())
	                        .press(PointOption.point(x,start_y))
	                        .waitAction(WaitOptions
	                        		.waitOptions(Duration
	                        				.ofMillis(500)))
	                        .moveTo(PointOption.point(x, end_y))
	                        .release();
	        dragNDrop.perform();
	    }
	
}
