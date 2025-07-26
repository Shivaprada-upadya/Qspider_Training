
import java.util.Scanner;

public class UnitBitCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bin=sc.nextInt();
		int OneCount=0;
		while(bin>0)
		{
			int lastDigit=bin%10;
			if(lastDigit==1)
				OneCount++;
			bin/=10;
		}
		System.out.println(OneCount);
}
}
