class Display5EmployeeDetails{
    int id;
    String name;
    double salary;
    static String cname="Google";

    Display5EmployeeDetails(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.cname=cname;
    }
    public static void main(String[] args) {
        Display5EmployeeDetails e1=new Display5EmployeeDetails(1,"aaa",12345);
        Display5EmployeeDetails e2=new Display5EmployeeDetails(2,"bbb",1345);
        Display5EmployeeDetails e3=new Display5EmployeeDetails(3,"ccc",127475);
        Display5EmployeeDetails e4=new Display5EmployeeDetails(4,"ddd",12445);
        Display5EmployeeDetails e5=new Display5EmployeeDetails(5,"eee",2345);
	System.out.println("5 Employee Details: "+cname);
        System.out.println("1st employee Details: ");
        System.out.println("id: "+e1.id+" \t name: "+e1.name+" \tsalary: "+e1.salary);
        System.out.println("2nd employee Details: ");
        System.out.println("id: "+e2.id+" \t name: "+e2.name+" \tsalary: "+e2.salary);
        System.out.println("3rd employee Details: ");
        System.out.println("id: "+e3.id+" \t name: "+e3.name+" \tsalary: "+e3.salary);
        System.out.println("4th employee Details: ");
        System.out.println("id: "+e4.id+" \t name: "+e4.name+" \tsalary: "+e4.salary);
        System.out.println("5h employee Details: ");
        System.out.println("id: "+e5.id+" \t name: "+e5.name+" \tsalary: "+e5.salary);
    }
}