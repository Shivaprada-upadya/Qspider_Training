package TreeMapExample;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


class UserSorting implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1,Integer o2)
	{
		return o1>o2? -1: o1<o2?1:0;
	}
}





public class TreeMap1 {

	public static void main(String[] args) {
		
		Map<Integer,String> tmap =new TreeMap(new UserSorting());
		
		tmap.put(1, "shiva");
		tmap.put(10, "upadya");
		tmap.put(50, "shivaprada upadya");
		tmap.put(100, "kanna");
		tmap.put(200, "ayyyo");		
		
		Set<Entry<Integer,String>> entries=tmap.entrySet();
		
		for(Map.Entry<Integer, String> entry: entries)
		{
			System.out.println(entry);
		}
		
	}

}
