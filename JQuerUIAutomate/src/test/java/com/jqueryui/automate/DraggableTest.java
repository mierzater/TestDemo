package com.jqueryui.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DraggableTest extends Base {

	@Test
	public void testDraggable() {
		driver.get("https://jqueryui.com/draggable/");
		Actions a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		a.moveToElement(driver.findElement(By.id("draggable"))).clickAndHold().moveByOffset(145, 86).build().perform();
		driver.switchTo().defaultContent();
	}
}
