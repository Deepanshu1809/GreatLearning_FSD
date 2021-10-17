package lab1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee("Harshit", "Choudhary");
		CredentialService cs = new CredentialService();
		String generatedEmail;

		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		String dept = new String();
		
		switch(option) {
		case 1 :
			dept = "tech";
			break;
		
		case 2 :
			dept = "admin";
			break;
		case 3 :
			dept = "hr";
			break;
		case 4 :
			dept = "legal" ;
			break;
}
		
		String empfname = employee.getFirstName().toLowerCase();
		String emplname = employee.getLastName().toLowerCase() ;

		//generatedEmail = cs.generateEmailAddress(empfname , emplname , dept);
		
		cs.showCredentials(empfname , emplname , dept);


	}

}
