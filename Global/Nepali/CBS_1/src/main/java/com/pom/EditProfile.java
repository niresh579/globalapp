package com.pom;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class EditProfile extends Base{
	
	public EditProfile(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	////////////////////////// Basic Details /////////////////////////
	
	@FindBy(id="createdfor")
	private WebElement profile_created_by;
	public WebElement getProfile_created_by() {
		return profile_created_by;
	}
	
	@FindBy(id="heightFeet")
	private WebElement height;
	public WebElement getHeight() {
		return height;
	}
	
	@FindBy(id="weightKgs")
	private WebElement weight_kgs;
	public WebElement getWeight_kgs() {
		return weight_kgs;
	}
	
	
	@FindBy(id="weightLbs")
	private WebElement weight_lbs;
	public WebElement getWeight_lbs() {
		return weight_lbs;
	}
	

	@FindBy(id="bodyType3")
	private WebElement body_type_slim;
	public WebElement getBody_type_slim() {
		return body_type_slim;
	}
	
	@FindBy(id="bodyType2")
	private WebElement body_type_athletic;
	public WebElement getBody_type_athletic() {
		return body_type_athletic;
	}
	
	
	@FindBy(id="bodyType1")
	private WebElement body_type_average;
	public WebElement getBody_type_average() {
		return body_type_average;
	}
	
	@FindBy(id="bodyType4")
	private WebElement body_type_heavy;
	public WebElement getBody_type_heavy() {
		return body_type_heavy;
	}
	
	@FindBy(id="complexion1")
	private WebElement complexion_veryFair;
	public WebElement getComplexion_veryFair() {
		return complexion_veryFair;
	}
	
	
	@FindBy(id="complexion2")
	private WebElement complexion_Fair;
	public WebElement getComplexion_Fair() {
		return complexion_Fair;
	}
	
	@FindBy(id="complexion3")
	private WebElement complexion_wheatish;
	public WebElement getComplexion_wheatish() {
		return complexion_wheatish;
	}


	@FindBy(id="complexion4")
	private WebElement complexion_wheatishbrown;
	public WebElement getComplexion_wheatishbrown() {
		return complexion_wheatishbrown;
	}
	
	
	@FindBy(id="complexion5")
	private WebElement complexion_dark;
	public WebElement getComplexion_dark() {
		return complexion_dark;
	}
	
	
	@FindBy(id="physicalStatus0")
	private WebElement physicalStatus_normal;
	public WebElement getPhysicalStatus_normal() {
		return physicalStatus_normal;
	}
	
	@FindBy(id="physicalStatus1")
	private WebElement physicalStatus_challenged;
	public WebElement getPhysicalStatus_challenged() {
		return physicalStatus_challenged;
	}
	
	
	@FindBy(id="samesubcaste1")
	private WebElement marry_sameCaste_btn;
	public WebElement getMarry_sameCaste_btn() {
		return marry_sameCaste_btn;
	}
	
	
	@FindBy(id="samesubcaste2")
	private WebElement marry_otherCaste_btn;
	public WebElement getMarry_otherCaste_btn() {
		return marry_otherCaste_btn;
	}
	
	
	@FindBy(id="spokenLanguages")
	private WebElement languageKnown;
	public WebElement getLanguageKnown() {
		return languageKnown;
	}
	

	@FindBy(id="star")
	private WebElement star;
	public WebElement getStar() {
		return star;
	}
	
	
	@FindBy(id="raasi")
	private WebElement raasi;
	public WebElement getRaasi() {
		return raasi;
	}
	
	
	@FindBy(id="eatingHabits1")
	private WebElement eatingHabits_Veg;
	public WebElement getEatingHabits_Veg() {
		return eatingHabits_Veg;
	}

	@FindBy(id="eatingHabits2")
	private WebElement eatingHabits_NonVeg;
	public WebElement getEatingHabits_NonVeg() {
		return eatingHabits_NonVeg;
	}


	@FindBy(id="eatingHabits3")
	private WebElement eatingHabits_egg;
	public WebElement getEatingHabits_egg() {
		return eatingHabits_egg;
	}

		
	@FindBy(id="eatingHabits4")
	private WebElement eatingHabits_Vegan;
	public WebElement getEatingHabits_Vegan() {
		return eatingHabits_Vegan;
	}
	
	
	@FindBy(id="smoke1")
	private WebElement smokingHabits_nonSmoker;
	public WebElement getSmokingHabits_nonSmoker() {
		return smokingHabits_nonSmoker;
	}


	@FindBy(id="smoke2")
	private WebElement smokingHabits_lightSmoker;
	public WebElement getSmokingHabits_lightSmoker() {
		return smokingHabits_lightSmoker;
	}

	
	@FindBy(id="smoke3")
	private WebElement smokingHabits_RegularSmoker;
	public WebElement getSmokingHabits_RegularSmoker() {
		return smokingHabits_RegularSmoker;
	}
	
	
	@FindBy(id="drink1")
	private WebElement drinkingHabits_nondrinker;
	public WebElement getDrinkingHabits_nondrinker() {
		return drinkingHabits_nondrinker;
	}
	

	@FindBy(id="drink2")
	private WebElement drinkingHabits_lighntdrinker;
	public WebElement getDrinkingHabits_lighntdrinker() {
		return drinkingHabits_lighntdrinker;
	}

	
		@FindBy(id="drink3")
	private WebElement drinkingHabits_regulardrinker;
	public WebElement getDrinkingHabits_regulardrinker() {
		return drinkingHabits_regulardrinker;
	}

	
	@FindBy(id="description")
	private WebElement about_me;
	public WebElement getAbout_me() {
		return about_me;
	}
	
	
	////////////////    Education and Occupation  /////////////////////////
	
	
	
	@FindBy(xpath="//*[@id=\"container2\"]/div[2]/a")//*[@id="container2"]/div[2]/a
	private WebElement education_occupation_edit_btn;
	public WebElement getEducation_occupation_edit_btn() {
		return education_occupation_edit_btn;
	}

	
	@FindBy(id="educationCategory")
	private WebElement education;
	public WebElement getEducation() {
		return education;
	}
	

	@FindBy(id="institutionName")
	private WebElement college_name;
	public WebElement getCollege_name() {
		return college_name;
	}
	

	@FindBy(id="educationInDetail")
	private WebElement education_detail;
	public WebElement getEducation_detail() {
		return education_detail;
	}

	
	@FindBy(id="employmentCategory1")
	private WebElement employment_government;
	public WebElement getEmployment_government() {
		return employment_government;
	}
	

	@FindBy(id="employmentCategory2")
	private WebElement employment_defence;
	public WebElement getEmployment_defence() {
		return employment_defence;
	}

	
	@FindBy(id="employmentCategory3")
	private WebElement employment_private;
	public WebElement getEmployment_private() {
		return employment_private;
	}

	

	@FindBy(id="employmentCategory4")
	private WebElement employment_business;
	public WebElement getEmployment_business() {
		return employment_business;
	}

	
	@FindBy(id="employmentCategory6")
	private WebElement employment_selfemployed;
	public WebElement getEmployment_selfemployed() {
		return employment_selfemployed;
	}


	@FindBy(id="employmentCategory7")
	private WebElement employment_notworking;
	public WebElement getEmployment_notworking() {
		return employment_notworking;
	}

	
	@FindBy(id="occupation")
	private WebElement occupation;
	public WebElement getOccupation() {
		return occupation;
	}
	
	
	@FindBy(id="occupationInDetail1")
	private WebElement occupation_detail;
	public WebElement getOccupation_detail() {
		return occupation_detail;
	}

	
	@FindBy(id="annualIncomeCurrency")
	private WebElement annual_income;
	public WebElement getAnnual_income() {
		return annual_income;
	}


	@FindBy(id="annualIncome")
	private WebElement annual_income_amount;
	public WebElement getAnnual_income_amount() {
		return annual_income_amount;
	}
	
	
	@FindBy(xpath="//*[@id=\"frmEducation\"]/div/input")
	private WebElement education_occupation_save_btn;
	public WebElement getEducation_occupation_save_btn() {
		return education_occupation_save_btn;
	}
	
	
	//////////////////////   Family  Details //////////////////////////////
	
	
	@FindBy(xpath="//*[@id=\"container3\"]/div[2]/a")
	private WebElement family_edit_btn;
	public WebElement getFamily_edit_btn() {
		return family_edit_btn;
	}
	
	
	
	@FindBy(id="familyValue1")
	private WebElement familyValue_othodox;
	public WebElement getFamilyValue_othodox() {
		return familyValue_othodox;
	}
	
	
	@FindBy(id="familyValue2")
	private WebElement familyValue_traditional;
	public WebElement getFamilyValue_traditional() {
		return familyValue_traditional;
	}
	
	
	@FindBy(id="familyValue3")
	private WebElement familyValue_moderate;
	public WebElement getFamilyValue_moderate() {
		return familyValue_moderate;
	}
	
	
	@FindBy(id="familyValue4")
	private WebElement familyValue_libreal;
	public WebElement getFamilyValue_libreal() {
		return familyValue_libreal;
	}
	
	
	@FindBy(id="familyType1")
	private WebElement familyType_joint;
	public WebElement getFamilyType_joint() {
		return familyType_joint;
	}
	
	
	@FindBy(id="familyType2")
	private WebElement familyType_nuclear;
	public WebElement getFamilyType_nuclear() {
		return familyType_nuclear;
	}

	@FindBy(id="familyStatus1")
	private WebElement familyStatus_middleClass;
	public WebElement getFamilyStatus_middleClass() {
		return familyStatus_middleClass;
	}
	
	@FindBy(id="familyStatus2")
	private WebElement familyStatus_upperMiddleClass;
	public WebElement getFamilyStatus_upperMiddleClass() {
		return familyStatus_upperMiddleClass;
	}
	
	
	
	@FindBy(id="familyStatus4")
	private WebElement familyStatus_rich;
	public WebElement getFamilyStatus_rich() {
		return familyStatus_rich;
	}
	
	
	
	@FindBy(id="ancestralOrigin")
	private WebElement native_place;
	public WebElement getNative_place() {
		return native_place;
	}
	
	
	
	@FindBy(id="fatherOccupation")
	private WebElement father_Occupation;
	public WebElement getFather_Occupation() {
		return father_Occupation;
	}
	
	
	
	@FindBy(id="motherOccupation")
	private WebElement mother_Occupation;
	public WebElement getMother_Occupation() {
		return mother_Occupation;
	}
	
	
	
	
	@FindBy(id="brothers")
	private WebElement no_of_brother;
	public WebElement getNo_of_brother() {
		return no_of_brother;
	}
	
			
	@FindBy(id="marriedBrothers")
	private WebElement brother_married;
	public WebElement getBrother_married() {
		return brother_married;
	}
	
			
	@FindBy(id="sisters")
	private WebElement no_of_sisters;
	public WebElement getNo_of_sisters() {
		return no_of_sisters;
	}
	
			
	@FindBy(id="marriedSisters")
	private WebElement sister_married;
	public WebElement getSister_married() {
		return sister_married;
	}
	
		
	@FindBy(id="familyDescription")
	private WebElement about_family;
	public WebElement getAbout_family() {
		return about_family;
	}
	
		
	
	@FindBy(xpath="//*[@id=\"frmFamily\"]/div/input")
	private WebElement family_save_btn;
	public WebElement getFamily_save_btn() {
		return family_save_btn;
	}
	 
	
	//////////////////////////////////////  Hobbies ////////////////////////////////////
	
	
	@FindBy(xpath="//*[@id=\"container6\"]/div[2]/a")
	private WebElement loaction_edit_btn;
	public WebElement getLoaction_edit_btn() {
		return loaction_edit_btn;
	}
	
	
	
	@FindBy(id="country")
	private WebElement country_living_in;
	public WebElement getCountry_living_in() {
		return country_living_in;
	}
	
	@FindBy(id="residingCityId")
	private WebElement residing_City;
	public WebElement getResiding_City() {
		return residing_City;
	}

	@FindBy(id="residingState")
	private WebElement residing_State;
	public WebElement getResiding_State() {
		return residing_State;
	}
	
	@FindBy(id="citizenship")
	private WebElement citizenship;
	public WebElement getCitizenship() {
		return citizenship;
	}
	
	@FindBy(id="placeofbirth")
	private WebElement place_of_birth;
	public WebElement getPlace_of_birth() {
		return place_of_birth;
	}
	
	@FindBy(id="residingCity")
	private WebElement residing_City_US;
	public WebElement getResiding_City_US() {
		return residing_City_US;
	}
	
	
	@FindBy(id="residentStatus")
	private WebElement resident_Status;
	public WebElement getResident_Status() {
		return resident_Status;
	}
	
	@FindBy(xpath="//*[@id=\"frmLocation\"]/div[2]/div/input")
	private WebElement location_save_btn;
	public WebElement getLocation_save_btn() {
		return location_save_btn;
	}
	
	
	@FindBy(xpath="//*[@id=\"container7\"]/div[2]/a")
	private WebElement edit_mail_btn;
	public WebElement getEdit_mail_btn() {
		return edit_mail_btn;
	}
	
	
	@FindBy(id="email")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	
	 
	@FindBy(xpath="//*[@id=\"frm\"]/dl[1]/dd/span/input")
	private WebElement email_save_btn;
	public WebElement getEmail_save_btn() {
		return email_save_btn;
	}
	
	
	@FindBy(xpath="//*[@id=\"container8\"]/div[2]/a")
	private WebElement mobile_number_edit_btn;
	public WebElement getMobile_number_edit_btn() {
		return mobile_number_edit_btn;
	}
	
		
	@FindBy(id="countryCode")
	private WebElement country_code;
	public WebElement getCountry_code() {
		return country_code;
	}
	
	@FindBy(id="mobileNo")
	private WebElement mobile_no;
	public WebElement getMobile_no() {
		return mobile_no;
	}
	
	@FindBy(id="verifyMobile")
	private WebElement mobile_no_save_button;
	public WebElement getMobile_no_save_button() {
		return mobile_no_save_button;
	}
	
	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a")
	private WebElement logout_menu;
	public WebElement getLogout_menu() {
		return logout_menu;
	}
	
	@FindBy(xpath="//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[1]/a")
	private WebElement edit_profile;
	public WebElement getEdit_profile() {
		return edit_profile;
	}
	
	@FindBy(xpath="//*[@id=\"userpop\"]/div[2]/div/div[3]/div[2]/ul/li[4]/a")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	
	
	
}
