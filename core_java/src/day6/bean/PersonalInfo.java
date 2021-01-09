package day6.bean;

public class PersonalInfo {

	private String name;
	
	private String maritial_status;
	
	public PersonalInfo() {
		
	}

	public PersonalInfo(String name, String maritial_status) {
		super();
		this.name = name;
		
		this.maritial_status = maritial_status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getMaritial_status() {
		return maritial_status;
	}

	public void setMaritial_status(String maritial_status) {
		this.maritial_status = maritial_status;
	}

	@Override
	public String toString() {
		return "PersonalInfo [name=" + name + ", maritial_status="
				+ maritial_status + "]";
	}
}
