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
    public static void method1(int a,int b,int c)
    {
		System.out.println("In Method 1");		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
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