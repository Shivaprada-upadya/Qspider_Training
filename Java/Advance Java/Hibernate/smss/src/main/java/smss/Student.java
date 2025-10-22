package smss;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long phone;
	
	
	@OneToMany(mappedBy ="stud")
	@JoinColumn(name="subject_id")
	
	private List<Subject> sub= new ArrayList<Subject>() ;
	
	public Subject getSub() {
		return (Subject) sub;
	}


	public void setSub(Subject sub) {
		this.sub = (List<Subject>) sub;
		
	}

	
	public Student() {
		super();
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



	public Student(String name, String email, long phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone ;
	}

	
	
	
	
}
