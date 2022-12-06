package assignment2;

public class EmployeeDetails 
{
	public void employeeName() 
	{
		String employeeName="Hari Vignesh M";
		System.out.println(employeeName);
	}
	public void employeeAddress() 
	{
		String employeeAddress="Madurai";
		System.out.println(employeeAddress);
	}
	public void employeeSalary()
	{
		double empSalary=40000.5;
		System.out.println(empSalary);
	}
	private void employeeMobileNumber() 
	{
		long empMobNum=9087920092l;
		System.out.println(empMobNum);
	}
	
	
	public static void main(String[] args) 
	{
		EmployeeDetails emp=new EmployeeDetails();
		emp.employeeName();
		emp.employeeAddress();
		emp.employeeSalary();
		emp.employeeMobileNumber();

	}

}
