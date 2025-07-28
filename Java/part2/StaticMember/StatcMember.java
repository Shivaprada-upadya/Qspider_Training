// In a Single class
// 3 static variable
// 2 user defined method
/* main()
{
    all the 3 variables should be invoked in both methods/\.
}
*/

class StaticMember{
    static int a=1;
    static int b=2;
    static int c=2;
    public static void method1(int n1,int n2,int n3)
    {
		System.out.println("In Method 1");		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		// method(2);
    }

    public static void method2()
    {
		System.out.println("In Method 2 ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
    }
    public static void main(String[] args) 
    {
		System.out.println("In main Method");
        method1(a,b,c);
		method2();
    }
}