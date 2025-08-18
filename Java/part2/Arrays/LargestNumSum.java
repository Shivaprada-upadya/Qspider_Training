public class LargestNumSum {
    public static void calc(int arr1[],int arr2[])
    {
        int i,j;
        int max=0;
        int sum=0;
        for(i=0;i<arr1.length;i++)
        {
            sum=0;
            for(j=0;j<arr2.length;j++)
            {
               sum=arr1[i]+arr2[j];
                if(sum>max)
                    max=sum;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr1[]={1,4,2,6,5};
        int arr2[]={3,4,6,9,5};
        calc(arr1,arr2);
    }
}
