package JavaAssignmenst;

public class employee {
private	int id;
private	String name;
private	double salary;
	public employee() {
		salary = 3000;	
	}
	public void set_Id(int e_id) {
		if(e_id>=0)
		 id = e_id;
		else
			System.out.println("ID cannot be negative number");
		
	}
	public void set_Name(String e_name) {
		 name = e_name;
			
	}
	public void set_Salary(double e_salary) {
		if(e_salary>3000)
		 salary = e_salary;
		
	}
	
	public int get_Id() {
		return id;
		
	}
	public String get_Name() {
		return name;
			
	}
	
	public double get_Salary() {
		return salary;
		
	}


}

