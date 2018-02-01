package com.jqueryui.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ResizableTest extends Base {

	@Test
	public void testResizable() throws Exception {
		driver.get("https://jqueryui.com/resizable/");
		Actions a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement src1  = driver.findElement(By.xpath(".//*[@id='resizable']/div[1]"));
		WebElement src2  = driver.findElement(By.xpath(".//*[@id='resizable']/div[2]"));
		WebElement src3  = driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		a.moveToElement(src1).clickAndHold().moveByOffset(57, 72).release().perform();
		Thread.sleep(3000);
		a.moveToElement(src2).clickAndHold().moveByOffset(30,150).release().perform();
		Thread.sleep(3000);
		a.moveToElement(src3).clickAndHold().moveByOffset(-50,-90).release().perform();
		driver.switchTo().defaultContent();
	}
}
