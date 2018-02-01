package com.jqueryui.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DatePicker extends Base {

	@Test
	public void testDatePicker() throws Exception {
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("datepicker")).click();
		while(!driver.findElement(By.className("ui-datepicker-year")).getText().contains("2019")) {
			driver.findElement(By.cssSelector("#ui-datepicker-div > div > a.ui-datepicker-next.ui-corner-all > span")).click();
		}
		while(!driver.findElement(By.className("ui-datepicker-month")).getText().contains("April")) {
			driver.findElement(By.cssSelector("#ui-datepicker-div > div > a.ui-datepicker-next.ui-corner-all > span")).click();
		}
		List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
		for(int i=0;i<dates.size();i++) {
			if(dates.get(i).getText().contains("6")) {
				dates.get(i).click();
				break;
			}
		}
	}
}
