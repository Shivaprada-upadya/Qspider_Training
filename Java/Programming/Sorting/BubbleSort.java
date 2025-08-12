//package Java.Programming.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
     public static int[] bubbleSort(int arr[])
     {
    for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    return arr;
     }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of any array: ");
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        System.out.print("Array After Sorting: ");
        System.out.print(Arrays.toString(arr));
    }
}
