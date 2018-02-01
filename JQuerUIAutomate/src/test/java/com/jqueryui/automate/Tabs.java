package com.jqueryui.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tabs extends Base {

	@Test
	public void testTabs() throws Exception {
		driver.get("https://jqueryui.com/tabs/");
		Actions a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		a.click(driver.findElement(By.id("ui-id-1"))).perform();
		Thread.sleep(3000);
		a.click(driver.findElement(By.id("ui-id-2"))).perform();
		Thread.sleep(3000);
		a.click(driver.findElement(By.id("ui-id-3"))).perform();
		driver.switchTo().defaultContent();
	}
}
