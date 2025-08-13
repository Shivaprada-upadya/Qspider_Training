class Demo
{
	int i=50;
	public void m1()
{
	System.out.println("m1 is in demo class");
}


}

class Sample extends Demo
{
String s="java";

public void m2()
{
	System.out.println("m2 is in sample class");
}
}

class SingleLevelInheritance
{
	public static void main(String[] args) {
		Sample s=new Sample();
		s.m2();
	}
}