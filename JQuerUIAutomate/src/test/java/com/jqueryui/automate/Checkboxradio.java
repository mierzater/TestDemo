package com.jqueryui.automate;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Checkboxradio extends Base {

	@Test
	public void testCheckboxradio() throws Exception {
		driver.get("http://jqueryui.com/checkboxradio/");
		//Actions a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		//=======Radio Button Click====//
		driver.findElement(By.xpath("//label[@for='radio-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='radio-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='radio-3']")).click();
		Thread.sleep(1000);
		
		//=======CheckBox Click=====//
		
		driver.findElement(By.xpath("//label[@for='checkbox-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='checkbox-3']")).click();
		Thread.sleep(1000);
	
		//=======CheckBox Nested Click=====//
		
		
	driver.findElement(By.xpath("//label[@for='checkbox-nested-1']")).click();	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//label[@for='checkbox-nested-2']")).click();	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//label[@for='checkbox-nested-3']")).click();	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//label[@for='checkbox-nested-4']")).click();	
	Thread.sleep(1000);

		driver.switchTo().defaultContent();
	}
}
