package org.toasthub.test.core.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.toasthub.test.core.general.GeneralSettings;
import org.toasthub.test.core.selenium.Driver;

public class LoginPage {

	
	public static void login() {
		
		Driver.getInstance().get(GeneralSettings.hostWebContext+"/login/login.html");
		
		WebElement username = Driver.getInstance().findElement(By.id("LOGIN_FORM-LOGIN_FORM_USERNAME"));
		username.sendKeys("cborgAdmin");
		
		WebElement password = Driver.getInstance().findElement(By.id("LOGIN_FORM-LOGIN_FORM_PASSWORD"));
		password.sendKeys("Fast8Run#");
		
		WebElement button = Driver.getInstance().findElement(By.id("LOGIN_FORM-LOGIN_FORM_SUBMIT_BUTTON"));
		button.click();
		
		Driver.waitSeconds(1);
		
	}
}
