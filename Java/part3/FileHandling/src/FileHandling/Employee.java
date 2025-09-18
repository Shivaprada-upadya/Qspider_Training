package FileHandling;

public class Employee {
	
	int eid;
	String ename;
	double salary;
	String email;
	
	public Employee(int eid, String name, double salary, String email) {
		this.eid = eid;
		this.ename = name;
		this.salary = salary;
		this.email = email;
	}
	
	@Override
	public String toString()
	{
		return eid +","+ ename + ","+salary+","+ email+"\n";
	}
	
	
	
}
