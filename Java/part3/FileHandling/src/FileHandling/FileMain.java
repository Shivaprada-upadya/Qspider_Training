package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMain {
	
	public static void  addEmployee(int noOfEmp, FileWriter fw) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<noOfEmp; i++)
		{
			System.out.println("Enter Id, name, salary, email :");
			String data= new Employee(sc.nextInt(),sc.next(),sc.nextDouble(),sc.next()).toString();
			fw.write(data);
		}
		System.out.println("emp's added successfully...");
	}
	
	
	public static void readEmpData(FileReader fr) throws IOException
	{
		
			
		int i = fr.read();
		
		while(i!= -1)
		{
			System.out.print((char) i );
			i = fr.read();
		}
		
		
	}

	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
//		
		System.out.println("Enter no. of Employees...");
		int noOfEmp= sc.nextInt();
//		
//			
		File file = new File("D:\\Github\\Qspider Training\\Java\\File_Output\\empdata.txt");
//		
		FileWriter fw= new FileWriter(file);
//		
		addEmployee(noOfEmp, fw);
		
		
		FileReader fr = new FileReader(file);
		
		readEmpData(fr);
		
		fw.close();
		fr.close();
		sc.close();
		
		
		
	}

}
