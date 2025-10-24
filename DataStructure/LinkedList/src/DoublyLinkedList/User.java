package DoublyLinkedList;

public class User {

	String name;
	int id;
	String email;
	
	public User(String name, int id, String email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", email=" + email + "]";
	}
	
}
