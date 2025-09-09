//package Java.practice;

public class p15 {
    int a=10;
    void demo()
    {
        a=20;
        System.out.println(a);
    }
    public static void main(String[] args) {
        // System.out.println(10==10.0f);
		// int a=10;
        // System.out.println(a+= a-= a*= a/=2) ;// 
        // System.out.println(1+2+"3"+4+5*0); //3340
        p15 p=new p15();
        p.demo();
        System.out.println(p.a);
        
    }
}
