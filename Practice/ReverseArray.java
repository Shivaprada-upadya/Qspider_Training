import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int arr[])
    {
        int left=0, right=arr.length-1;
        while(left<=right)
        {
            if(arr[left]!=arr[right])
            {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp; 
            }         
        left++;
        right--; 
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5};
        reverse(arr);
    }
}
