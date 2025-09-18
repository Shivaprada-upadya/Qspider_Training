package section3.iterator;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println(a1);
		 
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+" ");
		}
		
		a1.remove((Object) 10);
		System.out.println(a1);
		
		ArrayList<Integ>

	}

}
