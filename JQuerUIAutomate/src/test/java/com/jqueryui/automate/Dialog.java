package com.jqueryui.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dialog extends Base {

	@Test
	public void testDialog() throws Exception {
		driver.get("https://jqueryui.com/dialog/");
		Actions a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//move dialog
		a.clickAndHold(driver.findElement(By.id("ui-id-1"))).moveByOffset(135, 120).release().perform();
		Thread.sleep(2000);
		//resize dialog
		a.dragAndDropBy(driver.findElement(By.cssSelector(".ui-resizable-handle.ui-resizable-nw")), -90,80).release().perform();
		Thread.sleep(2000);
		//close dialog
		a.click(driver.findElement(By.xpath("//button[@title='Close']"))).perform();
		driver.switchTo().defaultContent();
	}
}
