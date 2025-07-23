
public class WithoutArgWithReturn {
    public static int add()
    {
        System.out.println("In Add()");
        int a=10;
        int b=20;
        int sum=a+b;
        return sum;

    }
    public static void main(String[] args) {
         System.out.println("Main Start");
        System.out.println("Sum of a + b = "+add());
        System.out.println("Main End");
    }
}
