package com.jqueryui.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ControlGroup extends Base {

	@Test
	public void testControlGroup() throws Exception {
		driver.get("https://jqueryui.com/controlgroup/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		// =====Car Rental====//
		driver.findElement(By.id("car-type-button")).click();
		List<WebElement> ele = driver.findElements(By.className("ui-menu-item"));
		for (int i = 0; i < ele.size(); i++) {
			String name = ele.get(i).getText();
			if (name.equalsIgnoreCase("truck")) {
				ele.get(i).click();
				break;
			}
		}

		driver.findElement(By.xpath("//label[@for='transmission-automatic']")).click();
		driver.findElement(By.xpath("//label[@for='insurance']")).click();
		driver.findElement(By.id("horizontal-spinner")).sendKeys("3");
		driver.findElement(By.cssSelector(".ui-widget.ui-controlgroup-item.ui-button.ui-corner-right")).click();

		driver.switchTo().defaultContent();
	}
}
