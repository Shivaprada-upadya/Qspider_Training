// Logical Add Operator
//  Date:26/06/2025 
class LogicalAdd
{
    public static void main(String[] args) {
        int a=5;
        int b=30;
        boolean result=(a<b && b==a);
        System.out.println(result);   //false
        System.out.println(10<10 && 5<40 && 30==30);  //false
    }
}