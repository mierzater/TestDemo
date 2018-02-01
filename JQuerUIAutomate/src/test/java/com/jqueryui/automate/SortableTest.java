package com.jqueryui.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SortableTest extends Base {

	@Test
	public void testSortable() throws Exception {
		driver.get("https://jqueryui.com/sortable/");
		Actions a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		List<WebElement> list = driver.findElements(By.tagName("li"));
		a.dragAndDrop(list.get(5), list.get(2)).perform();
		/*
		 * In Chrome Driver, Element can only be drag from the bottom to top, but not working
		 * on drag element from top to bottom ,such as move item1 to the item3.
		 * 
		 * But it working fine with Firefox Driver
		 */
		driver.switchTo().defaultContent();
	}
}
