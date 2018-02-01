package com.jqueryui.automate;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Button extends Base {

	@Test
	public void testButton() throws Exception {
		driver.get("https://jqueryui.com/button/");
		//Actions a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.xpath(".//button[@class='ui-button ui-corner-all ui-widget']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//input[@class='ui-button ui-corner-all ui-widget']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//a[@class='ui-button ui-corner-all ui-widget']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//button[@class='ui-button ui-widget ui-corner-all']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//input[@class='ui-button ui-widget ui-corner-all']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//a[@class='ui-button ui-widget ui-corner-all']")).click();
		driver.switchTo().defaultContent();
	}
}
