package com.jqueryui.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SelectMenu extends Base {

	@Test
	public void testSelectMenu() throws Exception {
		driver.get("https://jqueryui.com/selectmenu/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//Actions a = new Actions(driver);
		
		//=== select speed===//
		driver.findElement(By.id("speed-button")).click();
		List<WebElement> item = driver.findElements(By.tagName("li"));
		for (int i = 0; i < item.size(); i++) {
			String name = item.get(i).getText();
			if(name.equalsIgnoreCase("fast")) {
				item.get(i).click();
			}
		}
		Thread.sleep(2000);
		//====select file ===//
		driver.findElement(By.id("files-button")).click();
		List<WebElement> item1 = driver.findElements(By.tagName("li"));
		for (int i = 0; i < item1.size(); i++) {
			String name = item1.get(i).getText();
			if(name.equalsIgnoreCase("ui.jQuery.js")) {
				item1.get(i).click();
			}
		}
		Thread.sleep(2000);
		//===select number====//
		
		driver.findElement(By.id("number-button")).click();
		List<WebElement> item2 = driver.findElements(By.tagName("li"));
		for (int i = 0; i < item2.size(); i++) {
			String name = item2.get(i).getText();
			if(name.equalsIgnoreCase("4")) {
				item2.get(i).click();
			}
		}
		Thread.sleep(2000);
		//===select tile ===//
		
		driver.findElement(By.id("salutation-button")).click();
		List<WebElement> item3 = driver.findElements(By.tagName("li"));
		for (int i = 0; i < item3.size(); i++) {
			String name = item3.get(i).getText();
			if(name.equalsIgnoreCase("Prof.")) {
				item3.get(i).click();
			}
		}
		

	}
}
