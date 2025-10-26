package smsmanytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer credits;
	private String duration;		
	
	
	@ManyToMany(mappedBy = "subjects")
	private List<Student> students = new ArrayList<Student>();


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getCredits() {
		return credits;
	}


	public void setCredits(Integer credits) {
		this.credits = credits;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}


	public Subject(String name, Integer credits, String duration) {
		super();
		this.name = name;
		this.credits = credits;
		this.duration = duration;
	}


	public Subject() {
		super();
	}


	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", credits=" + credits + ", duration=" + duration
				+ ", students=" + students + "]";
	}
	
	
	
	
}
