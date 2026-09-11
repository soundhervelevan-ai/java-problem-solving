import java.util.Scanner;
public class PyramidDown{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter rows :");
    int n=sc.nextInt();
    //Down pyramid
    for(int i=n;i>0;i--)
    {
      String  pattern="";
      for(int s=0;s<n-i;s++)
      {
        pattern+=" ";
      }
      for(int j=0;j<2*(i)-1;j++)
      {
        pattern+="*";
      }
      System.out.println(pattern);
    }
  }
}
    
    
