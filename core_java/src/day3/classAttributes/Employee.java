package day3.classAttributes;
//bean class is supposed to have all these : private attr , public getter and setter methods ,
//default and parameterized constr,toString method
public class Employee {

	public Employee() {
		
	}
	
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
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	//implement toString method to employee class in order to get the info just by passing the object
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	

    
}
