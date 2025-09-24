package comparator;

import java.util.TreeSet;

public class Shop {

	public static void main(String[] args) {
		
		UserSortingByPriceOnAsc ascPrice=new UserSortingByPriceOnAsc();
		
		TreeSet<Shoe> t =new TreeSet(ascPrice);
		
		t.add(new Shoe(1,"puma",9000));
		t.add(new Shoe(15,"adidas",12000));
		t.add(new Shoe(1,"bata",300));
		t.add(new Shoe(1,"nike",6000));
		
		for(Shoe s: t)
				System.out.println(s);
		
		
	}

}
