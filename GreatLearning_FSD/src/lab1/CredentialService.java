package lab1;

public class CredentialService {
	
	public static String generateEmailAddress(String empfname , String emplname , String dept ) {
			
			String Email = empfname+emplname+"@"+dept+".abc.com" ;
		
		return Email ;
	} 
	
	public static String generatePassword() {
		char capitalLetter;
		char smallLetter;
		int number;
		
		String password = "a";
		return password ;
	}
	
	public static void showCredentials(String empfname , String emplname , String dept) {
		
		System.out.println("Dear " + empfname + " your generated credentials are as follows");
		System.out.println("Email --> " + generateEmailAddress(empfname, emplname, dept));
		System.out.println("Password --> " + generatePassword());
	}
	

}
