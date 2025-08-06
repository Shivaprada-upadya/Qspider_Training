public class ButterFlyPattern {
    public static void main(String[] args) {
        int str1=1,spc=8,str2=1;
        for(int r=1;r<=9;r++)
        {
            for(int i=1;i<=str1;i++)
                System.out.print("*");

            for(int j=1;j<=spc;j++)
                System.out.print(" ");

            for(int k=1;k<=str2;k++)
                System.out.print("*");
            System.out.println();
            if(r<5)
            {
                str1++;
                str2++;
                spc-=2;
                
            }
            else
            {
                str1--;
                str2--;
                spc+=2;
                
            }
        }
    }
}
