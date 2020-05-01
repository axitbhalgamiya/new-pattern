import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class java
 {
   public static void main(String args[])
   { 
    Scanner read = new Scanner (System.in);
    System.out.print(" enter value :");
    int n= read.nextInt();
    int va=1, ch =65;
    for(int i=0;i<n;i++)
  {
    for(int j=0;j<i;j++)
    {
      if(i%2!=0)
      {
        System.out.print(va + " ");
        va=va+2;
      }
      else
      {
        System.out.print((char) ch +" ");
        ch=ch+2;
      }
    }
        System.out.println();
   }
 }
}