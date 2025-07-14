import java.util.Scanner;
class Atm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("-------------------Welcome to JSP BANK--------------------");
        int pin=1234;
        double actbalace=42000;
        System.out.println("Enter the Pin:");
        int epin=s.nextInt();

        if(epin==pin) {
            System.out.println("----------------PIN MATCHED--------------");
            System.out.println("");
            System.out.println("*************************************************");
            System.out.println("Enter the Choice");
            System.out.println("");
            System.out.println("1. Widthdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Balance Enquiry");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.println("*************************************************");
            int num=s.nextInt();
            switch (num) {
                case 1:System.out.println("1. Widthdraw Money: ");
                        System.out.println("");
                        System.out.println("Enter the amount for Widthdrawal:");
                        double wamt=s.nextDouble();
                        if(wamt<=0){
                            System.out.println(" Please Enter the amount correctly ");
                            System.out.println("*************************************************");
                        }
                        else if(wamt<=actbalace){
                            double Balance=actbalace-wamt;
                            actbalace=Balance;
                            System.out.println("Widthdraw Succesfull");
                            System.out.println("Avalable Balance "+actbalace);  
                            System.out.println("*************************************************");                   
                        }
                        
                        else{
                            System.out.println("----Insufficient Balance----" );
                            System.out.println("");
                            System.out.println("Your balance is "+actbalace);
                            System.out.println("*************************************************");
                        }
                    break;
                case 2:System.out.println("2. Deposit Money");
                        System.out.println("");
                        System.out.println("Enter the Deposit Amount");
                        double damt=s.nextDouble();
                        if(damt<=0){
                            System.out.println(" Please Enter the amount correctly ");
                            System.out.println("*************************************************");
                        }
                        else{
                            double Totalamt=actbalace+damt;
                            actbalace=Totalamt;
                         System.out.println("Avalable Balance "+actbalace);
                         System.out.println("*************************************************");
                        }

                    break;
                case 3:System.out.println("3. Balance Enquiry");
                        System.out.println("Avalable Balance "+actbalace);
                        System.out.println("*************************************************");
                        
                    break;
                case 4:System.out.println("4. Change PIN");
                        System.out.println("Please Enter the OLD PIN");
                        int oldpin=s.nextInt();
                        if(oldpin!=pin){
                                System.out.println("Incorrect PIN");
                            }
                        else if(oldpin==pin){
                            System.out.println("Enter the New PIN");
                            int newpin=s.nextInt();
                            if(newpin>=1000 && newpin<=9999)
                            {
                            for(int i=1;i<=3;i++)
                            {
                                System.out.println("Re-Enter the Pin");
                                int repin=s.nextInt();
                                System.out.println("---------------------------------");
                                if(newpin==repin)
                                {
                                    System.out.println("PIN Change Successfull");
                                    System.out.println("*************************************************");
                                    pin=newpin;
                                    break;
                                    
                                }
                                
                            }
                           
                            }
                            else if(oldpin!=newpin){
                                System.out.println("Incurrent PIN");
                            }
                             else{
                                System.out.println("INVALID PIN LENGTH");
                        }
                        }
                        
                    break;
                case 5:System.out.println("Exited");
                break;

                default:System.out.println("Invalid Option please check and Enter the correct option");
                System.out.println("");
                System.out.println("*************************************************");
                    break;
            }

        }
        else{
            System.out.println("-------------INCURRENET PIN ENTERED-------");
            System.out.println("");
            System.out.println("*************************************************");
        }
    }
        
    }

    