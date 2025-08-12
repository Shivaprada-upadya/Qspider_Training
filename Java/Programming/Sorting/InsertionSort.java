package Java.Programming.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static int [] insertionSort(int arr[])
    {
        for(int i=1;i<=arr.length-1;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }


        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of any array: ");
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        insertionSort(arr);
         System.out.print("Array After Sorting: ");
        System.out.print(Arrays.toString(arr));
    }
}
