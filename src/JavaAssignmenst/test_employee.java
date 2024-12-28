package JavaAssignmenst;

public class test_employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee emp = new employee();
		emp.set_Id(-9);
		emp.set_Name("Akhil");
		emp.set_Salary(2400.90);
		System.out.println("Employee ID : " + emp.get_Id());
		System.out.println("Employee Name : " + emp.get_Name());
		System.out.println("Employee Salary : " + emp.get_Salary());
	}

}
