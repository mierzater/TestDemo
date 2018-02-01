package com.jqueryui.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Accordion extends Base {

	@Test
	public void testAccordion() throws Exception {
		driver.get("https://jqueryui.com/accordion/");
		Actions a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		a.click(driver.findElement(By.id("ui-id-3"))).perform();
		Thread.sleep(3000);
		a.click(driver.findElement(By.id("ui-id-5"))).perform();
		Thread.sleep(3000);
		a.click(driver.findElement(By.id("ui-id-7"))).perform();
		driver.switchTo().defaultContent();
	}
}
