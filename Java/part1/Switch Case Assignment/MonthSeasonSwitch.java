/* Write a Prohram to Print the Season Name Based on Month Name  */
import java.util.Scanner;
public class MonthSeasonSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Month Name :");
        String monthName=sc.next();
        switch(monthName)
        {
            case "MARCH":            
            case "APRIL": 
            case "MAY": 
            case "JUNE": System.out.println("Summer Season");
            break;
            case "JULY": 
            case "AUGUST": 
            case "SEPTEMBER": 
            case "OCTOBER": System.out.println("Rainy Season");
            break;
            case "NOVEMBER": 
            case "DECEMBER": 
            case "JANUARY": 
            case "FEBRAURY": System.out.println("Winter Season");
            break;
            default: System.out.println("Invalid Month Name"); 
        }
        sc.close();
    }
}
