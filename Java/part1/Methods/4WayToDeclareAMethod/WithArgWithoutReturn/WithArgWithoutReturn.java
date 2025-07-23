public class WithArgWithoutReturn {
    public static void add(int a,int b)
    {
        int sum=a+b;
        System.out.println("a+b= "+sum);
        return;
    }
    
    public static void main(String[] args) {
        System.out.println("Main Start");
        add(10,20);
        System.out.println("Main End");
    }
}
