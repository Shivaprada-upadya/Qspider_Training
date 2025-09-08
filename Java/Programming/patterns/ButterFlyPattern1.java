public class ButterFlyPattern1 {
    public static void main(String[] args) {
        int n=5;
        for(int r=1;r<=n*2-1;r++)
        {
            for(int c=1;c<=n*2;c++)
            {
                if(r>=c && r+c<=n*2 || r<=c && r+c>=n*2)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
