
public class primitiveNonPrimitive {
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static boolean bool;
    static char ch;
    static String str; 

    public static void main(String[] args) {
        primitiveNonPrimitive obj=new primitiveNonPrimitive();
        System.out.println("Byte default value: "+b);
        System.out.println("Short default value: "+s);
        System.out.println("Int default value: "+i);
        System.out.println("Long default value: "+l);
        System.out.println("Float default value: "+f);
        System.out.println("Double default value: "+d);
        System.out.println("Char default value: "+ch);
        System.out.println("Boolean default value: "+bool);
        System.out.println("=======================");
        
        System.out.println("String default value: "+str);
        System.out.println("Object default value:"+obj);
    }
}
