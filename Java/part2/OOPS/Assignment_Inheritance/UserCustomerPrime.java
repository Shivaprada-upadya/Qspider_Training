import java.util.Scanner;

class User{
    String username;
    String password;

    User(String username,String password)
    {
        this.username=username;
        this.password=password;
    }




     boolean login(String user,String pass)
    {
        boolean result=this.username.equals(user) && this.password.equals(pass);
        return result;
    }
}

 class Customer extends User{
    String productName;
    double price;

     Customer(String username,String password) {
        super(username, password);
    }
    void selectProduct(String productName,double price)
    {
        this.productName=productName;
        this.price=price;
    }

    double getBill(){
        return price;
    }

    void showDetails()
    {
        System.out.println("Product: "+productName);
        System.out.println("Price: "+price);
    }
    
    
        
}

 class PrimeCustomer extends Customer{

    PrimeCustomer(String username,String password) {
        super(username, password);
    }

     void showDetails()
    {
        System.out.println("Product: "+productName);
        System.out.println("Price: "+price);
    }

    public double getBill()
    {
        return price*0.85;
    }
    
}


class UserCustomerPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);     
        Customer c=new Customer("shiva","1234");
        
        PrimeCustomer pc=new PrimeCustomer("prime1", "abcd");

        System.out.println("Enter the Username: ");
        String cName=sc.next();
        System.out.println("Enter the Password: ");        
        String cPass=sc.next();
        System.out.println("==============================================");

        if(c.login(cName,cPass))
       {
            System.out.println("Login Succesfully done !!!!!   You are a Normal Customer.. ");
            c.selectProduct("Shoe",5000);
            c.showDetails();
            System.out.println("Normal Customer Bill:= "+c.getBill());
       }
        
        else if(pc.login(cName,cPass))
        {
            System.out.println("Login Succesfully done !!!!   You are a Prime Customer.. ");
            pc.selectProduct("Watch",3000);
            pc.showDetails();
            System.out.println("Prime Customer Bill: = "+pc.getBill());
        }
        else
        {
            System.out.println("Login Failed");
        }
    }
}
