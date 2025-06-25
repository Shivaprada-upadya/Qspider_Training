/* A store Prints a bill Product details. It needs to show:
	Prodcut name
	Quantity
	Price per item
	Grade of quanlity
	Available in stck
*/
class ProductDetails
{
public static void main(String [] args)
	{
	String product_name="Pen";
	int quantity=5;
	double no_of_item=55.50;
	int quality=20;
	Boolean in_stock=true;
	System.out.print("Product:"+product_name+" | Quantity:"+quantity+" |Price:"+no_of_item+" each | Quantity:"+quantity+" | In stock:"+in_stock);
	}
}
