package emss;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	private int id;
	private String loc;
	private String name;
	public Department() {
		super();
	}
	public Department(int id, String loc, String name) {
		super();
		this.id = id;
		this.loc = loc;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", loc=" + loc + ", name=" + name + "]";
	}
	
}
