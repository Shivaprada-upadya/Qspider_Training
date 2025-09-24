package HashMap;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap= new HashMap();
		
		hmap.put(1,"shiva");
		hmap.put(11,"prada");
		hmap.put(111,"shivaprada");
		hmap.put(1111,"kanna");
		
		
		
		
		System.out.println(hmap);
		
		
		
HashMap<Integer,String> hmap1= new HashMap();
		
		hmap1.put(2,"shiva");
		hmap1.put(22,"prada");
		hmap1.put(222,"shivaprada");
		hmap1.put(2222,"kanna");
		
		
		hmap1.putAll(hmap);
		
		System.out.println(hmap1);
		
		
		
		
	}

}
