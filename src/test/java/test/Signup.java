package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObject.Personal_Details;
import resource.Base;
import utlities.ReadXl;

public class Signup extends Base {
	@BeforeMethod
	public void launch() throws Exception {
		initialize();
		String address = prop.getProperty("address");
		driver.get(address);
	}

	@Test(dataProviderClass =ReadXl.class, dataProvider = "provide")
	public void signup(String referral, String first_name, String last_name,String contact, String whatsapp,String gender,
			String dob,String flat_no,String building_no,String street_no,String LandMark,String state,String city,String pin,
			String insta,String twitter) throws Exception {
		
	        Personal_Details test=new Personal_Details();
	        test.referral(referral);
	        test.firstName(first_name);
	        test.lastName(last_name);
	        test.contactNumber(contact);
	        test.whatsappNumber(whatsapp);
	        test.gender(gender);
	        test.dateOfBirth(dob);
	        test.flatNo(flat_no);
	        test.buildingNo(building_no);
	        test.streetNo(street_no);
	        test.landMark(LandMark);
	        test.state(state);
	        test.city(city);
	        test.pinCode(pin);
	        test.instaGram(insta);
	        test.twitter(twitter);
	        
	        test.next();

	 
	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
