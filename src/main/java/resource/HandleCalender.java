package resource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandleCalender extends Base{
   
	public static void select(String s) throws Exception {
    	 String year="";
		 String month="";
		 String day="";
		 int i=0;
		 while(s.charAt(i)!='/') {
			 month=month+s.charAt(i);
			 i++;
			 
		 }
		 i++;
		 while(s.charAt(i)!='/') {
			day=day+s.charAt(i);
			 i++;
			 
		 }
		
		
		 i++;
		 while(i<s.length()) {
			 year=year+s.charAt(i);
			 i++;
			 
		 }
		 Actions action = new Actions(driver);
	  	 WebElement element = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]"));
	  	action.moveToElement(element).click().build().perform();
  		Thread.sleep(1000);
     
        action.moveToElement(driver.findElement(By.xpath("//div[@class='mat-calendar-controls']/*[1]"))).click().build().perform();
        String xpathYear="//div[text()="+year+"]";
        Thread.sleep(1000);
        action.moveToElement(driver.findElement(By.xpath(xpathYear))).click().build().perform();
        Thread.sleep(1000);
        String xpathMonth="(//td[@role='gridcell'])["+month+"]";
        Thread.sleep(500);
        action.moveToElement(driver.findElement(By.xpath(xpathMonth))).click().build().perform();
        Thread.sleep(500);
        String xpathDay="(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])["+day+"]";
        action.moveToElement(driver.findElement(By.xpath(xpathDay))).click().build().perform();
        
    }
}
