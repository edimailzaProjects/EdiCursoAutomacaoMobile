package br.ds.edi.cursoautomacaomobile.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculadoraTeste {
	
	@Test
	public void deveSomarDoisValores() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "Pixel 2 API 24");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
	    desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	    
	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");
	    AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
	    
	    MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_1");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("plus");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("equals");
	    el4.click();
	    MobileElement el5 = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
	    el5.click();
	    System.out.println("O restuldado da soma é: " + el5.getText());
	    String obtido = el5.getText();
	    Assert.assertEquals("4", obtido);
	    
	    driver.quit();
	}

}
