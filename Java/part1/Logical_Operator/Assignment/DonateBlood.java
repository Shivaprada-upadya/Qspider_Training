/*  Write a Program to check the Person is Eligible to Donate Blood.
    - Age should be above or equal to 18.
    - Weight should be atleast 50.
*/
public class DonateBlood {
    public static void main(String[] args) {
       int age=20;
       double weight=65;
       boolean eligible=(age>=18 && weight>=50);
       System.out.println("Is the Person Eligible to Donate Blood: "+eligible); //true 
    }
}
