public class pattern15 {
    public static void main(String[] args) {
        // int n=5;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=n;j++)
        //     {
        //         if(i<=j)
        //             System.out.print("* ");
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        int n=5;
        int num=1;
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=n*2-1;j++)
            {
                if(i<=j && i+j<=2*n)
                {
                    if(((i+j)%2)==0)
                        System.out.print("*");
                    else
                        System.out.print(i);
                    
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
