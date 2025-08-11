import java.util.Arrays;
public class DublicateArrayElement
{
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]=new int[arr1.length];       
        for(int i=0;i<=arr1.length-1;i++)
        {
            
            arr2[arr1.length-i-1]=arr1[i];
            
        }
        /*  for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        } */

        System.out.println(Arrays.toString(arr2));
    }
}

