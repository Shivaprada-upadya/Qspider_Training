/*Calculate  the total price of all the items present in the cart apply the discount to  the total price return the discounted price as an integer where you round of the value 
REQUIRMENTS=   -The price of the item should be in float value
	       -The discount is in int format
	       -The total price after applying the discount needs to be returned in the  int format
	       -Without using Scanner class*/
class Store
	{
	public static void main(String[]args)
		{
		String item1="Lays";
		String item2="Icecream";

		System.out.println("The Items in the cart are...");

		System.out.println(item1);
		System.out.println(item2);

		System.out.println("*************************");
		System.out.println("");

		System.out.println("The price of items are");

		float item1_price=54.45f;
		float item2_price=425.155f;

		System.out.println(item1_price);
		System.out.println(item2_price);
		System.out.println("***************************");
		System.out.println("");

		int discount=50;
		System.out.println("The precentage of discount is "+discount+"%");
		float total_amount=item1_price+item2_price;

		System.out.println("Total amount= "+total_amount);
		System.out.println("*****************************");
		System.out.println("");

		float discounted_amount=total_amount-(total_amount*50/100);

		int total_price=(int)discounted_amount;

		System.out.println("Discounted amount= "+total_price);
		int total=(int)discounted_amount;
		}
	}