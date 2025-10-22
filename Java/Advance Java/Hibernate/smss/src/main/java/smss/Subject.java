package smss;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Subject {

	@Id
	private int id;
	private String name;
	private int credit;
	private String duration;
	
	@ManyToOne
	private Student stud;
	
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}
	public Subject() {
		super();
	}
	public Subject(int id, String name, int credit,String duration) {
		super();
		this.id = id;
		this.name = name;
		this.credit = credit;
		this.duration=duration;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	
	
}
