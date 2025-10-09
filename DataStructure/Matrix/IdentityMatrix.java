
 public class IdentityMatrix{
    public static void main(String[] args) {
        int m[][]={{1,0,0},{0,1,0},{0,0,1}};
        boolean check = true;
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {
                if(i==j)
                {
                    if(m[i][j]!=1)
                    {
                        check =false;
                        break;
                    }
                }
                else if(i!=j)
                {
                    if(m[i][j]!=0)
                    {
                        check=false;
                        break;
                    }
                }

            }
            if(!check)
            {
                break;
            }
        }

        System.out.println("Identity Matrix : "+check );
    }
}