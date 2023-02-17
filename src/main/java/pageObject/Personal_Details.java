package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import resource.Base;
import resource.HandleCalender;

public class Personal_Details extends Base{

	 private By referral=By.id("mat-input-0"); 
	 private By firstName=By.id("mat-input-1");
	 private By lastName=By.id("mat-input-2");
	 private By contactNumber=By.id("mat-input-3");
	 private By whatsappNumber=By.id("mat-input-4");
	 private By gender=By.id("mat-input-5");
	 
	 private By flatNo=By.id("mat-input-7");
	 private By buildingNo=By.id("mat-input-8");
	 private By streetNo=By.id("mat-input-9");
	 private By landMark=By.id("mat-input-10");
	 private By state=By.id("mat-input-11");
	 private By city=By.xpath("//div[@id='mat-select-value-1']");
	 private By pinCode=By.id("mat-input-13");
	 private By instaGram=By.id("mat-input-14");
	 private By twitter=By.id("mat-input-15");
	 private By next=By.xpath("//button[@value='Submit']");
	 public void referral(String s) {
    	 driver.findElement(referral).sendKeys(s);
     }
	 public void firstName(String s) throws InterruptedException {
    	 driver.findElement(firstName).sendKeys(s);
    	 Thread.sleep(1000);
     }
	 public void lastName(String s) throws Exception {
    	 driver.findElement(lastName).sendKeys(s);
    	 Thread.sleep(1000);
     }
	 public void contactNumber(String s) throws InterruptedException {
    	 driver.findElement(contactNumber).sendKeys(s);
    	 Thread.sleep(1000);
     }
	 public void whatsappNumber(String s) throws InterruptedException {
    	 driver.findElement(whatsappNumber).sendKeys(s);
    	 Thread.sleep(1000);
     }
	 public void gender(String s) throws InterruptedException {
		
	  		Select looking=new Select(driver.findElement(gender));
	  		looking.selectByValue(s);
	  		 Thread.sleep(1000);
    	 
     }
	 public void dateOfBirth(String s) throws Exception {
		HandleCalender.select(s);
		 Thread.sleep(1000);
     }
	 public void flatNo(String s) throws InterruptedException {
    	 driver.findElement(flatNo).sendKeys(s);
    	 Thread.sleep(1000);
     }
	 public void buildingNo(String s) throws InterruptedException {
    	 driver.findElement(buildingNo).sendKeys(s);
    	 Thread.sleep(1000);
     }
	 public void streetNo(String s) throws InterruptedException {
    	 driver.findElement(streetNo).sendKeys(s);
    	 Thread.sleep(1000);
     }
	 public void landMark(String s) {
    	 driver.findElement(landMark).sendKeys(s);
     }
	 public void state(String s) {
		 Select looking=new Select(driver.findElement(state));
	  		looking.selectByValue(s);
     }
	 public void city(String s) throws Exception {
	        Thread.sleep(1000);
	  		
	  		Actions a=new Actions(driver);
	  		a.moveToElement(driver.findElement(city)).click().perform();
	  	   Thread.sleep(1000);
	  		WebElement city=driver.findElement(By.xpath("//input[@placeholder='Search city...']"));
	  		city.sendKeys(s);
	  		Thread.sleep(1000);
	  		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]")).click();
	  		
	  		Thread.sleep(1000);
     }
	 public void pinCode(String s) throws InterruptedException {
    	 driver.findElement(pinCode).sendKeys(s);
    	 Thread.sleep(1000);
     }
	 public void instaGram(String s) throws Exception {
    	 driver.findElement(instaGram).sendKeys(s);
    	 Thread.sleep(1000);
     }
	 public void twitter(String s) throws Exception {
    	 driver.findElement(twitter).sendKeys(s);
    	 Thread.sleep(1000);
     }
	 public void next() {
		 driver.findElement(next).click();
	 }
	 
}
