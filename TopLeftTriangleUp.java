import java.util.Scanner;
public class TopLeftTriangleUp{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Rows :");
    int n=sc.nextInt();
    //Left side Right angled up triangle
        for(int i=0;i<n;i++)
        {
         for(int j=0;j<=i;j++){
        System.out.print("*");
         }
        System.out.println();
        }
  }
}
    
    
