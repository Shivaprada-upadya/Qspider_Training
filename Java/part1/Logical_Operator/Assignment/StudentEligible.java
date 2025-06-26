/*  Write A Program to Check the Student is Eligible for Placement.
    - If the Student CGPA>=7.5
    - And Student not hold any Backlog.
    - Then the Student shoul be Eligible.
    - Only using Logical Operator.
*/


public class StudentEligible {
    public static void main(String[] args) {
        double cgpa=8.57;
        boolean backlog=false;
        boolean eligible= (cgpa>=7.5 && !backlog);
        System.out.println("Is the Student Eligible for the Placement : "+eligible);
    }
}
