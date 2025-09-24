package comparator;

import java.util.Comparator;

public class UserSortingByPriceOnAsc implements Comparator{
	
	@Override
	public int compare(Object o1,Object o2)
	{
		Shoe s1=(Shoe) o1;
		Shoe s2=(Shoe) o2;
		if(s1.price>s2.price)
			return 1;
		else if(s1.price<s2.price)
				return -1;
		else 
			return 0;
	}
}
