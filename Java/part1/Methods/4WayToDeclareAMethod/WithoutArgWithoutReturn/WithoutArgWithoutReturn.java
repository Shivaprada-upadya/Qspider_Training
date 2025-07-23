class WithoutArgWithoutReturn
{
    public static void add()
    {
        int a=10;
        int b=20;
        System.out.println("a+b="+(a+b));
        return;
    }
    public static void main(String[] args) {
        System.out.println("Main Start");
        add();
        System.out.println("Main End");
    }
}