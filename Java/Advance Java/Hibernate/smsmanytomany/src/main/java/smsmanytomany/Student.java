package smsmanytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.security.auth.Subject;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private long phone;
	
//	@JoinTable(name= "student_subject",
//			   joinColumns = @JoinColumn(name="student_id"),
//			   inverseJoinColumns = @JoinColumn(name= "subject_id"))
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Subject> subjects = new ArrayList<Subject>();

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	
	
	
	public Student(List<Subject> subjects) {
		super();
		this.subjects = subjects;
	}

	public Student(String name, String email, long phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", subjects="
				+ subjects + "]";
	}
	
	
}
