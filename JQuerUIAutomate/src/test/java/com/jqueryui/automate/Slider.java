package com.jqueryui.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider extends Base {

	@Test
	public void testSlider() throws Exception {
		driver.get("https://jqueryui.com/slider/");
		Actions a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement ele = driver.findElement(By.xpath(".//*[@id='slider']/span"));
		a.dragAndDropBy(ele, 50, 0).perform();
		Thread.sleep(1000);
		a.dragAndDropBy(ele, 200, 0).perform();
		Thread.sleep(1000);
		a.dragAndDropBy(ele, -100, 0).perform();
		driver.switchTo().defaultContent();
	}
}
