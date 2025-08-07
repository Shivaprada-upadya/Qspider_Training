// Write a Program to print the Element present in the array.
public class EvenElementInArray {
    public static void main(String[] args) {   
    int arr[]={10,20,33,41,50};
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]%2==0)
        {
            System.out.println(arr[i]+" ");
        }
    }
    }
}
