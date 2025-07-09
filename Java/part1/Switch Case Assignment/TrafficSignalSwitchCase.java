/*  Write a Program to print the Instructions to be follows based on the display color in traffic signal
 "RED" --> "Stop and wait for few seconds".
 "YELLOW" --> "Please be ready to move"
 "GREEN" --> "Thanks for waiting ,you can go now"
*/

import java.util.Scanner;

class TrafficSignalSwitchCase
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String color=sc.next();
        switch(color){
        case "RED": 
                System.out.println("Stop and wait for few seconds");
                break;
        case "YELLOW":
                System.out.println("Please be ready to move");
                break;
        case "GREEN":
                System.out.println("Thanks for waiting ,you can go now");
                break;
        default: System.out.println("Invalid color");
        }
    }
}
