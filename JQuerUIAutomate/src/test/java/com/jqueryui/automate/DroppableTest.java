package com.jqueryui.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DroppableTest extends Base {

	@Test
	void testDroppable() {
		driver.get("https://jqueryui.com/droppable/");
		Actions a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(src, target).build().perform();
		driver.switchTo().defaultContent();
	}
}
