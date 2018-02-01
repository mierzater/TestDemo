package com.jqueryui.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Autocomplete extends Base {

	@Test
	public void testAutocomplete() throws Exception {
		driver.get("https://jqueryui.com/autocomplete/");
		Actions a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		a.click(driver.findElement(By.id("tags"))).sendKeys("a").perform();
		Thread.sleep(1000);
		List <WebElement> ele = driver.findElements(By.className("ui-menu-item-wrapper"));
		for(int i=0;i<ele.size();i++) {
			String name = ele.get(i).getText();
			if(name.equalsIgnoreCase("java")) {
				ele.get(i).click();
				break;
			}
		}
		driver.switchTo().defaultContent();
	}
}
