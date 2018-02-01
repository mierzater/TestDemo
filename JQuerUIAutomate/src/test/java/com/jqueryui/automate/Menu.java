package com.jqueryui.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Menu extends Base {

	@Test
	public void testMenu() throws Exception {
		driver.get("https://jqueryui.com/menu/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions a = new Actions(driver);
		List<WebElement> item = driver.findElements(By.tagName("li"));
		for (int i = 0; i < item.size(); i++) {
			a.moveToElement(item.get(i)).perform();
			Thread.sleep(1000);
		}

	}
}
