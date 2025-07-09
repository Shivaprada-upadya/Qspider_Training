/* Write a Program to Dempnstrate a Calculator with Poerforms the Arithmetic Operation using two Inputs.*/
import java.util.Scanner;
class CalcSwitchcase
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Enter the Operator Symbol: ");
        char opr=sc.next().charAt(0);
        switch(opr)
        {
            case '+': System.out.println(num1+num2);
                      break;
            case '-': if(num1>num2)
                      {
                        System.out.println(num1-num2);
                        break;
                      }
                      else
                      {
                        System.out.println(num2-num1);
                        break;
                      }
            case '*': System.out.println(num1*num2);
                      break;

            case '/': if(num2!=0)
                        {
                            System.out.println(num1/num2);
                            break;
                        }
                        else
                        {
                            System.out.println("Divible by 0 is not Possible !!!");
                            break;
                        }
            case '%': System.out.println(num1%num2);
                    break;
        }
    }

}