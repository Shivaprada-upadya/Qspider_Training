// Write a Program to perform all the Arithmetic operation for 2 number
class WithArgWithReturn
{
    static int add(int a,int b)
    {
        int sum=a+b;
        return sum;
    }

    static int sub(int a,int b)
    {
        int sub=a-b;
        return sub;
    }

    static int mul(int a,int b)
    {
        int mul=a*b;
        return mul;
    }

    static double div(int a,int b)
    {
        int div=a/b;
        return div;
    }

    static int mod(int a,int b)
    {
        int mod=a%b;
        return mod;
    }


    public static void main(String[] args) {
        System.out.println(add(20,10));
        System.out.println(sub(10,20));
        System.out.println(mul(20,10));
        System.out.println(div(20,10));
        System.out.println(mod(20,10));
    }
}