package lab1;

public class Employee {
	String fname;
	String lname;

	public String getFirstName() {
		return fname;
	}

	public void setFirstName(String firstName) {
		this.fname = firstName;
	}

	public String getLastName() {
		return lname;
	}

	public void setLastName(String lastName) {
		this.lname = lastName;
	}

	public Employee(String empfname, String emplname) {
		this.fname = empfname;
		this.lname = emplname;
	}
}
