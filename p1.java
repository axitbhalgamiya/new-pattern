import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class p1
 {
   public static void main(String args[])
   { 
     Scanner read = new Scanner(System.in);
    int i,j,n;
    System.out.println("enter value");
    n= read.nextInt();
    for (i=0;i<n;i++)
    { for (j=n-i; j>1; j--)
      System.out.print(" ");
    for(j=0;j<=i;j++)
    {
      System.out.print("* ");
    }
    System.out.println();
    }
   }
 }