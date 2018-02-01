package com.jqueryui.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SelectableTest extends Base {

	@Test
	public void testSelectable() {
		driver.get("https://jqueryui.com/selectable/");
		Actions a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement item1  = driver.findElement(By.xpath(".//*[@id='selectable']/li[1]"));
		WebElement item3  = driver.findElement(By.xpath(".//*[@id='selectable']/li[3]"));
		WebElement item6  = driver.findElement(By.xpath(".//*[@id='selectable']/li[6]"));
		a.keyDown(Keys.CONTROL).moveToElement(item1).click().moveToElement(item3).click().moveToElement(item6).click().build().perform();
		driver.switchTo().defaultContent();
	}
}
