package HashMap;

import java.util.HashMap;
import java.util.Map;







public class OccuranceOFNumber {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,3,2,4,2,4,3,4,5};
		
		HashMap<Integer,Integer> hmap=new HashMap();
		for(int i=0;i<a.length;i++)
		{
			
			if(!hmap.containsKey(a[i]))
			{
				hmap.put(a[i],1);
			}
			else
			{
				hmap.put(a[i],hmap.get(a[i])+1 );
			}
			
		}
		
		for(Map.Entry<Integer, Integer> entry:hmap.entrySet())
		{
			System.out.println(entry);
		}
		
		
		System.out.println(hmap);

	}

}
