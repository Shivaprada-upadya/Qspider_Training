/* Write a Program to Print the Students marks card as instructed below
a) accept the student individual subject marks from the user
b) Print the grade along with the subject mark
95-100 -->A+
90-94--> A
80-89 -->B+
70-79-->B
45-49-->C
35-44-->P
0-34-->F
c) Print the total mark scored by the student
d) Print the aggregate scored by the student 
e) Finally print the student result based on the aggregate
80>&& <=100-->Distinction
75>=&& <80---> First class with distinction
70>= && <75--> First Class
45>= && <70 --> Second Class
0>= && <35--> Result withHeld
kannada,hindi,english,maths,science,socisl science
*/
import java.util.Scanner;
public class StudentMarkIfElseIf {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the 6 subject marks of a Student: ");
	//accept the student individual subject marks from the user
    int mark1=sc.nextInt();
	int mark2=sc.nextInt();
	int mark3=sc.nextInt();
	int mark4=sc.nextInt();
	int mark5=sc.nextInt();
	int mark6=sc.nextInt();

        //Print the total mark scoread by the student
        int total_mark=mark1+mark2+mark3+mark4+mark5+mark6;
        System.out.println("The Total mark of the student is: "+total_mark);
       //Print the aggregate scored by the student
       double grade=(total_mark/6); 
       System.out.println("Agrregade of the Student is: "+grade);

    //Print the grade along with the subject mark
    if(grade>=80 && grade<=100)
    {
        System.out.println("Distinction");
    }
    else if(grade>=75 && grade<=80)
    {
        System.out.println("First class with distinction");
    }
    
    else if(grade>=65 && grade<75)
    {
        System.out.println("First Class");
    }
    
    else if(grade>=35 && grade<65)
    {
        System.out.println("Second Class");
    }
    else if(grade>=0 && grade<35)
    {
        System.out.println("Result withheld");
    }
    
    






    }
}
