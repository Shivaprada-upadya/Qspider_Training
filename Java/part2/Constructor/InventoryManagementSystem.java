public class InventoryManagementSystem {
    String name;
    double price;
    int quantity;

    InventoryManagementSystem(String name,double price,int quantity)
    {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }


    public void productDisplay()
    {
        System.out.println("Product : "+name+", price: Rs."+price+", quantity: "+quantity);
    }

    public double calculation()
    {
        return price*quantity;
    }
    public static void main(String[] args) {
        System.out.println("1st Product Details: ");
        InventoryManagementSystem p1=new InventoryManagementSystem("Laptop",92234.45,2);
        p1.productDisplay();
        System.out.println("Total cost of 1st Product: "+p1.calculation());

        System.out.println("2nd Product Details: ");
        InventoryManagementSystem p2=new InventoryManagementSystem("phone",9234.45,5);
        p2.productDisplay();
        System.out.println("Total cost of 1st Product: "+p2.calculation());

        System.out.println("2nd Product Details: ");
        InventoryManagementSystem p3=new InventoryManagementSystem("tv",22234.45,5);
        p3.productDisplay();
        System.out.println("Total cost of 1st Product: "+p3.calculation());
    }
}
