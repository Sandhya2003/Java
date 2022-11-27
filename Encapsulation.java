package com.src.main;

public class Encapsulation {
public static void main(String[] args) {
	Emp e1= new Emp();
	e1.setEmpId(3);  // here you are using getters and setters because in class you have used private so you cannot access them.
	e1.setEmpName("Sandhya");
	Emp e2= new Emp();
	e2.setEmpId(5);
	e2.setEmpName("Goutham");
	System.out.println(e1.getEmpId());
	System.out.println(e1.getEmpName());
	System.out.println(e2.getEmpId());
	System.out.println(e2.getEmpName());
}
}
class Emp{
	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
}
