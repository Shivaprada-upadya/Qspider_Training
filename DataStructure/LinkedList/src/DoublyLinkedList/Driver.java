package DoublyLinkedList;

public class Driver {

	public static void main(String[] args) {
		
		DLL<Integer> dll =new DLL();
		
		dll.add(10);
//		dll.add(20);
//		dll.add(30);
//		dll.add(40);
//		dll.add(50);
		System.out.println(dll);
		
//		System.out.println(dll.reverseOrder());
//
//		DLL<User> ull = new DLL();
//		
//		ull.add(new User("Shivaprada", 101, "shiva@gmail.com"));
//		ull.add(new User("Prada", 102, "prada@gmail.com"));
//		ull.add(new User("kanna", 103, "kanna@gmail.com"));
//		ull.add(new User("krishna", 101, "krishna@gmail.com"));
//		
//		System.out.println(ull);
		
		//Remove at First
//		dll.removeAtFirst();
//		System.out.println(dll);
//		System.out.println(dll.reverseOrder());
		
		//Remove at last
		dll.removeAtLast();
		System.out.println(dll);
		System.out.println(dll.reverseOrder());
	}

}

