package practice;
import java.util.Scanner;
public class arrayprint {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}

}