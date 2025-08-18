public class MaxDiff 
{
    public static void calc(int arr1[])
    {
        int i,j;
        int maxDiff=Integer.MIN_VALUE;
        
            for( i=0;i<arr1.length;i++)
            {
            for(j=0;j<arr1.length-1;j++)
            {
               int diff=arr1[i]-arr1[j];
                if(diff>maxDiff)
                    maxDiff=diff;
            }
        }
            System.out.println(maxDiff);
        }
        
    
    public static void main(String[] args) {
        int arr1[]={1,4,2,6,5};
        
        calc(arr1);
    }
}
