package Lab1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	static List<Employee> emplist=new ArrayList<Employee>();
	SUB sub;
	private int employeeId;
	private String employeeName;
	private int salary;
	private String businessUnit;
	private int age;

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return"Employee Name :"+employeeName+"Employee Id :"+employeeId+
				"Salary :"+salary+"Age :"+age+"Business Unit :"+businessUnit;
		
	}
	public void getsubDetails()
	{
		System.out.println("subName :"+sub.getSubName()+"\n"+"subId : "+sub.getSubId()+"\n"+"subHead :"+ sub.getSubHead());
		
		emplist=sub.getEmplist();
		for(Employee emp:emplist)
		{
			System.out.println(emp);
		}
	
	}
	public SUB getSub() {
		return sub;
	}
	@Autowired
	public void setSub(SUB sub) {
		this.sub = sub;
	}
	
	public void SearchInfo(int Id)
	{
		for(Employee emp:emplist)
		{
			if(Id==emp.employeeId)
			{
				System.out.println(emp);
				break;
			}
		}
	}
	
	

}
