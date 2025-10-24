package DoublyLinkedList;

public class DLL<T> {

	Node head;
	Node tail;
	
	public void add(T data)
	{
		Node<T> node =new Node<T>(data);
		
		if(head==null)
		{
			head = node;
			tail= node;
		}
		else
		{
			tail.next= node;
			node.prev = tail;
			tail = node;
		}
	}
	
	@Override
	public String toString()
	{
		if(head==null)
		{
			return "[]";
		}
		String res="[";
		Node temp = head;
		while(temp.next!=null)
		{
			res=res+temp.data+" ,";
			temp= temp.next;
		}
		res = res+temp.data+"]";
		return res;
	}
	
	

	public String reverseOrder()
	{
		if(head==null)
		{
			return "[]";
		}
		String res="[";
		Node temp = tail;
		while(temp.prev!=null)
		{
			res=res+temp.data+" ,";
			temp= temp.prev;
		}
		res = res+temp.data+"]";
		return res;
	}
	
	public void removeAtFirst()
	{
		Node temp =head.next;
		temp.prev =null;
		head= temp;
		
	}
	
	
	public void removeAtLast()
	{
		if(head==null)
		{
			System.out.println("No element present");
		}
		if(head.next==null)
		{
			head=null;
			tail=null;
		}
		else {
		Node temp = tail;
		
		temp = temp.prev;
		
		temp.next= null;
		
		tail = temp;
		}
		
	}
	
}
