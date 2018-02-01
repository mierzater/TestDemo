package com.jqueryui.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tooltip extends Base {

	@Test
	public void testTooltip() throws Exception {
		driver.get("https://jqueryui.com/tooltip/");
		Actions a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		a.moveToElement(driver.findElement(By.cssSelector("body > p:nth-child(1) > a"))).perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.cssSelector("body > p:nth-child(2) > a"))).perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.cssSelector("#age"))).perform();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
	}
}
