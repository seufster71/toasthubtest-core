package org.toasthub.test.core.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.toasthub.test.core.general.GeneralSettings;

public class Driver {

	private static WebDriver Instance;
	
	public static void Initialize() {
		System.setProperty("webdriver.chrome.driver", GeneralSettings.exePath);
		Instance = new ChromeDriver();
		Instance.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public static WebDriver getInstance() {
		return Instance;
	}

	//public static void setInstance(WebDriver instance) {
	//	Instance = instance;
	//}
	
	public static void waitSeconds(Integer seconds){
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
		}
	}
}
