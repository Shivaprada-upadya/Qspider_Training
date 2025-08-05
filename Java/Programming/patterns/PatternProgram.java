public class PatternProgram {
    public static void main(String[] args) {
        int str=9, spc=0;
        for(int r=1;r<=9;r++)
        {
            for(int i=1;i<=spc;i++)
                System.out.print(" ");

            for(int j=1;j<=str;j++)
                System.out.print("*");

            System.out.println(" ");
        

        if(r<5)
        {
            str-=2;
            spc++;
        }
        else{
            str+=2;
            spc--;
        }

    }

    }
}
