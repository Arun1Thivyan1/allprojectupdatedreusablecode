package anfas;

public class subclassforxpath 
{
	
	
   public static final String email_path="//*[text()='Email']//following-sibling::input";
	
	
	
	public static final String Password_path ="//*[text()='Password']//following-sibling::input";  
	
	
	
	public static final String submit_button="//*[text()='SIGN IN']";
	
	
	
	
	
	
	public static final String sidemenu_button ="//*[@id='vertical-menu-btn']"; 

	
	
	
	
	
	
	public static final String clickbeneficiarybutton ="//*[text()=' Beneficiary']"; 
	
	
	
	
	
	public static final String clickreoprtbutton ="//*[text()=' Report']"; 
	
	
	

	
	
	public static final String clickusermangtbutton ="//*[text()=' User Management']"; 
	
	
	
	
	public static final String clickpmbutton ="//*[text()=' Project Manager']";
	
	
	
	public static final String clickchbutton ="//*[text()=' Committee Head']";
	
	
	
	
	
	
	
	
	
	
	
	public static final String clicknewbeneficiarybutton ="//*[text()=' Create Beneficiary ']"; 
	
	
	
	public static final String clicknewpmbutton ="//*[text()=' Add ']"; 
	
	
	
	
	public static final String uploadimage ="//*[text()='Upload Image']//preceding-sibling::h5//child::img"; 
	
	
	
	public static final String beneficiaryname ="//*[text()='Name']//following-sibling::input";
	
	
	
	public static final String pmfirstname ="//*[text()='First Name']//following-sibling::input";
	
	
	
	
	public static final String pmlastname ="//*[text()='Last Namee']//following-sibling::input";
	
	
	

	

	
	
	public static final String beneficiarymobilenumber ="//*[text()='Mobile Number']//following-sibling::input"; 


	public static final String beneficiaryemail ="//*[text()='Emaill']//following-sibling::input"; 

	
	public static final String beneficiarydate ="//*[text()='DOB']//following-sibling::input"; 
	
	
	public static final String beneficiarynationalid ="//*[text()='National ID']//following-sibling::input"; 
	
	
	public static final String beneficiaryservicetype ="//*[text()='Service type']//following-sibling::ng-select"; 
	
	
		
	
	public static final String beneficiaryservicetypevalues ="//*[text()='Test service 4']";
	
	
	public static final String beneficiaryregion ="(//*[text()='Region']//following-sibling::ng-select)[2]"; 
	
	
	
	
	
	//*[@role='option']//child::*[text()='Qaseem']

	public static final String beneficiaryregiontypevalues ="//*[@role='option']//child::*[text()='Qaseem']";
	
	
	public static final String beneficiaryaddress ="//*[text()='Address']//following-sibling::input";
	
	
	public static final String beneficiarygender ="//*[text()='Gender']//following-sibling::ng-select";
	
	
	public static final String beneficiarygendervalues ="//*[text()='Male']";
	
	
	public static final String beneficiaryheightvalue ="//*[text()='Height']//following-sibling::input";
	
	
	public static final String beneficiaryweightvalue ="//*[text()='Weight']//following-sibling::input";
	
	
	
	
	
	//public static final String beneficiaryassigncaregiver ="(//*[text()='Caregiver'])[2]//following-sibling::ng-select";

	
	
	
	
	
	public static final String beneficiarycaregiverdropdown = "(//*[text()='Caregiver'])[2]//following-sibling::ng-select"; // or input/span, depending on your UI
	public static final String caregiverValue = "//div[@class='ng-dropdown-panel-items scroll-host']//span[(text())='test care 6']";
	
	
	


	
	
	//public static final String beneficiarychoosecaregiver ="//*[@id='a2c4f7d178fd-6']//*[text()='Test Caregiver 6']";
	
	

	
	
	
	
	
	
	
	
	
	
	public static final String beneficiaryfromdate ="//*[text()='From Date']//following-sibling::input"; 
	
	
	public static final String beneficiarytodate ="//*[text()='To Date']//following-sibling::input"; 
	
	
	public static final String beneficiaryfromtime ="//*[text()='From']//following-sibling::ng-select"; 

	
	public static final String beneficiarytotime ="//*[text()='To']//following-sibling::ng-select";
	
	
	public static final String beneficiaryselectfromtime ="//*[text()='01:00']"; 
	
	
	public static final String beneficiaryselecttotime ="//*[text()='03:30']"; 
	
	
	
	
	
	
	
	
	
	public static final String beneficiaryemergencyname ="(//*[@placeholder='Enter the name'])[2]";
	
	
	
	
	
	
	public static final String beneficiaryemergencynumber ="(//*[@placeholder='Enter the Mobile Numbe'])[2]";
	
	
	public static final String beneficiaryattachmenttitle ="//*[@placeholder='Enter the title']";
	
	
	


	
	public static final String beneficiaryattachmentchoosefile ="(//*[text()='Attachments']//parent::h4//following-sibling::div//descendant::input)[2]";
	
	
	public static final String beneficiarysubmit ="//*[text()=' Submit ']";
	
	

	public static final String newbeneficiaryok ="//*[text()='Ok']";
	
	
	
		
	
	
	


	
	
	
}
