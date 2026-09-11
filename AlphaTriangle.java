import java.util.Scanner;
public class AlphaTriangle{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter rows :");
    int n=sc.nextInt();
    char c;
    for(int i=1;i<=n;i++)
    {
      c='A';
      for(int j=1;j<=i;j++)
      {
        System.out.print(c);
        c++;
      }
       System.out.println();
    }
  }
} 
