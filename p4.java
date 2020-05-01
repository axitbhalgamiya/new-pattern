import java.util.Scanner;
public class p4 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print(" enter value :");
		int n = read.nextInt();
		int i ,j,k,m;
	
		for(i=n;i>=0;i--)
	{
		
		for(m=0;m<n+1;m++)
		if(i<m)System.out.print(" ");
		System.out.print("S");
		for(j=i;j>=0;j--)
		System.out.print("o");
		System.out.print("n");
		for(k=i;k>=0;k--)
		System.out.print("a");
		if(i!=0)
		System.out.println("");
	}
}}