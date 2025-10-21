
import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int a[]={1,2,3,5,2};
        int b[]={6,7,9,4};
        int c[]=new int[a.length+b.length];

        for(int i=0;i<c.length;i++)
        {
            if(i<a.length)
                c[i]=a[i];
            else    
                c[i]=b[i-a.length];
        }
       // Arrays.sort(c);

        System.out.println(Arrays.toString(c));
    }
}
