// Create 3 Class 
// in all the 3 class declare 1 static variable and 1 static method respectively
// Perform a reinitialization for the varibale which is present in 2nd class.
// and invoke all the members inside a main methods
class FirstClass
{
	static int class1Variable=1;
	public static void FirstClassMethod()
	{
		System.out.println("In First Class Method");
		System.out.println("class1Varibale= "+class1Variable);
		System.out.println("class2Varibale= "+SecondClass.class2Variable);
		System.out.println("class3Varibale= "+ThirdClass.class3Variable);
	}
}


class SecondClass
{
	static char class2Variable='a';
	public static void SecondClassMethod()
	{
		System.out.println("In Second Class Method");
		FirstClass.class1Variable=20;
		ThirdClass.class3Variable="prada";
		System.out.println("class1Varibale= "+FirstClass.class1Variable);
		System.out.println("class1Varibale= "+class2Variable);
		System.out.println("class1Varibale= "+ThirdClass.class3Variable);
	}
}


class ThirdClass
{
	
	static String class3Variable="shiva";
	public static void ThirdClassMethod()
	{
		System.out.println("In Third Class Method");
		System.out.println("class1Varibale= "+FirstClass.class1Variable);
		System.out.println("class2Varibale= "+SecondClass.class2Variable);
		System.out.println("class3Varibale= "+ThirdClass.class3Variable);
		
	}
}




class  Main
{
	public static void main(String[] args) 
	{
		System.out.println("In Main Method");
		FirstClass.FirstClassMethod();
		SecondClass.SecondClassMethod();
		ThirdClass.ThirdClassMethod();
	}
}
