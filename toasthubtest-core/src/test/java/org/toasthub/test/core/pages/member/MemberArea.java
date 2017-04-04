package org.toasthub.test.core.pages.member;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.toasthub.test.core.selenium.Driver;

public class MemberArea {

	public static Boolean IsAt() {
		try {
			Driver.getInstance().findElement(By.id("MemberArea"));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
