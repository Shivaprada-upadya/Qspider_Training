
import java.util.Scanner;

// Write a Program to display employee details where employee holds an information of id, name and salary display three employee details (using methods concept)

public class EmployeesDetail {
    Scanner sc=new Scanner(System.in);
    
    public static void details()
    {
        int j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of Employee:");
        String name=sc.nextLine();
        System.out.println("Enter the id of Employee: ");
        int id=sc.nextInt();
        System.out.println("Enter the salary of Employee: ");
        double salary=sc.nextDouble();

        System.out.println("-----------------------");

        System.out.println((++j)+ "th Employee Details: ");
        System.out.println("Emplyee id: "+id);
        System.out.println("Employee name: "+name);
        System.out.println("Enmployee salary: "+salary);

        System.out.println("----------------");
        
    }

    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Employees details Required: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the "+i+"th Employee Details: ");
            details();
        }
    }
}
