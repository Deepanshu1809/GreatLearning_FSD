package GradedAssessment1;

public class MainClass {

	public static void main(String[] args) {

		System.out.println();
		adminDepartment admin = new adminDepartment();
		System.out.println(" Welcome to " + admin.departmentName());
		System.out.println(admin.getTodayssWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();

		hrDepartment hr = new hrDepartment();
		System.out.println(" Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodayssWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();

		techDepartment tech = new techDepartment();
		System.out.println(" Welcome to " + tech.departmentName());
		System.out.println(tech.getTodayssWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		System.out.println();

	}

}
