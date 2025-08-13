public class Nonstatic {

     int i=10;
    int j=20;
    //Nonstatic nsd=new Nonstatic();
    public void m1()
    {
        System.out.println("In m1");
        System.out.println(i);
       // Nonstatic nsd=new Nonstatic();
        
        System.out.println(j);
    }
   static public void m2()
    {
        System.out.println("In m2");
        Nonstatic nsd=new Nonstatic();
        System.out.println(nsd.i);
        // Nonstatic nsd=new Nonstatic();
        nsd.m1();
    }
    public static void main(String[] args) {
       // Nonstatic nsd=new Nonstatic();
        m2();
    }
}
