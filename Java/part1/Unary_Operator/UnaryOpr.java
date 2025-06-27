package Java.part1.Unary_Operator;

public class UnaryOpr {
    public static void main(String[] args) {
        int a=20;
        int b=50;
        int c=a++;
        int d=++b;

        System.out.println(a); //21
        System.out.println(b); //51
        System.out.println(c); //20
        System.out.println(d); //51
    }
    
}
